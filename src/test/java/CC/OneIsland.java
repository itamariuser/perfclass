package CC;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;
public class OneIsland {

    @State(Scope.Benchmark)
    public static class GraphState
    {
        public Graph graphChars = new Graph();
        public GraphState() {
            // add 1 continous node group
            for(int i = 0; i < POD.nodesNum-1; ++i)
            {
                graphChars.addEdge(1, i);
            }
            System.out.println("1 ISLAND BENCHMARK");
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

//DeepBenchmark.testtest  avgt    5  3643.870 ± 309.231  us/op
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public static String testtest(GraphState graphState) {
        // CC.Graph 1

//        CC.Graph graphInts = new CC.Graph();
//
//        // CC.Graph 2
//        graphInts.addEdge(1, 2);
//        graphInts.addEdge(2, 3);
//        graphInts.addEdge(2, 4);
//        graphInts.addEdge(3, 5);
//
//        graphInts.addEdge(7, 8);
//        graphInts.addEdge(8, 10);
//        graphInts.addEdge(10, 8);
        return ""+graphState.graphChars.countGraphs();
//        System.out.println("Amount of different char-graphs: " + graphState.graphChars.countGraphs());
//        System.out.println("Amount of different int-graphs: " + graphInts.countGraphs());
    }

    ;
}