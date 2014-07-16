/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sa.vh.model.enemyGroup;

import org.sa.vh.Parameter.EnemyParameter;
import org.sa.vh.model.Enemy;

/**
 *
 * @author Salister
 */
public class Goblin extends Enemy {

    public Goblin() {
        super();

        EnemyParameter p = new EnemyParameter();
        p.setHp(100);

        setParameter(p);
    }

}
