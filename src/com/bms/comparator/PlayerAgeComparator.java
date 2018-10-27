package com.bms.comparator;

import java.util.Comparator;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class PlayerAgeComparator implements Comparator<Player> {

    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
       return (firstPlayer.getAge() - secondPlayer.getAge());
    }

}
