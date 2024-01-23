import java.util.Scanner;

import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int n_dash=0;
        int nst=n;
        int row=1;
        while(row<=n)
        {
            int i=0;
            while(i<n_dash)
            {
               System.out.print("_") ;
               i++;

            }
            int j=1;
            while(j<=nst)
            {
                System.out.print("*") ;
                j=j+1;

            }
            n_dash=n_dash+2;
            nst=nst-1;
            System.out.println();
            row=row+1;
        }
    }
}
