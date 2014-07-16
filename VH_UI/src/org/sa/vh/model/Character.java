/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sa.vh.model;

import java.util.List;
import org.sa.vh.Parameter.Parameter;

/**
 *
 * @author Salister
 */
public class Character {

    Parameter parameter;

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }
    
    public List getThink() {
        return null;
    }
    
    public Object think(List list) {
        return null;
    }
    
    public void attack() {
        System.out.println("Character is attack");
    }
}
