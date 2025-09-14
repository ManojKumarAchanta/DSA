package BinarySearch;

public class BSRecursion {
    static int binarySearch(int[] nums, int start, int end, int target){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] < target) {
            return binarySearch(nums, mid + 1, end, target);
        } else {
            return binarySearch(nums, start, mid - 1, target);
        }
    }

    public static int augmentedBinarySearch(int[] nums, int start, int end, int target){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target) {
            return augmentedBinarySearch(nums, mid + 1, end, target);
        } else {
            return augmentedBinarySearch(nums, start, mid - 1, target);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 78, 95, 670};
        int[] augNums = {89, 78, 56, 45, 34, 23, 12, 2};
        System.out.println(binarySearch(nums, 0, nums.length - 1, 78));
        System.out.println(augmentedBinarySearch(augNums, 0, augNums.length - 1, 45));
    }
}