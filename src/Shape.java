public abstract class Shape {

    private String color;
    private boolean filled;

    Shape () {
        this.color="red";
        this.filled= true;}

    Shape (String color, boolean filled) {
        this.color=color;
        this.filled=filled;}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract void getArea(double area);
    public abstract void getPerimeter(double perimeter);

    @Override
    public String toString() {
        return "Shape [color=" + filled + "]";
    }


}
