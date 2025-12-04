
public class Rectangle implements Shape {

    int l;
    int b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public void calculateArea() {
        System.out.print(l * b);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        r.calculateArea();
    }
}
