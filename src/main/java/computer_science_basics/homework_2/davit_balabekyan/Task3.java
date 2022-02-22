package computer_science_basics.homework_2.davit_balabekyan;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        printNumbers(10);
        sumNumbers();
        table();
        factorialDemo1();
        powerDemo();
        reverseNumber();
        readSetIntegers();
        testPrime();
        findHcf();
        sumAgain();
        countNumbers();
        findMaxMin();
        armstrongNumber();
        fibonacciSeries();
        sumOfSeries();
        guessMyNumber();
    }

    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {

        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }

    /* TODO: Question 3
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
    */
    public static void table() {
        Scanner console = new Scanner(System.in);

        int num;
        int sum;

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        if (num < 1) {
            table();
        } else {
            System.out.println("Multiplication Table of " + num);
            for (int i = 0; i < 10; i++) {
                sum = i * num;
                System.out.println(i + " * " + num + " = " + sum);
            }
        }
    }

    /* TODO: Question 4
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);

        int num; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
        }

        System.out.println("Factorial: " + fact);
    }

    /* TODO: Question 5
        Two numbers are entered through the keyboard.
        Write a program to find the value of one number raised to the power of another.
        (Do not use Java built-in method)
    */
    public static void powerDemo() {
        Scanner console = new Scanner(System.in);

        int base;
        int power;
        double result = 1;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        if (power < 0) {
            for (int i = 0; i < -power; i++) {
                result *= base;
            }
            result = 1 / result;
        }
        if (power > 0) {
            for (int i = 1; i <= power; i++) {
                result *= base;
            }
            if (base < 0) {
                result = -result;
            }
        }

        System.out.println("Result: " + result);
    }

    /* TODO: Question 6
        Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        For example, if the input is 12345, the output should be 54321.
    */
    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int givenNumber, remainder, number;
        int reverse = 0;

        System.out.print("Enter the number ");
        givenNumber = console.nextInt();
        number = givenNumber;

        while (givenNumber != 0) {
            remainder = givenNumber % 10;
            reverse = reverse * 10 + remainder;
            givenNumber /= 10;
        }

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    /* TODO: Question 7
         Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
    */
    public static void readSetIntegers() {
        Scanner console = new Scanner(System.in);

        int number;
        int evenSum = 0;
        int oddSum = 0;

        char choice;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    /* TODO: Question 8
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static void testPrime() {
        Scanner console = new Scanner(System.in);

        int number;
        boolean isPrime = true;

        System.out.print("Enter the positive integer ");
        number = console.nextInt();

        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Your number is not prime");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is prime");
            }
        }
    }

    /* TODO: Question 9
        Write a program to calculate HCF of Two given number.
    */
    public static void findHcf() {
        Scanner console = new Scanner(System.in);

        int dividend, divisor;
        int remainder, hcf = 0;

        System.out.print("Enter the first number ");
        dividend = console.nextInt();

        System.out.print("Enter the second number ");
        divisor = console.nextInt();

        if (dividend != 0 || divisor != 0) {
            do {
                remainder = dividend % divisor;
                dividend = divisor;
                divisor = remainder;
                if (dividend < 0 || divisor < 0) {
                    hcf = -divisor;
                } else {
                    hcf = divisor;
                }
            } while (dividend % divisor != 0);
        }

        System.out.println("HCF: " + hcf);
    }

    /* TODO: Question 10
        Write a do-while loop that asks the user to enter two numbers.
        The numbers should be added and the sum displayed.
        The loop should ask the user whether he or she wishes to perform the operation again.
        If so, the loop should repeat; otherwise it should terminate.
    */
    public static void sumAgain() {
        Scanner console = new Scanner(System.in);

        int number1, number2;
        int sum;

        char choice;

        do {
            System.out.print("Enter the first number ");
            number1 = console.nextInt();
            System.out.print("Enter the second number ");
            number2 = console.nextInt();
            sum = number1 + number2;
            System.out.println(sum);
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

    /* TODO: Question 11
        Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
        negative and zeros entered.
    */
    public static void countNumbers() {
        Scanner console = new Scanner(System.in);

        int number, countPositive = 0, countNegative = 0, countZero = 0;
        char choice;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();
            if (number == 0) {
                countZero++;
            } else if (number > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }

    /* TODO: Question 12
        Write a program to enter the numbers till the user wants and
        at the end the program should display the largest and smallest numbers entered.
    */
    public static void findMaxMin() {
        Scanner console = new Scanner(System.in);

        int number;
        int max;
        int min;

        char choice;

        ArrayList<Integer> list = new ArrayList<>();

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();
            list.add(number);
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        Integer maxOfList = list.get(0);
        Integer minOfList = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (maxOfList < list.get(i)) {
                maxOfList = list.get(i);
            }
            if (minOfList > list.get(i)) {
                minOfList = list.get(i);
            }
        }

        max = maxOfList;
        min = minOfList;

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }

    /* TODO: Question 13
        Write a program to print out all Armstrong numbers between 1 and 500.
        If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
        For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
    */
    public static void armstrongNumber() {
        int digit1,  // To hold first digit (Ones) of number
                digit2,  // To hold second digit (Tens) of number
                digit3;  // To hold third digit (Hundreds) of number

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 500; i++) {
            if (i < 10) {
                digit1 = (int) Math.pow(i, 3);
                if (digit1 == i) {
                    list.add(i);
                }
            } else if (i < 100) {
                digit2 = i % 10;
                digit1 = (i - digit2) / 10;
                int sum = (int) (Math.pow(digit1, 3) + Math.pow(digit2, 3));
                if (sum == i) {
                    list.add(i);
                }
            } else {
                digit3 = i % 10;
                digit2 = (i / 10) % 10;
                digit1 = ((i - digit3) / 10) / 10;
                int sum = (int) (Math.pow(digit1, 3) + Math.pow(digit2, 3) + Math.pow(digit3, 3));
                if (sum == i) {
                    list.add(i);
                }
            }
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    /* TODO: Question 14
        Write a program to print Fibonacci series of n terms where n is input by user :
        0 1 1 2 3 5 8 13 24 .....
    */
    public static void fibonacciSeries() {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        int firstTerm = 0, secondTerm = 1, thirdTerm;

        System.out.print("Enter number te forms of series : ");
        number = console.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print(firstTerm + " ");
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }

    /* TODO: Question 15
        Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
    */
    public static void sumOfSeries() {
        Scanner console = new Scanner(System.in);

        double number;  // To hold number of terms

        double sum = 1;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();
        for (int i = 2; i <= number; i++) {
            sum += 1.0 / i;
        }

        System.out.println("sum: " + sum);
    }

    /* TODO: Question 16
         Write a program that generates a random number and asks the user to guess what the number is.
         If the user's guess is higher than the random number, the program should display "Too high, try again."
         If the user's guess is lower than the random number, the program should display "Too low, try again."
         The program should use a loop that repeats until the user correctly guesses the random number.
    */
    public static void guessMyNumber() {
        Scanner console = new Scanner(System.in);

        int number, // To hold the random number
                guess,  // To hold the number guessed by user
                tries = 0; // To hold number of tries

        number = (int) (Math.random() * 100);

        System.out.println("Guess My Number Game");
        System.out.println(number);

        do {
            guess = console.nextInt();
            if (guess > number) {
                System.out.println("Too high try again");
            }
            if (guess < number) {
                System.out.println("Too low try again");
            }
            tries++;
        } while (guess != number);

        System.out.println("You guessed ...yah");
        System.out.println("You guessed by " + tries + " tries");
    }
}


