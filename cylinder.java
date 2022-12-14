public class Main {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.55,7.25);
        Circle circle = new Circle(3.75);
        System.out.println("the volume is: " + cylinder.getArea());
        System.out.println("the volume is: " + circle.getArea());

        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

    }

}


//--------------------------------------------------------------------------

public class Circle {
    private double radius;

    public Circle(double radius) {
        if(this.radius < 0){
            this.radius = 0;
        }else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
//----------------------------------------------

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea() * height;
    }
}
