package powerpackage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class powertest {
    @Test
    public void one_raised_to_one_is_one() {
        Assertions.assertEquals(1, PowerFinder.getPowerOf(1,1));
    }

    @Test
    public void two_raised_to_one_is_two() {
        Assertions.assertEquals(2, PowerFinder.getPowerOf(2,1));
    }

    @Test
    public void two_raised_to_two_is_four() {
        Assertions.assertEquals(4, PowerFinder.getPowerOf(2, 2));
    }

    @Test
    public void three_raised_to_two_is_nine() {
        Assertions.assertEquals(9, PowerFinder.getPowerOf(3, 2));
    }
}
