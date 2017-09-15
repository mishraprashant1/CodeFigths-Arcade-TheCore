/*

Remove a part of a given array between given 0-based indexes l and r (inclusive).

Example

For inputArray = [2, 3, 2, 3, 4, 5], l = 2 and r = 4, the output should be
removeArrayPart(inputArray, l, r) = [2, 3, 5].

*/

int[] removeArrayPart(int[] inputArray, int l, int r) {
    int res[]=new int[inputArray.length-(r-l+1)];
    int k=0;
    for(int i=0;i<l;i++){
        res[k]=inputArray[i];
        k++;
    }
    for(int i=r+1;i<inputArray.length;i++){
        res[k]=inputArray[i];
        k++;
    }
    return res;
}
