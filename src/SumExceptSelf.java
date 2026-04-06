import java.util.Scanner;

public class SumExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += nums[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(total - nums[i]);
            if (i < n - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
