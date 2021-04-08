public class InvoiceGenerator {

    public static final int COST_PER_KILOMETER = 10;
    public static final int COST_PER_MINUTE = 1;

    public double calculateFare(Ride currentRide) {
        double currentRideFare = (currentRide.getDistance()*COST_PER_KILOMETER + currentRide.getTime()*COST_PER_MINUTE);
        return currentRideFare > 5 ? currentRideFare : 5;
    }

    public double calculateFare(Ride[] cabRides) {
        double totalFare = 0;
        for (Ride cabRide : cabRides) {
            totalFare += this.calculateFare(cabRide);
        }
        return totalFare;
    }

    public EnhancedInvoice calculateEnhancedInvoice(Ride[] cabRides) {
        EnhancedInvoice currentEnhancedInvoice = new EnhancedInvoice();
        return  currentEnhancedInvoice;
    }
}
