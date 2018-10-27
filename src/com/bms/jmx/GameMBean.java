package com.bms.jmx;

/** Created - 27/10/2017
 * @author BMS Team
 */
public interface GameMBean {

    public void playFootball(String clubName);

    public String getPlayerName();

    public void setPlayerName(String playerName);

}
