#include <iostream>
#include <vector>
#include <stack>
#include <algorithm>
using namespace std;

#define ll long long
const ll MOD = 1e9 + 7;

class Solution {
public:
    
    // ✅ Power function with modular exponentiation
    ll power(ll x, ll y) {
        ll res = 1;
        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % MOD;
            x = (x * x) % MOD;
            y /= 2;
        }
        return res % MOD;
    }

    int maximumScore(vector<int>& nums, int k) {
        int n = nums.size();
        vector<int> primeScore(n, 0);
        vector<int> left(n), right(n);
        stack<int> s;

        // ✅ Calculate prime scores
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            
            for (int j = 2; j * j <= num; ++j) {
                if (num % j == 0) {
                    primeScore[i]++;
                }
                while (num % j == 0) {
                    num /= j;
                }
            }
            
            if (num > 1) {
                primeScore[i]++;
            }

            while (!s.empty() && primeScore[s.top()] < primeScore[i]) {
                int index = s.top();
                s.pop();
                right[index] = i - 1;
            }

            left[i] = s.empty() ? 0 : s.top() + 1;
            s.push(i);
        }

        while (!s.empty()) {
            right[s.top()] = n - 1;
            s.pop();
        }

        // ✅ Store all pairs with counts
        vector<vector<ll>> all;
        for (int i = 0; i < n; i++) {
            ll count = (ll)(i - left[i] + 1) * (right[i] - i + 1);  // ✅ Use `ll` to prevent overflow
            all.push_back({nums[i], count});
        }

        // ✅ Sort in descending order of value
        sort(all.rbegin(), all.rend());

        ll ans = 1;

        // ✅ Apply operations
        for (auto &c : all) {
            if (k > c[1]) {
                ans = (ans * power(c[0], c[1])) % MOD;
                k -= c[1];
            } else {
                ans = (ans * power(c[0], k)) % MOD;
                return ans;
            }
        }

        return ans;
    }
};

// ✅ Main function to test the solution
int main() {
    Solution sol;

    // ✅ Example 1
    vector<int> nums1 = {8, 3, 9, 3, 8};
    int k1 = 2;
    cout << "Maximum Score: " << sol.maximumScore(nums1, k1) << endl;  // Output: 81

    // ✅ Example 2
    vector<int> nums2 = {19, 12, 14, 6, 10, 18};
    int k2 = 3;
    cout << "Maximum Score: " << sol.maximumScore(nums2, k2) << endl;  // Output: 4788

    // ✅ Large Test Case
    vector<int> nums3(105, 2);  // Large array of 105 elements
    int k3 = 50;
    cout << "Maximum Score: " << sol.maximumScore(nums3, k3) << endl;  // No overflow

    return 0;
}
