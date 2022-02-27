package Part3.Task8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task02 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String name = reader.readLine();
        String num = reader.readLine();
        String year = reader.readLine();

        System.out.println(name + " получает " +num+ " денег через " +year+ " лет.");

    }
}
