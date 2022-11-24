public abstract class Circle extends Shape{

    protected double radius;
    private double pi;

    public Circle (){
        this.radius=radius;
        this.pi=pi;
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
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getArea(double radius, double pi){
        return this.getPi() * this.getRadius();
    };

    public  getPerimeter(){
        return getPerimeter();
    };


    @Override
    public String toString() {
        return "Shape [color=" + filled + radius + "]";
    }


}
