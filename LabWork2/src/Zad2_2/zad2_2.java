package Zad2_2;

import java.util.Scanner;

public class zad2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");

        System.out.println("Enter the number");
        int chislo =  sc.nextInt();

        int[] arr = new int[6];
        int i = 0;
        while (chislo > 2) {
            arr[i] = chislo % 2;
            chislo /= 2;
            i++;
        }
        arr[i] = chislo;
        System.out.print("Number in the 2nd number system = ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}