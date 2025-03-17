public class Bai5 {
    interface Colorable{
        void color();
    }
    static class Circle implements Colorable {
        double radius;
        @Override
        public void color() {
            System.out.println("Circle is red");
        }
    }
    static class Square implements Colorable {
        double side;
        @Override
        public void color() {
            System.out.println("Square is blue");
        }
    }
    static class Rectangle implements Colorable {
        double length;
        double width;
        @Override
        public void color() {
            System.out.println("Rectangle is green");
        }
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color();

        Square square = new Square();
        square.color();

        Rectangle rectangle = new Rectangle();
        rectangle.color();
    }
}
