import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {


        System.out.println("There are four filing statuses: \n Single \n Married Filing" +
                " Jointly \n Married Filing Separately \n Head of Household ");

        System.out.println("Please enter your Filing Status: ");

        Scanner input = new Scanner(System.in);
        String filingStatus = input.nextLine();

        if (filingStatus.equals("Single")) {

            System.out.println("Enter your income: ");
            Scanner sc = new Scanner(System.in);
            int income = sc.nextInt();

            if (income > 0 & income <= 8350){
               double taxableIncome = income * .10;
                System.out.println("Your marginal Tax Rate is 10%, so your taxable income is " + taxableIncome );

            } else if (income > 8351 & income <= 33950){
                double taxableIncome = income * .15;
                System.out.println("Your marginal Tax Rate is 15%, so your taxable income is " + taxableIncome );

            } else if (income > 33951 & income <= 82250) {
                double taxableIncome = income * .25;
                System.out.println("Your marginal Tax Rate is 25%, so your taxable income is " + taxableIncome);

            }  else if (income > 82251 & income <= 171550) {
                double taxableIncome = income * .28;
                System.out.println("Your marginal Tax Rate is 28%, so your taxable income is " + taxableIncome);

            }  else if (income > 171551 & income <= 372950) {
                double taxableIncome = income * .33;
                System.out.println("Your marginal Tax Rate is 33%, so your taxable income is " + taxableIncome);

            } else if (income >= 372951) {
                double taxableIncome = income * .35;
                System.out.println("Your marginal Tax Rate is 35%, so your taxable income is " + taxableIncome);

            }



            else if (filingStatus.equals("Married Filing Jointly")) {

        }



        else if (filingStatus.equals("Married Filing Separately")) {

        }
        else if (filingStatus.equals("Head of Household")) {

        }
    }
}
}