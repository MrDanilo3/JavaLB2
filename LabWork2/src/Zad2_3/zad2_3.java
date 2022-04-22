package Zad2_3;

import java.util.Scanner;

public class zad2_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Populate the array : ");
        int mas[] = new int[10];//create an array of size 10
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();// fill array from keyboard
        }


        System.out.println("Filled array");
        for (int i=0;i < mas.length;i++){
            System.out.print(mas[i]+ " ");// Display the filled array on the screen
        }
        System.out.println();

    }
}
