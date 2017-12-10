

import java.util.*;
import java.lang.*;
public class Arms {

    
    

    public static void main(String[] args) {
        int n,m;

 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 m=sc.nextInt();

        for(int number = n + 1; number < m; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

       
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number)
                System.out.print(number + " ");
        }
    }
}
