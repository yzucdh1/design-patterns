package com.msb.state.table;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/7/27 10:21
 */
public class Main {

    public static void main(String[] args) {
        MarioStateMachine marioStateMachine = new MarioStateMachine();
        System.out.println(marioStateMachine.getCurrentState());
        System.out.println(marioStateMachine.getScore());

        System.out.println("==============================");

        marioStateMachine.obtainFireFlower();
        System.out.println(marioStateMachine.getCurrentState());
        System.out.println(marioStateMachine.getScore());

        System.out.println("==============================");

        marioStateMachine.meetMonster();
        System.out.println(marioStateMachine.getCurrentState());
        System.out.println(marioStateMachine.getScore());
    }
}
