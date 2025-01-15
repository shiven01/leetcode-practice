class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}

        for index, num in enumerate(nums):
            complement = target - num

            if complement in hashMap:
                return [hashMap[complement], index]
            
            hashMap[num] = index