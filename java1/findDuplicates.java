import java.util.ArrayList;
import java.util.List;

/**
 * findDuplicates
 */
public class findDuplicates {
    public List<Integer> findDuplicatesfromList(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0)
                res.add(Math.abs(index + 1));
            nums[index] = -nums[index];
        }
        return res;
    }

    public static void main(String[] args) {
        findDuplicates main = new findDuplicates();
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 2, 8, 9, 9 };
        List<Integer> duplicates = main.findDuplicatesfromList(numbers);
        System.out.println("Duplicates in the list:");
        for (int duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}