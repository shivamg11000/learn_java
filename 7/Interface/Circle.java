package shapes;

public class Circle implements Shape{
    private int radius;
    
    public Circle(int r){
        this.radius = r;
    }

    public double area(){
        return 3.14 * this.radius * this.radius;        
    }
}