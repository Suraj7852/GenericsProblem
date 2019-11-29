import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void given3NumberWillReturnGreaterNumberAmong3() {
        MaximumNumber<Integer> maximumNumber1 = new MaximumNumber<>(5, 3, 6, 8, 5, 2, 7, 5, 9);
        Assert.assertEquals(new Integer(9),maximumNumber1.findMaximum());

        MaximumNumber<Integer> maximumNumber2 = new MaximumNumber<>(5, 3, 10, 8, 5, 2, 7, 5, 9);
        Assert.assertEquals(new Integer(10),maximumNumber2.findMaximum());

        MaximumNumber<Integer> maximumNumber3 = new MaximumNumber<>(15, 3, 6, 8, 5, 2, 7, 5, 9);
        Assert.assertEquals(new Integer(15),maximumNumber3.findMaximum());
   }

    @Test
    public void given3FloatNumberWillReturnGreaterNumberAmong3() {
        MaximumNumber<Double> maximumNumber1 = new MaximumNumber<>(15.0, 3.3, 6.2, 8.2, 5.9, 2.6, 7.1, 5.3, 9.5);
        Assert.assertEquals(new Double(15.0),maximumNumber1.findMaximum());

        MaximumNumber<Double> maximumNumber2 = new MaximumNumber<>(15.0, 30.3, 6.2, 8.2, 5.9, 2.6, 7.1, 5.3, 9.5);
        Assert.assertEquals(new Double(30.3),maximumNumber2.findMaximum());

        MaximumNumber<Double> maximumNumber3 = new MaximumNumber<>(15.0, 3.3, 6.2, 8.2, 51.9, 2.6, 7.1, 5.3, 9.5);
        Assert.assertEquals(new Double(51.9),maximumNumber3.findMaximum());
    }

    @Test
    public void given3StringWillReturnGreaterStringAmong3() {
        MaximumNumber<String> maximum1 = new MaximumNumber<>("zafar", "suraj", "akshay", "rupali", "rohan");
        Assert.assertEquals("zafar",maximum1.findMaximum());

        MaximumNumber<String> maximum2 = new MaximumNumber<>("akshay", "suraj", "zafar", "rupali", "rohan");
        Assert.assertEquals("zafar",maximum2.findMaximum());

        MaximumNumber<String> maximum3 = new MaximumNumber<>("rohan", "suraj", "akshay", "rupali", "zafar");
        Assert.assertEquals("zafar",maximum3.findMaximum());
    }
}
