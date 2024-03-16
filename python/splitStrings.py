from typing import List


class Solution:
    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
        new_list = [xx for x in words for xx in x.split(separator) if xx]
        return new_list
if __name__ == "__main__":
    result1 = Solution().splitWordsBySeparator(["$easy$","$problem$"], "$")
    result2 = Solution().splitWordsBySeparator(["one.two.three","four.five","six"], ".")
    print(result1)



# Given an array of strings words and a character separator, split each string in words by separator.

# Return an array of strings containing the new strings formed after the splits, excluding empty strings.

# Notes

# separator is used to determine where the split should occur, but it is not included as part of the resulting strings.
# A split may result in more than two strings.
# The resulting strings must maintain the same order as they were initially given.