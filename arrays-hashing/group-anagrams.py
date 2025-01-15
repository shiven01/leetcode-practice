class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}
        
        for index, string in enumerate(strs):
            arr = [0] * 26

            for char in string:
                stringIndex = ord(char) - ord('a')
                arr[stringIndex] += 1

            hashMap[tuple(arr)] = hashMap.get(tuple(arr), [])
            hashMap[tuple(arr)].append(string)

        return list(hashMap.values())