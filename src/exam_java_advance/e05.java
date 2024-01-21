import java.util.Arrays;

public class e05 {
    public static void main(String[] args) {
        // o(log2n)
        int[] nums = {5, 7, 7, 7, 8, 8, 9};
        int target = 7;
        int[] result = {getLeftIndex(nums, target), getRightIndex(nums, target)};
        System.out.println(Arrays.toString(result));
    }

    public static int getLeftIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int rs = -1;
        while(start <= end) {
            int middle = (start + end) / 2;
            if (target > nums[middle]) {
                start = middle + 1;
            } else if(target < nums[middle]) {
                end = middle - 1;
            } else {
                rs = middle;
                end = middle - 1;
            }
        }
        return rs;
    }

    public static int getRightIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int rs = -1;
        while(start <= end) {
            int middle = (start + end) / 2;
            if (target > nums[middle]) {
                start = middle + 1;
            } else if(target < nums[middle]) {
                end = middle - 1;
            } else {
                rs = middle;
                start = middle + 1;
            }
        }
        return rs;
    }
}
