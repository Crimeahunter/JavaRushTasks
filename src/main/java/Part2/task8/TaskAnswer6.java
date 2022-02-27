package Part2.task8;

public class TaskAnswer6 {
    public static void main(String[] args) {
        int a =5, b=3, c=-4, d=5;
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(Math.min(a,b),c));

        int minAB = Math.min(a,b);
        int minCD = Math.min(c,d);
        System.out.println(Math.min(minAB,minCD));

        print1("Строка");
        print2("Слово");
    }

    public static void print1(String s)
    {
        System.out.println(s + "\n" + s + "\n" + s);
    }

    public static void print2(String s)
    {
        System.out.println(s + " " + s + " " + s );

    }
}
