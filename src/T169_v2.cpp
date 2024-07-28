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
        map<int, int> m;
        for (int i = 0; i < nums.size(); i++) {
            if (m.find(nums[i]) == m.end()) {
                m[nums[i]] = 1;
            } else {
                m[nums[i]]++;
            }
            if (m[nums[i]] > nums.size() / 2) {
                return nums[i];
            }
        }
        return -1;
    }
};

int main(int argc, char const *argv[])
{
    Solution s;
    vector<int> nums = {3, 2, 3};
    cout << s.majorityElement(nums) << endl;
    
    return 0;
}

