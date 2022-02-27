package HomeWork1;

public class Task02 {
    public static void main(String[] args) {

        int num0 = 0;
        int num1 = 1;
        int num2;
        System.out.print(num0 + " " + num1 + " ");
        for(int i = 3; i <= 17; i++){
            num2 = num0 + num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
    }
}
