package javaweek8sandip.pro19cylinder;

public class Circle {
    double radius;

    Circle(double r){

        this.radius = r > 0? r: 0;
    }

    public double getRadius(){

        return this.radius;
    }

    public double getArea(){

        return this.radius * this.radius * Math.PI;
    }
}
