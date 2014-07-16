/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sa.vh.manager;

import java.util.List;
import org.sa.vh.model.Character;
import org.sa.vh.model.Enemy;

/**
 *
 * @author Salister
 */
public class Rounder {

    Character player;
    Enemy enemy;
    
//    我方的行動
//
//思考目前能量狀態(HP之類)
//思考目前數值狀態(意思 恐懼 羞恥)
//思考目前參數狀態(優柔不斷 勇猛)
//思考對方的狀態(強健 汙穢 異形)
//得出所有行動的百分比
//
//將所有行動排序
//從中選出一項行動
//
//開始行動
//決定行動的真正成功率
//決定行動影響結果
//
//行動
//計算敵方的所有反映
//計算敵方選擇的反應
//
//開始反映
//計算兩方行動之後的結果
//
//顯示結果
//
//交換回合
//敵方的行動

    public Rounder(Character player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }
    
    public void nextRound() {
        // HP低於0
        if (player.getParameter().getHp() < 0) {
            return;
        }
        
        //腳色選擇行動
        List charThink = player.getThink();
        Object p = player.think(charThink);
        
        //開始行動
        
    }
}
