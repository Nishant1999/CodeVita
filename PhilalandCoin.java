package CodeVitaPrep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


public class PhilalandCoin {

        public static void main(String[] args)throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(br.readLine());
            int x=0;
            while(Math.pow(2,x)<=n){
                x++;
            }
            System.out.println(x);
        }
    }
