package CodeVitaPrep;

import java.util.Scanner;

public class VitaSum {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long res=0;
        for(int r=0;r<=k;r+=2)
            res+=MathUtility.combination(n,r);
        System.out.println(res);
    }
}
