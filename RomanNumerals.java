package CodeVitaPrep;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class RomanNumerals {
    static int romanNumerals(int num) {
        if(num>3999)
            return  num;
        num=18;
        String s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char number[] = s.toCharArray();
        String m[] = {"", "M", "MM", "MMM"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D",
                "DC", "DCC", "DCCC", "CM"};
        String x[] = {"", "X", "XX", "XXX", "XL", "L",
                "LX", "LXX", "LXXX", "XC"};
        String i[] = {"", "I", "II", "III", "IV", "V",
                "VI", "VII", "VIII", "IX"};

        // Converting to roman
        String thousands = m[num/1000];
        String hundred = c[(num%1000)/100];
        String tens = x[(num%100)/10];
        String ones = i[num%10];
        String roman = thousands + hundred + tens + ones;
        char base=roman.charAt(0);
        System.out.println(base);
        System.out.println(roman);
        int new_number=0;
        char roman_character[]=roman.toCharArray();
        int t=-1;
        for(int j=0;j<number.length;j++)
        {
            if(base!=number[j])
                t++;
        }
        int g=roman_character.length-1;
        for(int j=0;j<roman_character.length;j++)
        {
            for(int k=0;k<number.length;k++)
            {
                if(roman_character[j]==number[k]) {

                    new_number+=k*((int)Math.pow((double)t,(double)g--));


                }
            }
        }
        return new_number;


        }





    public static void main(String arg[]) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = romanNumerals(n);
        System.out.println(number);
    }
}/*

 for(int j=0;j<roman_character.length;j++)
        System.out.print(roman_character[j]);
        for(int j=0;j<roman_character.length;j++)
        {

        for(int k=0;k<number.length;k++)
        {
        int g=k;
        if(number[k]==roman_character[j])
        {

        g++;
        System.out.println(g+" "+roman_character[j]);
        new_number+=k*(Math.pow((double)g,(double)z));
        z++;


        }
        }
        System.out.println();*/