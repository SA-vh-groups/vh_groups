/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.sa.vh.model.playerGroup;

import org.sa.vh.Parameter.Parameter;
import org.sa.vh.model.Character;

/**
 *
 * @author Salister
 */
public class Hero extends Character{

    public Hero() {
        super();
        
        Parameter p = new Parameter();
        p.setHp(100);
        
        setParameter(p);
    }
    
    
}
