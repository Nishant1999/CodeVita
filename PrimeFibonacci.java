package CodeVitaPrep;

import java.util.*;

public class PrimeFibonacci {
    static LinkedHashSet<Integer> hs;
    public static long primeFibonacci(int x,int y){
        long min=Integer.MAX_VALUE;
        long max=Integer.MIN_VALUE;
        ArrayList<Integer>  listOfPrimeFromAtoB = new ArrayList<>();
        for(int i=x;i<=y;i++) {
            if(hs.contains(i)) listOfPrimeFromAtoB.add(i);
        }
        HashSet<Integer> thirdList = new HashSet<>();

        for (int i = 0; i < listOfPrimeFromAtoB.size(); i++) {
            for (int j = 0; j < listOfPrimeFromAtoB.size(); j++) {
                if(i!=j) {
                    int a=Integer.parseInt((listOfPrimeFromAtoB.get(i) + "" + listOfPrimeFromAtoB.get(j)));
                    if(hs.contains(a)){
                        thirdList.add(a);
                        min = Math.min(min,a);
                        max = Math.max(max,a);
                    }
                }
            }
        }
        int n=thirdList.size();
        long sum;
        for(int i=2;i<n;i++){
            sum = min+max;
            min=max;
            max=sum;
        }
        return max;
    }

    public static void main(String[] args) {
        hs = MathUtility.getAllPrimeBySieve();
        Scanner sc = new Scanner(System.in);

        System.out.println((primeFibonacci(2,40)));
    }
}