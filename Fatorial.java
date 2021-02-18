import java.io.IOException;
import java.util.Scanner;

public class Fatorial {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        int fat = N;
        
        if (N==0 || N==1) {
            fat = 1;
        } else if (N>1) {
            for(int i=N-1; i>0; i--){
            fat *= i;
            }
        }
        
        System.out.printf("%d%n", fat);
        
    }
 
}
