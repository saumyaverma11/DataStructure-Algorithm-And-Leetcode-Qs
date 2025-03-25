#include <bits/stdc++.h>
using namespace std;

class Solution {
    private:
    bool canMake(vector<pair<int, int>>& arr) {
        sort(arr.begin(), arr.end());  // Sort by start time
        int count = 0;
        int e = arr[0].first + 1;

        for (auto it : arr) {
            int start = it.first;
            int end = it.second;
            
            if (start >= e) count++;     // Count valid cuts
            e = max(e, end);
        }

        return count >= 2;
    }

public:
    bool checkValidCuts(int n, vector<vector<int>>& rectangles) {
        vector<pair<int, int>> hori;   // Horizontal cuts
        vector<pair<int, int>> veri;   // Vertical cuts

        for (auto it : rectangles) {
            hori.push_back({it[0], it[2]});
            veri.push_back({it[1], it[3]});
        }

        return canMake(hori) || canMake(veri);
    }
};

int main() {
    int n;
    cout << "Enter grid size (n): ";
    cin >> n;

    int m;
    cout << "Enter number of rectangles: ";
    cin >> m;

    vector<vector<int>> rectangles(m, vector<int>(4));

    cout << "Enter rectangles in the format [x1, y1, x2, y2]:\n";
    for (int i = 0; i < m; ++i) {
        cin >> rectangles[i][0] >> rectangles[i][1] >> rectangles[i][2] >> rectangles[i][3];
    }

    Solution solution;
    bool result = solution.checkValidCuts(n, rectangles);

    cout << (result ? "true" : "false") << endl;

    return 0;
}
