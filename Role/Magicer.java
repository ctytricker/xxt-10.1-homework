package com.cm2;

class Magicer extends Role{
    private int grand;

    public Magicer(){

    }

    public Magicer(String name,int grand) {
        super();
        this.grand = grand;
    }

    public int getGrand() {
        return grand;
    }

    public void setGrand(int grand) {
        if(grand >= 1 && grand <= 10){
            this.grand = grand;
        }
    }
    @Override
    public int attack() {
        return getGrand() * 5;
    }

}
