package Quiz_App;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in) ;
		java.util.List<Questions> questions = new Service().getQ() ;
		
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Questions q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": " + q.questionText);
            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }
            System.out.print("Your answer (1-4): ");
            int answer = scn.nextInt();

            if (answer - 1 == q.correctOption) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.options[q.correctOption]);
            }
        }

        System.out.println("\nQuiz Over!");
        System.out.println("Your Score: " + score + "/" + questions.size());

        scn.close();
    }
}

	


