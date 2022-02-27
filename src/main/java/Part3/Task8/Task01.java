package Part3.Task8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task01 {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String time = reader.readLine();
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + time + " лет. Му-ха-ха!");  }
}

