package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            String nine = "";
            for (int j = 1; j <= i; j++) {
                nine += 9;
            }
            sum += Integer.parseInt(nine);
        }
        System.out.println(sum);
    }
}
