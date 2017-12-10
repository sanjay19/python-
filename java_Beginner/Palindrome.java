
import java.util.*;
import java.lang.*;
public class Palindrome {
public static void main(String[] args) {
    int n=0;
    int ncpy=0;
    int rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ncpy=n;
        while(ncpy>0)
        {
            int digit=ncpy%10;
            ncpy=ncpy/10;
            rev=(rev*10)+digit;
        }
        if(n==rev)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
