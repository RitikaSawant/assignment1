#include <bits/stdc++.h>
using namespace std;
 
bool isPalindrome(int n)
{
       if (n % 11 == 0) {
        return true;
    }
 
   
    return false;
}
 
int main()
{
    isPalindrome(123321) ? cout << "Palindrome"
                         : cout << "Not Palindrome";
    return 0;
}