public abstract class Circle extends Shape{

    protected double radius;
    private double pi = 3.14;

    public Circle (double radius,String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public Circle (double radius){
        this.radius=radius;
    }

    public Circle (){
        this.radius=1.0;
    };


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getArea(double radius, double pi){
        return this.getPi() * this.getRadius();
    };

    public double getPerimeter(double pi, double radius){
        return 2 * this.getPi() * this.getRadius() ;
    };


    @Override
    public String toString() {
        return "Shape [color=" + filled + radius + "]";
    }


}
