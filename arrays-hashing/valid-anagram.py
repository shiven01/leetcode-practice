class Solution:
    def hashMapPopulator(self, s: str, hashMap: Dict[str, int]) -> Dict[str, int]:
        for character in s:
            hashMap[character] = hashMap.get(character, 0) + 1
        return hashMap

    def isAnagram(self, s: str, t: str) -> bool:
        smap = {}
        tmap = {}

        if self.hashMapPopulator(s, smap) != self.hashMapPopulator(t, tmap):
            return False
        return True