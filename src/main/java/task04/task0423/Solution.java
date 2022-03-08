package task04.task0423;

/* 
И 18-ти достаточно
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();

        if (age>20)
            System.out.println("И 18-ти достаточно");
    }
}
