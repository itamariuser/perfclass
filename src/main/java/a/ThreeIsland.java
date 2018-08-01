package a;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class ThreeIsland {


    @State(Scope.Benchmark)
    public static class GraphState
    {
        public Graph graphChars = new Graph();
        public GraphState() {
            // add 3 independent node groups
            long i = 1, k = i+POD.nodesNum/3 - 1;
            for(int j = 0;j<3;++j)
            {
                for (; i < k; ++i)
                {
                    graphChars.addEdge(i, i + 1);
                }
                ++i;
                k = i + POD.nodesNum/3 - 1;
            }
            System.out.println("3 ISLAND BENCHMARK");
            System.out.println("NODES: "+graphChars.nodeCount);
//            graphChars.addEdge('a', 'b');
//            graphChars.addEdge('a', 'c');
//            graphChars.addEdge('a', 'd');
//            graphChars.addEdge('a', 'e');
//            graphChars.addEdge('a', 'f');
//            graphChars.addEdge('a', 'g');
//            graphChars.addEdge('a', 'y');
//            graphChars.addEdge('a', 'z');
//            graphChars.addEdge('a', 'w');
        }
    }
//    @Setup(Level.Trial)
//    public void doSetup() {
//        public static int i = 0;
//        System.out.println("Do Setup #" + i);
//    }
//
//    @TearDown(Level.Trial)
//    public void doTearDown() {
//        System.out.println("Do TearDown #" + i);
//    }
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testtest(GraphState graphState) {
        // CC.f.Graph 1

//        CC.f.Graph graphInts = new CC.f.Graph();
//
//        // CC.f.Graph 2
//        graphInts.addEdge(1, 2);
//        graphInts.addEdge(2, 3);
//        graphInts.addEdge(2, 4);
//        graphInts.addEdge(3, 5);
//
//        graphInts.addEdge(7, 8);
//        graphInts.addEdge(8, 10);
//        graphInts.addEdge(10, 8);
        graphState.graphChars.countGraphs();
//        System.out.println("Amount of different char-graphs: " + graphState.graphChars.countGraphs());
//        System.out.println("Amount of different int-graphs: " + graphInts.countGraphs());
    }

    ;
}