import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=0;
        int n_dash=n-1;
        int nst=1;
        while(row<n)
        {
            //work print star
            int i=1;
            while(i<=n_dash)
            {
                System.out.print("_");
                i++;
            }
            int j=1;
            while(j<=nst)
            {
                System.out.print("*");
                j++;
            }
            n_dash--;
            nst++;
            System.out.println();
            row=row+1;
        }
    }
}
