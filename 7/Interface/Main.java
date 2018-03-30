package shapes;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(2));
        shapes.add(new Square(2));
        shapes.add(new Square(5));
        System.out.println(roundOff(areaSum(shapes)) );
    }

    public static double areaSum(ArrayList<Shape> shapes){
        double sum = 0;
        for (Shape s : shapes){
            sum += s.area();
        }
        return sum;
    }
    public static double roundOff(double no){
        return Math.floor(no * 100) / 100;
    }
}