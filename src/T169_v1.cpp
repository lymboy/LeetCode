/**
 * 
 * url: https://leetcode.cn/problems/majority-element/description/?source=vscode
 */

#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        return nums[nums.size() / 2];
    }
};

int main(int argc, char const *argv[])
{
    Solution s;
    vector<int> nums = {3, 2, 3};
    cout << s.majorityElement(nums) << endl;
    
    return 0;
}

