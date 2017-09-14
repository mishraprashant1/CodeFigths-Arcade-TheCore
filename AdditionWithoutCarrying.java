/*

A little boy is studying arithmetics. He has just learned how to add two integers, written one below another, column by column. But he always forgets about the important part - carrying.

Given two integers, find the result which the little boy will get.

Note: the boy used this site as the source of knowledge, feel free to check it out too if you are not familiar with column addition.

Example

For param1 = 456 and param2 = 1734, the output should be
additionWithoutCarrying(param1, param2) = 1180.

   456
  1734
+ ____
  1180
The little boy goes from right to left:

6 + 4 = 10 but the little boy forgets about 1 and just writes down 0 in the last column
5 + 3 = 8
4 + 7 = 11 but the little boy forgets about the leading 1 and just writes down 1 under 4 and 7.
There is no digit in the first number corresponding to the leading digit of the second one, so the little boy imagines that 0 is written before 456. Thus, he gets 0 + 1 = 1.

*/

int additionWithoutCarrying(int param1, int param2) {
    String res="";
    String s1=param1+"";
    String s2=param2+"";
    for(int i=s1.length()-1,j=s2.length()-1;i>=0&&j>=0;i--,j--){
        String temp=(Integer.parseInt(s1.charAt(i)+"")+Integer.parseInt(s2.charAt(j)+""))+"";
        res=temp.charAt(temp.length()-1)+res;
    }
    if(s1.length()==s2.length())
        return Integer.parseInt(res);
    if(s1.length()>s2.length()){
        int diff=s1.length()-s2.length();
        res=s1.substring(0,diff)+res;
        return Integer.parseInt(res);  
    }
    int diff=s2.length()-s1.length();
    res=s2.substring(0,diff)+res;
    return Integer.parseInt(res);  
}
