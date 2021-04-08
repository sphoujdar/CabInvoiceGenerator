import java.util.Optional;

public class Ride {
    private double distance;
    private int time;
    private boolean premiumRide;

    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }

    public Ride(double distance, int time, boolean premium) {
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
