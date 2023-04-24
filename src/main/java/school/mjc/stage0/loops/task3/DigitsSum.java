package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String digits = "" + Math.abs(t);
        for (int i = 0; i < digits.length(); i++) {
            sum += Integer.parseInt(digits.charAt(i) + "");
        }
        System.out.println(sum);
    }
}
