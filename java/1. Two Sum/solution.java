import java.util.HashMap;


class Solution {
        public static int[] twoSum(int[] nums, int target) {

            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // hashmap for O(1) time retrieval each call

            for (int i = 0; i < nums.length; i++){


                if (map.containsKey(target - nums[i])){ // target - nums[i] = the remainder number for selected iteration of numbers


                    return new int [] {map.get(target - nums[i]), i}; 
                }


                map.put(nums[i], i); // add element to the map
            }

            return null;
        }
}