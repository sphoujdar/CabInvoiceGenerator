public class InvoiceGenerator {

    public static final int COST_PER_KILOMETER = 10;
    public static final int COST_PER_MINUTE = 1;

    public int calculateFare(Ride currentRide) {
        return currentRide.getDistance()*COST_PER_KILOMETER + currentRide.getTime()*COST_PER_MINUTE;
    }
}
