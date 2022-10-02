package com.cm.d1;

public class Tri {
    private int x;
    private int y;
    private int z;

    public Tri(){}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Tri(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String showInfo(int x,int y,int z){
        if(x + y > z && Math.abs(x - y) < z){
            return "Triangle[" + x + "," + y + "," + z + "]";
        }else{
            return "捕获的异常信息为：构不成三角形";
        }
    }

}
