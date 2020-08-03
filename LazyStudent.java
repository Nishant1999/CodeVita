package CodeVitaPrep;

import java.util.Scanner;

public class LazyStudent {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int qb_questionbank, practise_ques, question_paper;
        int totaloutcome;
        qb_questionbank = sc.nextInt();
        practise_ques = sc.nextInt();
        question_paper = sc.nextInt();
        totaloutcome = MathUtility.combination(qb_questionbank, practise_ques);
        int unknown = qb_questionbank - question_paper;
    }
}
