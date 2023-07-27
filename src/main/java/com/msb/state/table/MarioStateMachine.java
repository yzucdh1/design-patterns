package com.msb.state.table;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2023/7/27 8:57
 */
public class MarioStateMachine {

    private State currentState;

    private int score;

    public MarioStateMachine() {
        this.currentState = State.SMALL;
        this.score = 0;
    }

    private static final State[][] transitionTable = {
            {State.SUPER, State.CAPE, State.FIRE, State.SMALL},
            {State.SUPER, State.CAPE, State.FIRE, State.SMALL},
            {State.CAPE, State.CAPE, State.CAPE, State.SMALL},
            {State.FIRE, State.FIRE, State.FIRE, State.SMALL}
    };

    private static final int[][] actionTable = {
            {100, 200, 300, 0},
            {0, 200, 300, -100},
            {0, 0, 0, -200},
            {0, 0, 0, -300}
    };

    public void obtainMushRoom() {
        executeEvent(Event.GOT_MUSH_ROOM);
    }

    public void obtainCape() {
        executeEvent(Event.GOT_CAPE);
    }

    public void obtainFireFlower() {
        executeEvent(Event.GOT_FIRE_FLOWER);
    }

    public void meetMonster() {
        executeEvent(Event.MEET_MONSTER);
    }

    public State getCurrentState() {
        return currentState;
    }

    public int getScore() {
        return score;
    }

    private void executeEvent(Event event) {
        int currentStateValue = this.currentState.getValue();
        int eventValue = event.getValue();
        this.currentState = transitionTable[currentStateValue][eventValue];
        this.score += actionTable[currentStateValue][eventValue];
    }
}
