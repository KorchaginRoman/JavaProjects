public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {2,4,7,25,8};
        int first = nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=first;
        System.out.println(nums[0]+nums[nums.length-3]);

        }
    }
