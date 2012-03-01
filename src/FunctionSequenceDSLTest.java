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
       	Assert.assertEquals(c.getProcessor(), null);
    }
@Test
    public final void testComputerWithProcessor()
    {
	Computer c = ComputerBuilder.scriptComputerWithProcessor();
        Assert.assertEquals(c.getProcessor().getCores(), 1);
	Assert.assertEquals(c.getProcessor().getType(), Processor.Type.i386);
    }

@Test
    public final void testComputerWithProcessorOf2CoresAndi686()
    {
	Computer c = ComputerBuilder.scriptComputerWithProcessorOf2CoresAndi686();
        Assert.assertEquals(c.getProcessor().getCores(), 2);
	Assert.assertEquals(c.getProcessor().getType(), Processor.Type.i686);
    }

@Test
    public final void testComputerWithProcessorOf2CoresAndi586()
    {
	Computer c = ComputerBuilder.scriptComputerWithProcessorOf2CoresAndi686();
        Assert.assertEquals(c.getProcessor().getCores(), 2);
	Assert.assertEquals(c.getProcessor().getType(), Processor.Type.i686);
    }
    
}