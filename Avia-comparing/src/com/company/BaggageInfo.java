package com.company;

public class BaggageInfo {
    String aviacompanyName;
    String comfortClass;
    int weight;

    public BaggageInfo(String aviacompanyName, String comfortClass, int weight) {
        this.aviacompanyName = aviacompanyName;
        this.comfortClass = comfortClass;
        this.weight = weight;
    }

    public BaggageInfo() {
    }

    public String getAviacompanyName() {
        return aviacompanyName;
    }

    public void setAviacompanyName(String aviacompanyName) {
        this.aviacompanyName = aviacompanyName;
    }

    public String getComfortClass() {
        return comfortClass;
    }

    public void setComfortClass(String comfortClass) {
        this.comfortClass = comfortClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "Aviacompany = " + aviacompanyName +
                ", Class = " + comfortClass +
                ", Weight = " + weight;
    }
}
