package com.example.assignment01.answer;

public class SuperMan implements Hero{


    private String powerLevel;
    private Integer experience;

    public SuperMan(String powerLevel, Integer experience) {
        this.powerLevel = powerLevel;
        this.experience = experience;
    }

    public String getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(String powerLevel) {
        this.powerLevel = powerLevel;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    @Override
    public void action() {

        System.out.println("Superman with power level " + powerLevel+" and "+ experience+ " years of experience is flying!");

    }
}
