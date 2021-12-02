package prog5_2_startup;

public final class Rectangle extends ClosedCurve{
    private final double width;
    private final double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    double computeArea() {
        return width*height;
    }
}
