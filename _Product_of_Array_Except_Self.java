import java.util.Scanner;
public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int l = 1;
        for (int i = 0; i < n; i++) {
            result[i] = l;
            l *= nums[i];
        }
        int r = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= r;
            r *= nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = productExceptSelf(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
