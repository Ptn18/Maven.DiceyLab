import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class DiceTest {
    private Dice dice;
    private Random random;

    @Test
    public void testToss() {
        random = new Random(1999);
        dice = new Dice(3, random);
        Integer expectedSum = 15;
        Integer actual = dice.tossAndSum();

        Assert.assertEquals(expectedSum, actual);
    }

    @Test
    public void testToss2() {
        random = new Random(199);
        dice = new Dice(3, random);
        Integer expectedSum = 15;
        Integer actual = dice.tossAndSum();


        Assert.assertEquals(expectedSum, actual);


    }
}
