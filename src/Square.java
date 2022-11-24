public class Square extends Rectangle {

    private double side = this.lenght;

    public Square (){
        this.side=1.0;
    };
    public Square (double side){
        this.side=side;
    }
    public Square (double side, String color, boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLenght(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return " Square[" + "Rectangle[" + "Shape[" + "color= " + color + "," +
                " filled= " + filled + "]" + "," +
                " width = " + width + "," +
                " length = " + lenght +
                "]" + "]" ;
    }
}
