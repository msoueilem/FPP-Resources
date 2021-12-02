package prog2_2_startup;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        int n;
        int status = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a positive number to check on: ");
        do {
            n = sc.nextInt();
            if (n==0||n==1){
                System.out.println("This is not a Prime number");
            }

            for (int i=2; i<n;i++) {
                if (n%i==0) status = 1;
            }

            System.out.println(status == 1 ? "This is not a Prime number" : "This is a Prime number");
            status =0;
            System.out.print("Type a positive number to check on agian: ");
        }while (n>0);
        if (n<0) {
            System.out.println("\n---------------------------------" +
                    "\nEnd! we asked for a positive number");
        }
    }
}