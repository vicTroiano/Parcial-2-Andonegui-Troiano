public abstract class Rectangle extends Shape {

    protected double width;
    protected double lenght;

    public Rectangle (){
        this.width=1.0;
        this.lenght=1.0;
    };
    public Rectangle (double width,double lenght){
        this.width=width;
        this.lenght=lenght;
    }
    public Rectangle (  double width, double lenght, String color, boolean filled){
        this.width=width;
        this.lenght=lenght;
        this.color=color;
        this.filled=filled;
    }


    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLenght() {
        return lenght;
    }
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea(double radius, double pi){
        return this.getPi() * this.getRadius();
    };


}
