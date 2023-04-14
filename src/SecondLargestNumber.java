import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number1 = input.nextInt();

        System.out.println("Enter a number");
        int number2 = input.nextInt();

        System.out.println("Enter a number");
        int number3 = input.nextInt();

        System.out.println("Enter a number");


        int secondlargestNumber = 0;
        for (int counter = 0; counter < secondlargestNumber; counter++) {
            for (int iterator = 0; iterator < secondlargestNumber; iterator++) {

                int temp = 0;
                secondlargestNumber = temp;

            }

//          int secondlargestNumber = 0;

        if (number1 > number2 && number1 > number3) {
        if (number2 > number3) {
            secondlargestNumber = number2;
        }else{
            secondlargestNumber = number3;
        }
//        }else if(number2 > number1 && number3){
            if(number1 > number3){
                secondlargestNumber =number3;
        }
        System.out.println("second largest number is: " + secondlargestNumber);






        }
    }


                Scanner scanner = new Scanner(System.in);
                System.out.print("How many numbers would you like to enter: ");
                int num = scanner.nextInt();

                int[] numbers = new int[num];

                System.out.print("Enter " + num + " Numbers: ");
                for (int i = 0; i < num; i++) {
                    numbers[i] = scanner.nextInt();
                }

                int secondLargest = findSecondLargest(numbers);

                System.out.println("The second largest number is: " + secondLargest);
            }
            public static int findSecondLargest(int[] numbers) {
                int max = Integer.MIN_VALUE;
                int secondMax = Integer.MIN_VALUE;
                for (int number : numbers) {
                    if (number > max) {
                        secondMax = max;
                        max = number;
                    } else if (number > secondMax && number != max) {
                        secondMax = number;
                    }
                }
                return secondMax;
            }
        }