public class EnhancedInvoice {
    public int numberOfRides;
    public double totalFare;
    public double averageFarePerRide;

    public EnhancedInvoice(Ride[] cabRides) {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        this.numberOfRides = cabRides.length;
        this.totalFare = invoiceGenerator.calculateFare(cabRides);
        this.averageFarePerRide = this.totalFare/this.numberOfRides;
    }

    public EnhancedInvoice(Ride cabRide) {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        this.numberOfRides = 1;
        this.totalFare = invoiceGenerator.calculateFare(cabRide);
        this.averageFarePerRide = this.totalFare;
    }
}
