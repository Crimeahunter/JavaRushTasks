package task04.task0421;

/* 
Сравнить имена?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        if (str1.equals(str2))
            System.out.println("Имена идентичны");
        else
            if (str1.length()==str2.length())
                System.out.println("Длины имен равны");
    }
}
