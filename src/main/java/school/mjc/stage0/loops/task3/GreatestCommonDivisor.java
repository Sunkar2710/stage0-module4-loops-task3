package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0 || second == 0) {
            System.out.println(first > second ? first : second);
        }
        else {
            int i;
            if (first < second) {
                i = first;
            }
            else {
                i = second;
            }

            for (; i > 1; i--) {
                if (first % i == 0 && second % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
