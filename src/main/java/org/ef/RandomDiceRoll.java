package org.ef;


import java.security.SecureRandom;

public class RandomDiceRoll {

    SecureRandom random = new SecureRandom();
    private int lowRoll = 1;
    private int highRoll = 6;

    public RandomDiceRoll() {}
    public RandomDiceRoll(int highNumber){
    }

    public int[] handle6SideDice(int howMany){
        int[] dice = new int[howMany];
        for (int i = 0;  i <dice.length; i++){
            dice[i] = sixSideRoll();
        }
        return dice;
    }

    private int sixSideRoll(){
        this.lowRoll = 1;
        this.highRoll = 6;
        return random.nextInt(lowRoll, highRoll + 1);
    }

    private int getRandom(int lowRoll, int highRoll){
        return this.random.nextInt(lowRoll,highRoll+1)*6;
    }
}
