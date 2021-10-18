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
}

