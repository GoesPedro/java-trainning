package fundamentals;
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1)
            return false;
        if (i + leap >= game.length || i + 1 >= game.length)
            return true;

        game[i] = 1; //flag not to come back to this index

        return canWin(leap, game, i + leap)
                || canWin(leap, game, i + 1)
                || canWin(leap, game, i - 1);
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

            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
