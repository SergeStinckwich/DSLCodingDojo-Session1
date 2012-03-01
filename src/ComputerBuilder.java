public class ComputerBuilder 
{
    public static Computer current;

    static public void computer()
    {
	current = new Computer(null, null);
    }
    static public void processor()
    {
	current = new Computer(new Processor(1, Processor.Type.i386), null);
    }

    static public void cores(int nbr_cores)
    {
	current = new Computer(new Processor(nbr_cores, Processor.Type.i686), null);
    }

    static public void i686()
    {
	current = new Computer(new Processor(current.getProcessor().getCores(), Processor.Type.i686), null);
    }

    static public void i586()
    {
	current = new Computer(new Processor(current.getProcessor().getCores(), Processor.Type.i586), null);
    }

    static public void disk()
    {
	Processor p = current.getProcessor();
	Computer c = new Computer(p, new Disk[1]);
	current = c;
    }

    static public void size(int s)
    {
	current.getDisks()[0] = new Disk(s, 0, Disk.Interface.SATA);
    }


    static public Computer scriptComputerWithoutDevices() 
    {
	computer();
	return current;
    }
    
    static public Computer scriptComputerWithProcessor()
    {
	computer();
	   processor();
        return current;
    }

    static public Computer scriptComputerWithProcessorOf2CoresAndi686()
    {
	computer();
	   processor();
	     cores(2);
	     i686();
        return current;
    }
   static public Computer scriptComputerWithProcessorOf2CoresAndi586()
    {
	computer();
	   processor();
	     cores(2);
	     i586();
        return current;
    }
    static public Computer scriptComputerWith1Disk()
    {
	computer();
	   processor();
	   cores(2);
	   i586();
	   disk();
	   size(128);
        return current;
    }

}



