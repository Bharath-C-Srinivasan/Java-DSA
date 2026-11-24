//374. Guess Number Higher or Lower
/*We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked (the number I picked stays the same throughout the game).

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked. */

package BinarySearch;

public class LC374 {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while(left <= right){
            int mid = left + (right - left)/2;
            int guessres = guess(mid);
            if(guessres == 0){
                return mid;
            }else if(guessres == -1){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    private int guess(int mid) {
        return 0;
    }
}
