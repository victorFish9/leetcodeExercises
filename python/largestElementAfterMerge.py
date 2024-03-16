from typing import List


class Solution:
    def maxArrayValue(self, nums: List[int]) -> int:
        i = len(nums)-1
        while(i>0):
            if nums[i] >= nums[i - 1]:
                nums[i-1] = nums[i] + nums[i-1]
                nums.pop(i)
            i -= 1
        return max(nums)
    

if __name__ == "__main__":
    result = Solution().maxArrayValue([2,3,7,9,3])
    print(result)