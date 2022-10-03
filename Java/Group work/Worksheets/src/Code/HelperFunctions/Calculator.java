package Code.HelperFunctions;

import java.util.Arrays;

public class Calculator<dblarr> {

    //dbl1In || d1In
    public double divide(double x, double y){
        return x / y;
    }
    public double multiply(double x, double y){
        return x * y;
    }
    public double multiplyArray(double [] doubles){
        return Arrays.stream(doubles).sum();
    }
//    public double add(double x, double y){
//        return x + y;
//    }

    public double add(double [] doubles){
        return Arrays.stream(doubles).sum();
    }

    public double subtract(double x, double y){
        return x - y;
    }
    public double areaOfCircle(double radius){
        return Math.PI*Math.pow(radius,2);
    }
    public double distanceBetweenPoints(double x1, double y1, double x2, double y2){
        return Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
