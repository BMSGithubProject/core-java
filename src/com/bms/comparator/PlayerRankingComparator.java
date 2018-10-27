package com.bms.comparator;

import java.util.Comparator;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class PlayerRankingComparator implements Comparator<Player> {

    @Override
    public int compare(Player firstPlayer, Player secondPlayer) {
       return (firstPlayer.getRanking() - secondPlayer.getRanking());
    }

}
