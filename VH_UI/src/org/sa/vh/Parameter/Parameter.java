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

    float hp;
    float sp;

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getSp() {
        return sp;
    }

    public void setSp(float sp) {
        this.sp = sp;
    }
    
    private String name;
    private float value;

}
