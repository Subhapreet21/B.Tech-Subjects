import { LightningElement, wire } from 'lwc';
import getTopProducts from '@salesforce/apex/DashboardController.getTopProducts';
import { loadScript } from 'lightning/platformResourceLoader';
import Chart_JS from '@salesforce/resourceUrl/Chart_JS';

export default class TopProductsChart extends LightningElement {
    topProducts;
    error;
    chart;
    chartJsLibrary;

    @wire(getTopProducts)
    wiredTopProducts({ error, data }) {
        if (data) {
            this.topProducts = data;
            this.error = undefined;
            this.initializeChart();
        } else if (error) {
            this.error = error.body && error.body.message ? error.body.message : 'An unknown error occurred';
            this.topProducts = undefined;
        }
    }

    // Load Chart.js script
    initializeChart() {
        if (this.chartJsLibrary) {
            // Chart.js library is already loaded
            this.createChart();
        } else {
            loadScript(this, Chart_JS)
                .then(() => {
                    // Save the loaded script reference for future use
                    this.chartJsLibrary = window.Chart;
                    this.createChart();
                })
                .catch(error => {
                    this.error = 'Error loading Chart.js: ' + (error.body.message || error);
                });
        }
    }

    createChart() {
        if (!this.topProducts || this.topProducts.length === 0) {
            this.error = 'No product data available';
            return;
        }

        // Extract product names and sales from the data
        const productNames = this.topProducts.map(product => product.productName);
        const sales = this.topProducts.map(product => product.sales);

        // Get the canvas element for rendering the chart
        const canvas = this.template.querySelector('canvas');

        // Chart.js configuration
        const data = {
            labels: productNames,
            datasets: [{
                label: 'Sales',
                data: sales,
                backgroundColor: 'rgba(75, 192, 192, 0.2)',
                borderColor: 'rgba(75, 192, 192, 1)',
                borderWidth: 1
            }]
        };

        const options = {
            responsive: true,
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        };

        // Destroy the existing chart to avoid overlap when re-rendering
        if (this.chart) {
            this.chart.destroy();
        }

        // Create the chart
        this.chart = new this.chartJsLibrary(canvas, {
            type: 'bar',
            data: data,
            options: options
        });
    }
}
