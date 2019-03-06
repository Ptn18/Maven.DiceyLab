import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void incrementBin() {
        //Given
        Bins bin = new Bins(2,12);

        //When
        Integer binNumber = 3;
        bin.incrementBin(binNumber);
        Integer expected = 1;
        Integer actual = bin.getBin(binNumber);

        //
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void incrementBinMultiple() {
        //Given
        Bins bin = new Bins(2,12);

        //When
        Integer binNumber = 4;
        bin.incrementBin(binNumber);
        bin.incrementBin(binNumber);
        bin.incrementBin(binNumber);
        Integer expected = 3;
        Integer actual = bin.getBin(binNumber);

        //
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void incrementBinMultipleThree() {
        //Given
        Bins bin = new Bins(3,18);

        //When
        Integer binNumber = 4;
        bin.incrementBin(binNumber);
        bin.incrementBin(binNumber);
        bin.incrementBin(binNumber);
        Integer expected = 3;
        Integer actual = bin.getBin(binNumber);

        //
        Assert.assertEquals(expected,actual);
    }

}