package task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;

        int N = Integer.parseInt(reader.readLine());
        if (N<=0) return;

        int a;
        maximum = Integer.parseInt(reader.readLine());
        for (int i=0; i<N-1;i++) {
            a = Integer.parseInt(reader.readLine());
            if (a>maximum) {
                maximum = a;
            }
        }

        System.out.println(maximum);
    }
}
