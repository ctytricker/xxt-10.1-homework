import java.text.DecimalFormat;

class Circle implements Shape {
    private int radius;

    public Circle(){}
    public Circle(int radius){
        super();
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPrimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + radius + "]\n"
                + "Area=" + String.format("%.2f",getArea()) + "\n"
                + "Primeter=" + String.format("%.2f",getPrimeter()) + "\n";
    }
}
