from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(0, len(nums)):
            if nums[i] > target:
                continue
            if i == len(nums) - 1:
                break
            for j in range(i + 1, len(nums)):
                if nums[j] > target:
                    continue
                if target == (nums[i] + nums[j]):
                    return [i, j]
        return

result = Solution().twoSum([-3,4,3,90], 0)