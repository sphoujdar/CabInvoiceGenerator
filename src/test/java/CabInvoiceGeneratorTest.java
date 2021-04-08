import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTime_CalculateFare_ReturnTrueIfCorrectlyCalculated(){
        Ride cabRide = new Ride(10 , 5);
        InvoiceGenerator runnerObject = new InvoiceGenerator();
        double totalFare = runnerObject.calculateFare(cabRide);
        Assert.assertEquals(105, totalFare , 0);
    }

    @Test
    public void givenMultipleRides_CalculateFare_ReturnTrueIfCorrectlyCalculated(){
        Ride cabRide1 = new Ride(10 , 5);
        Ride cabRide2 = new Ride(0.1 , 1);
        Ride cabRide3 = new Ride(2 , 3);
        Ride[] cabRides = {cabRide1,cabRide2,cabRide3};
        InvoiceGenerator runnerObject = new InvoiceGenerator();
        double totalFare = runnerObject.calculateFare(cabRides);
        Assert.assertEquals(130, totalFare, 0);
    }

}
