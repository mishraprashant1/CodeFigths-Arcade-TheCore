/*

Given an integer n, return the largest number that contains exactly n digits.

Example

For n = 2, the output should be
largestNumber(n) = 99.

*/

int largestNumber(int n) {
    String res="";
    for(int i=0;i<n;i++)
        res=res+"9";
    return Integer.parseInt(res);
}
