class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        arr = [[] for i in range(len(nums) + 1)] # <frequency,value>
        hashmap = {} # <value, frequency>

        for num in nums:
            hashmap[num] = hashmap.get(num, 0) + 1
        for key, val in hashmap.items():
            arr[val].append(key)
        
        newArr = []
        for i in range(len(arr) - 1, 0, -1):
            for num in arr[i]:
                newArr.append(num)
                if len(newArr) == k:
                    return newArr
