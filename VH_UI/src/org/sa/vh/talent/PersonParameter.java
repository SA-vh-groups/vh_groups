/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sa.vh.talent;

/**
 *
 * @author Salister
 */
public class PersonParameter {

    public enum Talent {

        sober;

        public static String toString(Talent talent) {
            switch (talent) {
                case sober:
                    return "冷靜";
                default:
                    return talent.toString();
            }

        }
    }
}
