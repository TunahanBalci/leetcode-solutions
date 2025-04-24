class Solution {
    public:
    
        vector<int> twoSum(vector<int>& nums, int target) {
            
    
            std::unordered_map<int, int> map; // map for O(1) time retrieval each call
    
            for(int i = 0; i < nums.size(); ++i){
    
                if (map.count(target - nums[i])){ // target - nums[i] = the remainder number for selected iteration of numbers
                    return {map[target -nums[i]], i};
                }
                map[nums[i]] = i; // add element to map
                
            }
            return {};
        }
    };