public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5,"red",false);
        Shape s2 = new Square(); //carga usando setters
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        Shape s4 = new Square(6.6);
        Shape s5 = new Shape() { //chequear - me crea override
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

    }
}
