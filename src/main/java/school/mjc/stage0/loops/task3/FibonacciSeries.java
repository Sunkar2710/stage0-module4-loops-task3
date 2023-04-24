package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f0 = 0, f1 = 1;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(f0);

            int f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
    }
}
