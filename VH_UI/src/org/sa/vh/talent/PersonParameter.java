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

        sober,
        enthusiasm,
        indifferent,
        focus,
        unresponsive,
        brave,
        cowardice,
        impulse,
        steady;

        public static String toString(Talent talent) {
            switch (talent) {
                case enthusiasm:
                    return "熱情";
                case indifferent:
                    return "冷漠";
                case focus:
                    return "專心的";
                case unresponsive:
                    return "反應遲鈍";
                case brave:
                    return "勇敢";
                case cowardice:
                    return "怯懦";
                case impulse:
                    return "衝動";
                case steady:
                    return "穩重";
                case sober:
                    return "冷靜";
                default:
                    return talent.toString();
            }

        }
    }
    
    public enum Mood {
        pleasure,
        anger,
        grief,
        horror;
        
        public static String toString (Mood mood) {
            switch (mood) {
                case pleasure:
                    return "歡樂";
                case anger:
                    return "憤怒";
                case grief:
                    return "悲傷";
                case horror:
                    return "恐懼";
                default:
                    return mood.toString();
            }
        } 
    }
}
