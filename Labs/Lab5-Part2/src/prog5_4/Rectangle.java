package prog5_4;

public final class Rectangle extends ClosedCurve implements Polygon{
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

    @Override
    public double[] getArrayOfSides() {
        double width = this.width;
        double height = this.height;
        double[] arr = new double[4];
        arr[0] = width;
        arr[1] = height;
        arr[2] = width;
        arr[3] = height;
        return arr;
    }
}
