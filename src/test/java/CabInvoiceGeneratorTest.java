import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTime_CalculateFare_ReturnTrueIfCorrectlyCalculated(){
        Ride cabRide = new Ride(10 , 5);
        InvoiceGenerator runnerObject = new InvoiceGenerator();
        int totalFare = runnerObject.calculateFare(cabRide);
        Assert.assertEquals(105, totalFare);
    }

}
