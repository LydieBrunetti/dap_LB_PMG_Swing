/**
 * 
 */
package fr.hoc.dap.Boutons;

/**
 * @author house
 *
 */
public class DapData {

    private static DapData instance;

    private DapData() {
    }

    public static DapData getInstance() {
        if (instance == null) {
            instance = new DapData();
        }
        return instance;
    }

    private String userKey;

    /**
     * @return the userKey
     */
    public String getUserKey() {
        return userKey;
    }

    /**
     * @param userKey the userKey to set
     */
    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

}
