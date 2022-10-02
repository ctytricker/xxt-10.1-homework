class Cylinder{
    private double height;
    private Shape shape;

    public  Cylinder(){ }
    public Cylinder(double height, Shape shape) {
        super();
        this.height = height;
        this.shape = shape;
    }

    public double getVolume(){
        return shape.getArea() * height;
    }

    public String toString(){
        return shape.toString() + "Volume=" + String.format("%.2f",getVolume());
    }
}
