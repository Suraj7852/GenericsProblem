import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void given3NumberWillReturnGreaterNumberAmong3() {
        Integer maxNumber = MaximumNumber.findMaximum(6,8,9);
        Assert.assertEquals(new Integer(9),maxNumber);

        Integer maxNumber1 = MaximumNumber.findMaximum(6,10,2);
        Assert.assertEquals(new Integer(10),maxNumber1);

        Integer maxNumber2 = MaximumNumber.findMaximum(6,8,19);
        Assert.assertEquals(Integer.valueOf(19),maxNumber2);
   }

    @Test
    public void given3FloatNumberWillReturnGreaterNumberAmong3() {
        Double doubleNumber = MaximumNumber.findMaximum(1.1, 2.2, 3.2);
        Assert.assertEquals(new Double(3.2),doubleNumber);

        Double doubleNumber1 = MaximumNumber.findMaximum(3.2, 2.2, 1.1);
        Assert.assertEquals(new Double(3.2),doubleNumber1);

        Double doubleNumber2 = MaximumNumber.findMaximum(1.1, 3.2, 3.2);
        Assert.assertEquals(new Double(3.2),doubleNumber2);
    }

    @Test
    public void given3StringWillReturnGreaterStringAmong3() {
        String maxString = MaximumNumber.findMaximum("akshay", "suraj", "zafar");
        Assert.assertEquals("zafar",maxString);

        String maxString1 = MaximumNumber.findMaximum("zafar", "suraj", "akshay");
        Assert.assertEquals("zafar",maxString1);

        String maxString2 = MaximumNumber.findMaximum("akshay", "zafar", "suraj");
        Assert.assertEquals("zafar",maxString2);
    }
}
