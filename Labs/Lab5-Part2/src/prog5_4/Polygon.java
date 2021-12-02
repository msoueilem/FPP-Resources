package prog5_4;

import java.util.Arrays;

public interface Polygon {
    //returns in an array all sides of the polygon
    //example: For a rectangle, return would be [width, width,
    // length, length]
    public double[] getArrayOfSides();
    //returns the sum of the values in arr
    static double sum(double[] arr){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    };
    //returns the perimeter of the polygon
    default double computePerimeter(){
        return sum(getArrayOfSides());
    };
}
