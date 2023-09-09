import java.util.Scanner;
public class Maj{
    public static int findMaj(int[] nums) {
        int majorityCandidate = nums[0];
        int c= 1;
        for (int i = 1; i < nums.length; i++) {
            if (c== 0) {
                majorityCandidate = nums[i];
                c= 1;
            } else if (nums[i] == majorityCandidate) {
                c++;
            } else {
                c--;
            }
        }
        return majorityCandidate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int max= findMaj(nums);
        System.out.println(max);
    }
}
