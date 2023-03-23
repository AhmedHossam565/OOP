public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSides(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    @Override
    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2.0;
        double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = this.side1 + this.side2 + this.side3;
        return perimeter;
    }
}