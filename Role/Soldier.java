package com.cm2;

class Soldier extends Role{
    private int sol_attack = 3;


    public Soldier(){ }
    public Soldier(String name){
        super.name = name;
    }

    @Override
    public int attack() {
        return sol_attack;
    }
}
