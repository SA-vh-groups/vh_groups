/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sa.vh.model;

import org.sa.vh.Parameter.EnemyParameter;
import org.sa.vh.action.Action;

/**
 *
 * @author Salister
 */
public class Enemy {

    EnemyParameter parameter;

    public EnemyParameter getParameter() {
        return parameter;
    }

    public void setParameter(EnemyParameter parameter) {
        this.parameter = parameter;
    }

    public void underAttack(Action action) {
        action.active();
    }

    public void attack() {
        System.out.println("enemy is attack");
    }

    public Object think() {
        return null;
    }
}
