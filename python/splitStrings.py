from typing import List


class Solution:
    def splitWordsBySeparator(self, words: List[str], separator: str) -> List[str]:
        new_list = [xx for x in words for xx in x.split(separator) if xx]
        return new_list
if __name__ == "__main__":
    result1 = Solution().splitWordsBySeparator(["$easy$","$problem$"], "$")
    result2 = Solution().splitWordsBySeparator(["one.two.three","four.five","six"], ".")
    print(result1)