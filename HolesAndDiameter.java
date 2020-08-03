package CodeVitaPrep;

import java.util.Scanner;

public class HolesAndDiameter {
    static void findPosition(int holes[],int balls[])
    {

        int left[]=new int[holes.length];
        for(int i=0;i<left.length;i++)
            left[i]=i+1;

        for(int i=0;i<balls.length;i++)
        {
            int c=0;
            for(int j=holes.length-1;j>=0;j--)
            {

                if(balls[i]<=holes[j] && left[j]!=0)
                {

                    System.out.print(j+1);
                    left[j]--;
                    c=1;
                    break;
                }


            }
                if(c==0)
                    System.out.print("0");
        }


    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);

        int holes[]={21,3,6};

        /*
        for(int i=0;i<n;i++)
            holes[i]=sc.nextInt();*/


        int balls[]={20,15,5,7,10,4,2,1,3,6,8};/*
        for(int i=0;i<m;i++)
            balls[i]=sc.nextInt();*/
        findPosition(holes,balls);

    }
}
