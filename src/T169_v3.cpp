/**
 * 
 * url: https://leetcode.cn/problems/majority-element/description/?source=vscode
 */

#include <vector>
#include <iostream>
#include <map>

using namespace std;

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int condicate;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (count == 0) {
                condicate = nums[i];
            }
            if (nums[i] == condicate) {
                count++;
            } else {
                count--;
            }
        }
        return condicate;
    }
};

int main(int argc, char const *argv[])
{
    Solution s;
    vector<int> nums = {3, 2, 3};
    cout << s.majorityElement(nums) << endl;
    
    return 0;
}

