import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=n+4;
        int nst=1;
        int row=1;
        while(row<=n)
        {
            int i=1;
            while(i<nsp)
            {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=nst)
            {
                System.out.print(" * ");
                j++;
            }
            nsp=nsp-2;
            nst=nst+2;
            System.out.println();
            row=row+1;
        }

    }
}
