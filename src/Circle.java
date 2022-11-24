public class Circle extends Shape{

    protected double radius;

    public Circle(){
        this.radius=radius;
    }
    public Circle (){
        this.radius=1.0;
    };

    public Circle (double radius,String color, boolean filled){
    this.radius=radius;
    this.color=color;
    this.filled=filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getArea(double area);
    public void getPerimeter(double perimeter);


    @Override
    public String toString() {
        return Circle [ color + filled  + "su radio es" + radius];
    }
}
