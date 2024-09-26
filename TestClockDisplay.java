
/**
 * Test class for testing changes to ClockDisplay class.
 *
 * @author Katie Strong
 * @version 9/26/2024
 */
public class TestClockDisplay
{
 

    /**
     * Constructor for objects of class TestClockDisplay
     */
    public TestClockDisplay()
    {
         
    }

    public void test()
    {
        ClockDisplay clock = new ClockDisplay();
        
        clock.setTime(22,30);
        System.out.println(clock.getTime());
        
        clock.setTime(10,30);
        System.out.println(clock.getTime());
        
        clock.setTime(12,0);
        System.out.println(clock.getTime());
        
        clock.setTime(0,0);
        System.out.println(clock.getTime());
    }

}
