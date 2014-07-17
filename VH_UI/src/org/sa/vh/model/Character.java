/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sa.vh.model;

import java.util.List;
import org.sa.vh.Parameter.Parameter;
import org.sa.vh.action.Action;

/**
 *
 * @author Salister
 */
public abstract class Character {

    Parameter parameter;

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    /**
     * 首先列出可能的選項
     * 在去除當下不可能的選項
     * 最後將每個選項列出權重比
     * <p>
     * @return
     */
    public abstract List<Action> getThink();

    public abstract Action think(List<Action> list);

    public abstract void attack();

    public abstract void attackFeedBack(Object p);

    public abstract void underAttack(Object t);
}
