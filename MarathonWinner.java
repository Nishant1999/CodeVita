package CodeVitaPrep;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MarathonWinner {

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int participants=3;
        int seconds=8;
        int record[][]={{2,2,4,3,5,2,6,2,3},
        {3,5,7,4,3,9,3,2,2}
    ,{1,2,4,2,7,5,3,2,4}};

        int lead[]=new int[participants];
        int sum_list[]=new int[participants];
        for(int i=0;i<lead.length-1;i++)
            lead[i]=0;
        for(int s=2;s<seconds;s+=2)
        {
            for(int pn=0;pn<participants;pn++)
            {
                    sum_list[pn]+=(record[pn][s-2]+record[pn][s-1])*record[pn][seconds];
            }
            int max = Arrays.stream(sum_list).max().getAsInt();
            for(int i=0;i<sum_list.length;i++)
            {
                if(sum_list[i]==max)
                    lead[i]++;
            }
        }
        int max = Arrays.stream(lead).max().getAsInt();
        int index=Arrays.binarySearch(lead,max);
        System.out.println(index+1);


        /*
        for (int i = 0; i < participants; i++)
            for (int j = 0; j < record.length; j++)
                System.out.print("arr[" + i + "][" + j + "] = "
                        + record[i][j]);*/
    }

}
