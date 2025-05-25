class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Sorted Array
        Arrays.sort(nums);

        //Storing Answers
        ArrayList<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int target = 0 - nums[i];

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            while (left < right) {
                
                if (nums[left] + nums[right] == target) {
                        ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                else if ((nums[left] + nums[right]) < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return ans;
    }
}
