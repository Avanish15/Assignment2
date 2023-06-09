class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        return max(nums[0]*nums[1]*nums[n-1], nums[n-3]*nums[n-2]*nums[n-1]);
    }
};

/**
Approach 3: Single Scan
**/

/**
Complexity Analysis

Time complexity : O(n)O(n). Only one iteration over the numsnums array of length nn is required.

Space complexity : O(1)O(1). Constant extra space is used. 
**/

//Runtime: 48 ms, faster than 86.06% of C++ online submissions for Maximum Product of Three Numbers.
//Memory Usage: 10.9 MB, less than 97.89% of C++ online submissions for Maximum Product of Three Numbers.

/**
class Solution {
public:
    int maximumProduct(vector<int>& nums) {
        int min1 = INT_MAX, min2 = INT_MAX;
        int max1 = INT_MIN, max2 = INT_MIN, max3 = INT_MIN;
        
        for(int n : nums){
            if(n <= min1){
                min2 = min1;
                min1 = n;
            }else if(n <= min2){
                min2 = n;
            }
            
            if(n >= max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }else if(n >= max2){
                max3 = max2;
                max2 = n;
            }else if(n >= max3){
                max3 = n;
            }
        }
        return max(min1*min2*max1, max1*max2*max3);
    }
};
**/