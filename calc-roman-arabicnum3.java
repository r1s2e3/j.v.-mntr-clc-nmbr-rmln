import java.util.Scanner;

public class JavaExample {

    public static void main(String[] args) {

    	double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             * 
             */
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}


<!--
public static String convertNumbersToRimsNumb(String str)
{
    String answer = str;
    answer = answer.replace("1","I");
    answer = answer.replace("2","II");
    answer = answer.replace("3"," ");
    answer = answer.replace("4"," ");
    answer = answer.replace("5"," ");
    answer = answer.replace("6"," ");
    answer = answer.replace("7"," ");
    answer = answer.replace("8"," ");
    answer = answer.replace("9"," ");
    answer = answer.replace("0"," ");
    return answer;
}

and

public static String convertNumbersToEnglish(String str) {
    String answer = str;
    answer = answer.replace(" ", "1");
    answer = answer.replace(" ", "2");
    answer = answer.replace(" ", "3");
    answer = answer.replace(" ", "4");
    answer = answer.replace(" ", "5");
    answer = answer.replace(" ", "6");
    answer = answer.replace(" ", "7");
    answer = answer.replace(" ", "8");
    answer = answer.replace(" ", "9");
    answer = answer.replace(" ", "0");
    return answer;
}
--->