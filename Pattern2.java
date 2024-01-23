import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n_space=n-1;
        int nst=1;
        int row=1;
        while(row<=n)
        {
            int i=1;
            while(i<=n_space)
            {
                System.out.print(" ");
                i=i+1;
            }
            int j=1;
            while(j<=nst)
            {
                System.out.print("*");
                j=j+1;
            }
            n_space=n_space-1;
            nst=nst+1;
            System.out.println();
          row=row+1;
        }
    }
}
