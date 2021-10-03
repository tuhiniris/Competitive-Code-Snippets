#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll solve(ll input2[], ll input1, ll input3)
{
    if (input3 == 0)
        return 1;
    else if (input3 != 0 and input1 == 0)
        return 0;
    //if arrays element >input3.
    else if (input2[input1 - 1] > input3)
        return solve(input2, input1 - 1, input3);
    else //we have two choice either to pick or to reject.
        return solve(input2, input1 - 1, input3) + solve(input2, input1 - 1, input3 - input2[input1 - 1]);
}

int main()
{
    ll t;

    cout << "Enter number of test cases: ";
    cin >> t;

    while (t--) {
        ll input1;
        cout << "Enter size of array: ";
        cin >> input1;

        ll input2[input1];
        cout << "Enter elements: ";
        for (ll i = 0; i < input1; i++)
            cin >> input2[i];

        ll input3;
        cout << "Enter input3: ";
        cin >> input3;

        ll res = solve(input2, input1, input3);
        cout << "Number of subsets: ";
        cout << res << "\n";
    }

    return 0;
}
