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

}
