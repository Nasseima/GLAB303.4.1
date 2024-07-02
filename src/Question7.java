import java.util.Scanner;
import java.util.Locale;
public class Question7 {
    public static void main(String[] args) {


        System.out.println("There are four filing statuses: \n Single \n Married Filing" +
                " Jointly \n Married Filing Separately \n Head of Household ");

        System.out.println("Please enter your Filing Status: ");

        Scanner input = new Scanner(System.in);
        String filingStatus = input.nextLine();


        System.out.println("Enter your income: ");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();



        if (filingStatus.equals("Single")) {

            if (income >= 0 & income <= 8350) {
                double taxableIncome = income * .10;
                System.out.println("Your marginal Tax Rate is 10%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 8351 & income <= 33950) {
                double taxableIncome = income * .15;
                System.out.println("Your marginal Tax Rate is 15%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 33951 & income <= 82250) {
                double taxableIncome = income * .25;
                System.out.println("Your marginal Tax Rate is 25%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 82251 & income <= 171550) {
                double taxableIncome = income * .28;
                System.out.print("Your marginal Tax Rate is 28%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 171551 & income <= 372950) {
                double taxableIncome = income * .33;
                System.out.println("Your marginal Tax Rate is 33%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income >= 372951) {
                double taxableIncome = income * .35;
                System.out.println("Your marginal Tax Rate is 35%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            }

        }



        else if (filingStatus.equals("Married Filing Jointly")) {

            if (income >= 0 & income <= 16700){
                double taxableIncome = income * .10;
                System.out.println("Your marginal Tax Rate is 10%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 16701 & income <= 67900){
                double taxableIncome = income * .15;
                System.out.println("Your marginal Tax Rate is 15%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 67901 & income <= 137050) {
                double taxableIncome = income * .25;
                System.out.println("Your marginal Tax Rate is 25%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            }  else if (income > 137051 & income <= 208850) {
                double taxableIncome = income * .28;
                System.out.println("Your marginal Tax Rate is 28%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            }  else if (income > 208851 & income <= 372950) {
                double taxableIncome = income * .33;
                System.out.println("Your marginal Tax Rate is 33%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income >= 372951) {
                double taxableIncome = income * .35;
                System.out.println("Your marginal Tax Rate is 35%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            }

        }



        else if (filingStatus.equals("Married Filing Separately")) {

            if (income >= 0 & income <= 8350) {
                double taxableIncome = income * .10;
                System.out.println("Your marginal Tax Rate is 10%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 8351 & income <= 33950) {
                double taxableIncome = income * .15;
                System.out.println("Your marginal Tax Rate is 15%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 33951 & income <= 68525) {
                double taxableIncome = income * .25;
                System.out.println("Your marginal Tax Rate is 25%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 68526 & income <= 104425) {
                double taxableIncome = income * .28;
                System.out.println("Your marginal Tax Rate is 28%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 104426 & income <= 186475) {
                double taxableIncome = income * .33;
                System.out.println("Your marginal Tax Rate is 33%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income >= 186476) {
                double taxableIncome = income * .35;
                System.out.println("Your marginal Tax Rate is 35%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            }

        }
        else if (filingStatus.equals("Head of Household")) {

            if (income >= 0 & income <= 11950) {
                double taxableIncome = income * .10;
                System.out.println("Your marginal Tax Rate is 10%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 11951 & income <= 45500) {
                double taxableIncome = income * .15;
                System.out.println("Your marginal Tax Rate is 15%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 45501 & income <= 117450) {
                double taxableIncome = income * .25;
                System.out.println("Your marginal Tax Rate is 25%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 117451 & income <= 190200) {
                double taxableIncome = income * .28;
                System.out.println("Your marginal Tax Rate is 28%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income > 190201 & income <= 372950) {
                double taxableIncome = income * .33;
                System.out.println("Your marginal Tax Rate is 33%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            } else if (income >= 372951) {
                double taxableIncome = income * .35;
                System.out.println("Your marginal Tax Rate is 35%, so your taxable income is " + String.format("$%.2f", taxableIncome));

            }


        }
    }
}
