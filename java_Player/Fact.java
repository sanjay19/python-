
import java.util.*;
import java.lang.*;
public class Fact {

    public static void main(String[] args) {
       
            int n,sum=1;
          Scanner sc=new Scanner(System.in);
          n=sc.nextInt();
          for(int i=1;i<=n;i++)
          {
              sum=sum*i;
          }
          System.out.println(sum);
    }
    
    }

