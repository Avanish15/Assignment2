class Solution {
public:
    int smallestRangeI(vector<int>& nums, int k) {
        int maxi = INT_MIN, mini = INT_MAX;

        for(int i=0; i< nums.size(); i++) {
            maxi = max(maxi, nums[i]);
            mini = min(mini, nums[i]);
        }
        mini += k;
        maxi -= k;
        if(maxi-mini < 0) return 0;
        return maxi-mini;
    }
};