
public class Circle implements Shape {

    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * r * r);
    }

    public static void main(String[] args) {
        Circle c = new Circle(21);
        c.calculateArea();
    }
}
