import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        int max = str.length() % 2 == 0 ? str.length()/2 : (int) str.length()/2;
        max = max == 0 ? 1 : max;
        
        boolean palind = false;
        for (int i = 0; i < max; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                palind = true;
                continue;
            } else {
                palind = false;
                break;
            }
        }
        
        System.out.println(palind ? "Yes" : "No");
        
    }
}
