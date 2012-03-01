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
}



