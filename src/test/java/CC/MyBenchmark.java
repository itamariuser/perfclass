package CC;//HOW TO RUN THE TESTS
// 1. mvn clean install
// 2. java -jar target/benchmarks.jar -f 1 -wi 2 -i 5

// for nodes = 903, TODO
//CC.OneIsland.testtest    avgt   40  1802.839 ± 32.149  us/op
//CC.ThreeIsland.testtest  avgt   40  2477.653 ± 53.397  us/op


//for nodes = 9030, java -jar target/benchmarks.jar -f 2 -wi 2 -i 2
//CC.OneIsland.testtest    avgt    4  201773.286 ± 24384.839  us/op
//CC.ThreeIsland.testtest  avgt    4  297551.035 ± 51326.925  us/op



public class MyBenchmark {
//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testMethod() {
        doMagic();
    }
    public static void doMagic() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }
    }
}
