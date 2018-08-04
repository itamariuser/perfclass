import CC.Graph;
import CC.OneIsland;
import CC.POD;

public class Main{
    public static void main(String[] args) {
        System.out.println("Press enter to begin jmc monitor");
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
        // add 1 continous node group
        for(int i = 0; i < POD.nodesNum-1; ++i)
        {
            graphChars.addEdge(1, i);
        }
        graphChars.countGraphs();
    }
}