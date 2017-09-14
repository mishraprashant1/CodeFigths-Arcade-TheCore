/*

To prepare his students for an upcoming game, the sports coach decides to try some new training drills. To begin with, he lines them up and starts with the following warm-up exercise: when the coach says 'L', he instructs the students to turn to the left. Alternatively, when he says 'R', they should turn to the right. Finally, when the coach says 'A', the students should turn around.

Unfortunately some students (not all of them, but at least one) can't tell left from right, meaning they always turn right when they hear 'L' and left when they hear 'R'. The coach wants to know how many times the students end up facing the same direction.

Given the list of commands the coach has given, count the number of such commands after which the students will be facing the same direction.

*/

int lineUp(String commands) {
    int nor=0,abnor=0;
    int count=0;
    for(int i=0;i<commands.length();i++){
        char c=commands.charAt(i);
        if(c=='L'){
            switch(nor){
                case 0:nor=3;break;
                case 1:nor=0;break;
                case 2:nor=1;break;
                case 3:nor=2;break;
            }
            switch(abnor){
                case 0:abnor=1;break;
                case 1:abnor=2;break;
                case 2:abnor=3;break;
                case 3:abnor=0;break;
            }
        }
        if(c=='R'){
            switch(nor){
                case 0:nor=1;break;
                case 1:nor=2;break;
                case 2:nor=3;break;
                case 3:nor=0;break;
            }
            switch(abnor){
                case 0:abnor=3;break;
                case 1:abnor=0;break;
                case 2:abnor=1;break;
                case 3:abnor=2;break;
            }
        }
        if(c=='A'){
            switch(nor){
                case 0:nor=2;break;
                case 1:nor=3;break;
                case 2:nor=0;break;
                case 3:nor=1;break;
            }
            switch(abnor){
                case 0:abnor=2;break;
                case 1:abnor=3;break;
                case 2:abnor=0;break;
                case 3:abnor=1;break;
            }
        }
        if(nor==abnor)
            count++;
    }
    return count;
}
