package prog5_4;

public final class Square extends ClosedCurve implements Polygon{
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}

	@Override
	public double[] getArrayOfSides() {
		double side = this.side;
		double[] arr = new double[4];
		arr[0] = side;
		arr[1] = side;
		arr[2] = side;
		arr[3] = side;
		return arr;
	}
}
