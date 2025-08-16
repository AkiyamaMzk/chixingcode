package chixing.day10220.day20.hmwk.Q4;

public class Rider {
    private String riderId;
    private String riderName;
    private boolean isRiderAvailable;
    private int currentOrderCount;
    private int[] riderLocation = new int[2];
    private int riderMaxCapacity;

    public Rider(String riderId, String riderName, int[] riderLocation, int riderMaxCapacity) {
        this.riderId = riderId;
        this.riderName = riderName;
        this.isRiderAvailable = true;
        this.currentOrderCount = 0;
        this.riderLocation = riderLocation;
        this.riderMaxCapacity = riderMaxCapacity;
    }

    public String getRiderId() {
        return riderId;
    }

    public String getRiderName() {
        return riderName;
    }

    public boolean isRiderAvailable() {
        return isRiderAvailable;
    }

    public int getCurrentOrderCount() {
        return currentOrderCount;
    }

    public int[] getRiderLocation() {
        return riderLocation;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    public void setRiderAvailable(boolean isRiderAvailable) {
        this.isRiderAvailable = isRiderAvailable;
    }

    public void setRiderLocation(int[] riderLocation) {
        this.riderLocation = riderLocation;
    }

    public void setCurrentOrderCount(int currentOrderCount) {
        this.currentOrderCount = currentOrderCount;
        if (currentOrderCount == riderMaxCapacity)
            setRiderAvailable(false);
        else
            setRiderAvailable(true);
    }

    public int getRiderMaxCapacity() {
        return riderMaxCapacity;
    }

    public void setRiderMaxCapacity(int riderMaxCapacity) {
        this.riderMaxCapacity = riderMaxCapacity;
    }

}
