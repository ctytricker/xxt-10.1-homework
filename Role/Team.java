package com.cm2;

class Team {
    static int i = 0;
    static Soldier[] member = new Soldier[6];
    public boolean addMember(Soldier soldier){
        if(i < member.length){
            member[i++] = soldier;
            return true;
        }else {
            return false;
        }

    }

    public int attackSum(Magicer magicer){
        int sum = 0;
        for(int j = 0;j < i; j++){
            sum += member[j].attack();
        }
    return sum + magicer.attack();
    }

}
