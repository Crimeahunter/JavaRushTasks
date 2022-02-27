package Part3.Task6;

public class TaskAnswer8 {
    public static void main(String[] args) {
        /* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой  строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/
        String a, b, c;
        a = "Мама";
        b = "Мыла";
        c = "Раму";
        System.out.println(a + b + c);
        System.out.println(a + c + b);
        System.out.println(b + a + c);
        System.out.println(b + c + a);
        System.out.println(c + a + b);
        System.out.println(c + b + a);

        /* Таблица умножения
        Выведи на экран надпись: таблицу умножения 10 на 10:
        1 2 3 …
        2 4 6 …
        3 6 9 …
        …
        */
        for (int i=1; i<=10; i++)
        {
            for(int j=1; j<=10; j++)
            {
                System.out.print((i*j)+" ");
            }
            System.out.println("");
        }

        /* Семь цветов радуги
Выведи на экран текст: семь цветов радуги.
*/
// красный, оранжевый, жёлтый, зелёный, голубой, синий, фиолетовый)


        System.out.println("Красный Оранжевый Желтый Зеленый Голубой Синий Фиолетовый");



        /* Экранирование символов
        Про экранирование символов в Java читайте в дополнительном материале к лекции.
        Вывести на экран следующий текст - две строки:
        It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
        It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/
        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"");


        /* Изучаем японский
        Выведи на экран 日本語
        */
        System.out.println("日本語");
    }
}
