package KKPracticeSet.ConditionalLoop03;
import java.lang.Math;
class Circle{
    int rad;

    public int getRad() {
        return rad;
    }
    public void setRad(int rad) {
        this.rad = rad;
    }
    
    void areaOfCircle(){
        float area = (float) (Math.PI*(rad*rad));
        System.out.println("Area of circle is: "+area);
    }
}

class PerimeterOfCircle extends Circle{
    void perimeterCircle(){
        float peri=(float)(2*(Math.PI*rad));
        System.out.println("Perimeter of circle: "+peri);
    }
}

class VolumeOfCone extends Circle{
    int height;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    void volumeCone(){
        float vol=(float)(0.333*(Math.PI*rad*rad*height));
        System.out.println("Volume of cone is: "+vol);
    }
    
}
class VolumeOfRightcylinder extends Circle{
    int height;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    void volumeRightcylinder(){
        float vol=(float)(Math.PI*rad*rad*height);
        System.out.println("Volume of Rightcylinder is: "+vol);
    }
    
}
class VolumeOfSphere extends Circle{
    
    void volumeSphere(){
        float vol=(float)(1.333*(Math.PI*rad*rad*rad));
        System.out.println("Volume of Sphere is: "+vol);
    }
    
}
class VolumeOfcylinder extends Circle{
    int height;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    void volumeCylinder(){
        float vol=(float)(2*Math.PI*rad*height);
        System.out.println("Volume of cylinder is: "+vol);
    }
    
}

class Triangle{
    int base;
    int height;

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    void areaOfTriangle(){
        float area = (float) (0.5*base*height);
        System.out.println("Area of triangle is: "+area);
    }
}
class IsoscelesTriangle extends Triangle{
    void areaOfIsoscelesTriangle(){
        float area = (float) ((base*height)/2);
        System.out.println("Area of Isosceles triangle is: "+area);
    }
}
class EquilateralTriangle extends Triangle{
    void areaOfEquilateralTriangle(){
        float area = (float) ((1.73/4)*(base*base));
        System.out.println("Area of Equilateral triangle is: "+area);
    }
}
class PerimeterOfEquilateralTriangle extends Triangle{
    void perimeterEquilateralTriangle(){
        float peri=(float)(3*base);
        System.out.println("Perimeter of EquilateralTriangle: "+peri);
    }
}
class VolumeOfPrism extends Triangle{
    void volumePrism(){
        float vol=(float)(base*height);
        System.out.println("Volume of prism is: "+vol);
    }
    
}

class Rectangle{
    int length;
    int width;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    void areaOfRectangle(){
        float area = (float) (width*length);
        System.out.println("Area of Rectangle is: "+area);
    }
    
}
class PerimeterOfRectangle extends Rectangle{
    void perimeterRectangle(){
        float peri=(float)(2*(width+length));
        System.out.println("Perimeter of Rectangle: "+peri);
    }
}


class Parallelogram{
    int base;
    int height;

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    void areaOfParallelogram(){
        float area = (float) (base*height);
        System.out.println("Area of Parallelogram is: "+area);
    }
}
class Rhombus extends Parallelogram{
//we can use base and height from parallelogram.
    void areaOfRhombus(){
        float area = (float) (base*height);
        System.out.println("Area of Rhombus is: "+area);
    }
}
class PerimeterOfParallelogram extends Parallelogram{
    int side;

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    
    void perimeterParallelogram(){
        float peri=(float)(2*(base+side));
        System.out.println("Perimeter of Parallelogram: "+peri);
    }
}


public class Shape {
    public static void main(String[] args) {
        VolumeOfcylinder vc=new VolumeOfcylinder();
        vc.setHeight(4);
        vc.setRad(5);
        vc.volumeCylinder();
    }
    
}
