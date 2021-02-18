package fundamentals;
import java.util.*;

public class ArrayGame {

    public static boolean canWin(int leap, int[] game) {
    	// Return true if you can win the game; otherwise, return false.
    	int j = 0;
    	int counter = 0;
    	boolean win = true;
    	
    	while (j >= 0 && j < game.length) {
    		
    		if (j+leap >= game.length) {
    			break;
    		} else if (game[j+leap] == 0) {
    			j += leap;
    			continue;
    		} else if (game[j+1] == 0) {
    			j++;
    			continue;
    		} else if (j-1 > 0 && game[j-1] == 0) {
    			counter++;
    			if (counter == leap) {
    				win = false;
    				break;
    			}
    			j--;
    			continue;
    		} else {
    			win = false;
    			break;
    		}
    	}
    	
    	return win;
    	
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}