package com.area.crystallum.config;

public class configsouls {

    //just trying to get an output

    private static double soulsPerDamage;
    private static double maxSoulDamage;
    private static double attackDamage;

    configsouls() {
        this.soulsPerDamage = 1;
        this.maxSoulDamage = 30;
        this.attackDamage = 0;
    }

    public static double getSoulsPerDamage() {
        return soulsPerDamage;
    }

    public static double getMaxPerDamage() {
        return maxSoulDamage;
    }

    public static void setAttackDamage(double soulsPerDamage) {
        attackDamage = attackDamage + soulsPerDamage;
    }

    public static double getAttackDamage() {
        return attackDamage;
    }



}
