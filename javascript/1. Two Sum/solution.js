/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {


    const map = new Map(); // map for O(1) time retrieval each call

    for (let i = 0; i < nums.length; i++){
        

        if (map.has(target - nums[i])){ // target - nums[i] = the remainder number for selected iteration of numbers
            return [map.get(target - nums[i]), i]; // using "(" instead of "[" creates data type issues
        }

        map.set(nums[i], i); // add an element to map
    }
    return;
};

