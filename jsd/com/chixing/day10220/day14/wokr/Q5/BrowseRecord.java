package chixing.day10220.day14.wokr.Q5;

public class BrowseRecord {
    private int userId;
    private String actionType;
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getActionType() {
        return actionType;
    }
    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
    public BrowseRecord(int userId, String actionType) {
        this.userId = userId;
        this.actionType = actionType;
    }
    

}
