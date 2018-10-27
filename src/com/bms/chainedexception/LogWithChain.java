package com.bms.chainedexception;

import com.bms.chainedexception.exceptions.GirlFriendOfManagerUpsetException;
import com.bms.chainedexception.exceptions.ManagerUpsetException;
import com.bms.chainedexception.exceptions.NoLeaveGrantedException;
import com.bms.chainedexception.exceptions.TeamLeadUpsetException;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class LogWithChain {

    public static void main(String[] args) throws Exception {
        getLeave();
    }

    private static void getLeave() throws NoLeaveGrantedException {
        try {
            howIsTeamLead();
        } catch (TeamLeadUpsetException e) {
            throw new NoLeaveGrantedException("Leave not sanctioned.", e);
        }
    }

    private static void howIsTeamLead() throws TeamLeadUpsetException {
        try {
            howIsManager();
        } catch (ManagerUpsetException e) {
            throw new TeamLeadUpsetException("Team lead is not in good mood", e);
        }
    }

    private static void howIsManager() throws ManagerUpsetException {
        try {
            howIsGirlFriendOfManager();
        } catch (GirlFriendOfManagerUpsetException e) {
            throw new ManagerUpsetException("Manager is in bad mood", e);
        }
    }

    private static void howIsGirlFriendOfManager() throws GirlFriendOfManagerUpsetException {
        throw new GirlFriendOfManagerUpsetException("Girl friend of manager is in bad mood");
    }
}
