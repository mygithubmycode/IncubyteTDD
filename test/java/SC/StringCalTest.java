package SC;

import SC.StringCal;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringCalTest {
    @Test
    public void ifEmptyStringReturnZero(){
        Assert.assertEquals(0, StringCal.add(""));
    }
    @Test
    public void ifOneNumberReturnNumber(){
        Assert.assertEquals(3, StringCal.add("3"));
    }
    @Test
    public void ifTwoNumbersReturnSum(){
        Assert.assertEquals(2+3, StringCal.add("2,3"));
    }
    @Test
    public void AllowUnknownNumbers(){
        Assert.assertEquals(2+3+5+8, StringCal.add("2,3,5,8"));
    }
    @Test
    public void NewlinesInsteadofCommas(){
        Assert.assertEquals(2+3+5, StringCal.add("2n3,5"));
    }

}


