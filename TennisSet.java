/*

In tennis, a set is finished when one of the players wins 6 games and the other one wins less than 5, or, if both players win at least 5 games, until one of the players wins 7 games.

Determine if it is possible for a tennis set to be finished with the score score1 : score2.

Example

For score1 = 3 and score2 = 6, the output should be
tennisSet(score1, score2) = true.

*/

boolean tennisSet(int score1, int score2) {
    if(score1==score2)
        return false;
    int max,min;
    if(score1>score2){max=score1;min=score2;}
    else{max=score2;min=score1;}
    if(max==6 && min<5)
        return true;
    if(max==7&&min>=5)
        return true;
    if(max>7 && min>(max-2))
        return true;
    else
        return false;
}
