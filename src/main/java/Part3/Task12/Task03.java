package Part3.Task12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task03 {
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String cash = reader.readLine();

        System.out.println("Я буду зарабатывать $" +cash+ " в час");
    }
}
