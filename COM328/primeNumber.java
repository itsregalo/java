
import java.util.Scanner;

class primeNumber{
    public static void main(String[] args){
        try (
            Scanner input = new Scanner(System.in)) { //create scanner  
                System.out.println("Enter a positive integer: "); //prompt user for input
                int num = input.nextInt();//get input
                //call method
                boolean prime = isPrime(num);
                //print result
                System.out.println("is "+num+ " prime? \n" + prime);
        }
    }
    //method to check if number is prime using for loop
    public static boolean isPrime(int num){
        // loop through all numbers from 2 to num
        if (num == 1 || num == 0){
            return false;
        }
        for (int i = 2; i < num; i++){
            //if num is divisible by i, return false
            if (num % i == 0){
                return false;
            }
        }
        //if num is not divisible by any number from 2 to num, return true
        return true;
    }
}