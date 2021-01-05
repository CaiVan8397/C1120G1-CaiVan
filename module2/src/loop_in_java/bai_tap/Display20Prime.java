package loop_in_java.bai_tap;

import java.util.Scanner;

public class Display20Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter number of prime you want to print: ");
            number = sc.nextInt();
        }while (number < 1);
        int count = 0;
        int prime = 2;
        while (count < number){
            int prime_count = 0;
            for (int i=1; i <= prime; i++){
                if (prime % i ==0){
                    prime_count ++;
                }
            }
            if (prime_count ==2){
                System.out.println(prime);
                count++;
            }
            prime++;
        }
    }
}