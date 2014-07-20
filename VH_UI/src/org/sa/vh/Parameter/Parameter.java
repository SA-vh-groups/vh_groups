/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sa.vh.Parameter;

/**
 * 基礎參數，代表單位的能量數值
 * <p>
 * @author Salister
 */
public class Parameter {

    /**
     * 體力，代表當前可行動的能量
     * 體力越高越有利於行動，行動會消耗體力
     */
    float energy;
    
    /**
     * 健康，代表單位的生命
     * 健康為0代表死亡，一般健康度不太會被下降
     */
    float health;
    
    /**
     * 活力，類似新陳代謝的狀況
     * 活力越高，恢復體力的速度就越快，活力越大意味者越能快速恢復狀況
     */
    float vitality;

    public float getEnergy() {
        return energy;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getVitality() {
        return vitality;
    }

    public void setVitality(float vitality) {
        this.vitality = vitality;
    }
    
    public float addEnergy(float f) {
        energy -= f;
        return energy;
    }

    
    private String name;
    private float value;

}
