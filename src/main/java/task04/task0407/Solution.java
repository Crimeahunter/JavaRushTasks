package task04.task0407;

/* 
Подсчет котов
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();

        Cat cat2 = new Cat();

        System.out.println("Cats count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;

        Cat () {
            Cat.count +=1;
        }
    }
}