package CodeVitaPrep;

public class CoinsRequired {

    public static void main(String arg[])
    {
        int five=0;
        int two=0;
        int one=0;
        int n=13;
        five=(n-4)/5;

        if((n-five*5)%2==0)
            one=2;
        else
            one=1;

        two=(n-5*five-1*one)/2;
        System.out.println(one+two+five);
        System.out.println(five+" "+two+" "+one);


        
    }
}
