
public class Triangle implements Shape {

    int b;
    int h;

    public Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public void calculateArea() {
        System.out.println(0.5 * b * h);
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(11, 10);
        t.calculateArea();
    }
}
