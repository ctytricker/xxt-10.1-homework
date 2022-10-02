
class Rectangle implements Shape{

    private int length;
    private int width;

    public Rectangle(){}
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

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

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPrimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle[" + length + "," + width + "]\n" +
                "Area=" + String.format("%.2f",getArea()) +
                "\nPrimeter=" + String.format("%.2f",getPrimeter()) +"\n";
    }
}