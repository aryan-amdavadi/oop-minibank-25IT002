public abstract class Shape {
    public abstract double area();
    public abstract String getName();
}

class Circle extends Shape {
    private double r;
    public Circle(double r) { this.r = r; }
    public double area() { return Math.PI * r * r; }
    public String getName() { return "Circle(r=" + r + ")"; }
}

class Rectangle extends Shape {
    private double w, h;
    public Rectangle(double w, double h) { this.w = w; this.h = h; }
    public double area() { return w * h; }
    public String getName() { return "Rectangle(" + w + "x" + h + ")"; }
}
