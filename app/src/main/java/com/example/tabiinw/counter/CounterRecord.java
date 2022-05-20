package com.example.tabiinw.counter;

public class CounterRecord {
    private String counterAimText; //text note for counter aim
    private int counterAimInteger; // Integer, what user must to get
    private int currentProgress;
    private int maxProgress;

    public CounterRecord(String counterAimText, int counterAimInteger, int currentProgress, int maxProgress) {
        this.counterAimText = counterAimText;
        this.counterAimInteger = counterAimInteger;
        this.currentProgress = currentProgress;
        this.maxProgress = maxProgress;
    }

    /**
     * This constructor must be used for making new CounterRecord if you want fill data after him create
     * Else you must to use constructor before this
     */
    public CounterRecord(){
        setCounterAimText("None");
        setCounterAimInteger(0);
        setCurrentProgress(0);
        setMaxProgress(0);
    }

    public String getCounterAimText() {
        return counterAimText;
    }

    public void setCounterAimText(String counterAimText) {
        this.counterAimText = counterAimText;
    }

    public int getCounterAimInteger() {
        return counterAimInteger;
    }

    public void setCounterAimInteger(int counterAimInteger) {
        this.counterAimInteger = counterAimInteger;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(int currentProgress) {
        this.currentProgress = currentProgress;
    }

    public int getMaxProgress() {
        return maxProgress;
    }

    public void setMaxProgress(int maxProgress) {
        this.maxProgress = maxProgress;
    }

    @Override
    public String toString() {
        return "CounterRecord{" +
                "counterAimText='" + counterAimText + '\'' +
                ", counterAimInteger=" + counterAimInteger +
                ", currentProgress=" + currentProgress +
                ", maxProgress=" + maxProgress +
                '}';
    }
}
