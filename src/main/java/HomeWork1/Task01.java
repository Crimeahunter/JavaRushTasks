package HomeWork1;

public class Task01 {
    public static void main(String[] args) {
        Task01 x = new Task01();
        System.out.println(x.fibonacci(7));
    }

        public int fibonacci(int n)  {
            if(n == 0)
                return 0;
            else if(n == 1)
                return 1;
            else
                return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
