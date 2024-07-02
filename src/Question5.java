import java.util.Scanner;

public class Question5 {
    public static void main (String [] args) {

        System.out.println("Please enter your grade: ");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if (grade >= 90 & grade <=100) {
            System.out.println("Your Grade: \"A\" ");
        } else if (grade >= 80 & grade <= 89) {
            System.out.println("Your Grade: \"B\"");
        } else if (grade >= 70 & grade <= 79) {
            System.out.println("Your Grade: \"C\"");
        } else if (grade >= 60 & grade <= 69) {
            System.out.println("Your Grade: \"D\"");
        } else if (grade < 60) {
            System.out.println("Your Grade: \"F\"");
        } else if (grade < 0 || grade > 100 ) {
            System.out.println("Score out of range");
        }
    }
}
