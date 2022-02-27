package Part3.Task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();
        System.out.println(name1 + " проспонсировал " + name2 + ", и она стала известной певицей.");
    }
}

