/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vh_ui;

import org.sa.vh.Parameter.Parameter;
import org.sa.vh.manager.Rounder;
import org.sa.vh.model.Character;
import org.sa.vh.model.Enemy;
import org.sa.vh.model.enemyGroup.Goblin;
import org.sa.vh.model.playerGroup.Hero;
import org.sa.vh.talent.PersonParameter;
import org.sa.vh.talent.PersonParameter.Talent;

/**
 *
 * @author Salister
 */
public class VH_UI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Character c = new Hero();
        Enemy e = new Goblin();

        Rounder r = new Rounder(c, e);
        r.nextRound();
        r.nextRound();
        r.nextRound();
        
    }
    
}
