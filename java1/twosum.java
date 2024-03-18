
public class twosum {

    public int[] twoSum2(int[] nums, int target) {
        int a = nums.length;
        for (int i = 0; i < a; i++) {
            for (int x = 0; x < a; x++) {
                if (nums[i] + nums[x] == target) {
                    return new int[] { i, x };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        twosum mainObject = new twosum();

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = mainObject.twoSum2(nums, target);
        System.out.println(result);
    }
}