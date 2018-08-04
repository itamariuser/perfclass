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
        Graph graphChars = new Graph();
        for(int i = 0; i < POD.nodesNum-1; ++i)
        {
            graphChars.addEdge(1, i);
        }
        System.out.println(graphChars.countGraphs());
    }
}