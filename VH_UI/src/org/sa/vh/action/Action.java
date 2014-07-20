/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sa.vh.action;

import org.sa.vh.model.Character;

/**
 *
 * @author Salister
 */
public abstract class Action {

    /**
     * 權重 表示此行動的可能性
     */
    protected float weight;
    protected float power;
    protected float cost;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPower() {
        return power;
    }

    public float getCost() {
        return cost;
    }

    public abstract void calculateWeight(Character character);

    public abstract void active();
}
