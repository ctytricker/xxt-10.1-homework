
class Triangle implements Shape{
    private int a;
    private int b;
    private int c;


public Triangle(){ }
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPrimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c) );
    }

    @Override
    public double getPrimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle["+ a + "," + b + "," + c + "]\n"+
                "Area=" + String.format("%.2f",getArea())
                +"\nPrimeter=" + String.format("%.2f",getPrimeter()) + "\n";
    }
}