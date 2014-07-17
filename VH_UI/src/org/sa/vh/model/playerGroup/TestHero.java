/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sa.vh.model.playerGroup;

import java.util.ArrayList;
import java.util.List;
import org.sa.vh.Parameter.Parameter;
import org.sa.vh.action.Action;
import org.sa.vh.action.active.Punch;
import org.sa.vh.model.Character;

/**
 *
 * @author Salister
 */
public class TestHero extends Character {

    public TestHero() {
        super();

        Parameter p = new Parameter();
        p.setHp(100);

        setParameter(p);
    }

    public void attack() {
        System.out.println("Character is attack");
    }

    public void attackFeedBack(Object p) {
        System.out.println("Character has feedback");
    }

    public void underAttack(Object t) {
        System.out.println("Character is under Attack!!");
    }

    /**
     * 列出所有可選的行動
     * @return 
     */
    @Override
    public List<Action> getThink() {
        ArrayList<Action> list = new ArrayList<>();
        list.add(new Punch());
        return list;
    }

    /**
     * 做出一個選擇來行動
     * @param list
     * @return 
     */
    @Override
    public Action think(List<Action> list) {
        /**
         * 對於每一個可能的行動，由最高的比重開始選擇，若選中則結束
         */
        for (Action action : list) {
            return action;
        }
        return null;
    }

}
