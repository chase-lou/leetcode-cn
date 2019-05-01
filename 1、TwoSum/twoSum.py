from typing import List

# https://leetcode-cn.com/problems/two-sum/
# 两数之和
# 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
#
# 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
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