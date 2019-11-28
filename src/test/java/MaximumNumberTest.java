import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void given3NumberWillReturnGreaterNumberAmong3() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer maxNumber = maximumNumber.findMaxNumber(6,8,9);
        Assert.assertEquals(new Integer(9),maxNumber);

        Integer maxNumber1 = maximumNumber.findMaxNumber(6,10,2);
        Assert.assertEquals(new Integer(10),maxNumber1);

        Integer maxNumber2 = maximumNumber.findMaxNumber(12,8,9);
        Assert.assertEquals(new Integer(12),maxNumber2);
    }

    @Test
    public void given3FloatNumberWillReturnGreaterNumberAmong3() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Double doubleNumber = maximumNumber.findMaxDoubleNumber(1.1, 2.2, 3.2);
        Assert.assertEquals(new Double(3.2),doubleNumber);

        Double doubleNumber1 = maximumNumber.findMaxDoubleNumber(3.2, 2.2, 1.1);
        Assert.assertEquals(new Double(3.2),doubleNumber1);

        Double doubleNumber2 = maximumNumber.findMaxDoubleNumber(1.1, 3.2, 3.2);
        Assert.assertEquals(new Double(3.2),doubleNumber2);
    }

    @Test
    public void given3StringWillReturnGreaterStringAmong3() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String maxString = maximumNumber.findMaxString("anish", "suraj", "zafar");
        Assert.assertEquals("zafar",maxString);

        String maxString1 = maximumNumber.findMaxString("zafar", "suraj", "anish");
        Assert.assertEquals("zafar",maxString1);

        String maxString2 = maximumNumber.findMaxString("anish", "zafar", "suraj");
        Assert.assertEquals("zafar",maxString2);
    }
}
