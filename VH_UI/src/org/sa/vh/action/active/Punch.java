/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sa.vh.action.active;

import org.sa.vh.action.Action;
import org.sa.vh.model.Character;

/**
 *
 * @author Salister
 */
public class Punch extends Action {

    public Punch() {
        power = 15.0f;
    }
    
    @Override
    public void active() {
        System.out.println("enemy is punched!!");
    }

    @Override
    public void calculateWeight(Character character) {
        if (character.getParameter().getEnergy()> 50.0f) {
            weight = 5.0f;
        } else {
            weight = 3.0f;
        }
    }

}
