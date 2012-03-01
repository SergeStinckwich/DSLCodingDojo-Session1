import junit.framework.Assert;
import org.junit.Test;

public class FunctionSequenceDSLTest {
    /* DSL final
    computer();
      processor();
        cores(2);
        i386();
      disk();
        size(150);
      disk()
	size(75);
        speed(7200);
        sata();
    */

@Test
public final void testTruth() {
	Assert.assertEquals(true, true);
	}

@Test
    public final void testComputerWithoutDevices()
    {
	Computer c = ComputerBuilder.scriptComputerWithoutDevices();
       	Assert.assertEquals(c.getDisks(), null);
       	//Assert.assertEquals(c.getProcessor(), null);
    }

}