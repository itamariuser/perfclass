package a;
import a.OneIsland;

public class Main{
    public static void main(String[] args) {
        System.out.println("Press enter to begin main for jmc monitor");
        try
        {
            System.in.read();
            test1();

            System.out.println("Done. Press enter to exit");

        }
        catch(Exception e)
        {}

        try
        {System.in.read();}
        catch(Exception e)
        {}
    }

    public static void test1() throws Exception
    {
        OneIsland.GraphState z  = new OneIsland.GraphState();
        System.out.println(z.hashCode());
    }
}