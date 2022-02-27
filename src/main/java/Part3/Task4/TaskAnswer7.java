package Part3.Task4;

public class TaskAnswer7 {
    public static void main(String[] args) {
        System.out.println("MAY 1 2012");
        System.out.println(850);


                Zerg zerg1 = new Zerg();
                zerg1.name = "zerg"+1;
                Zerg zerg2 = new Zerg();
                zerg2.name = "zerg"+2;
                Zerg zerg3 = new Zerg();
                zerg3.name = "zerg"+3;
                Zerg zerg4 = new Zerg();
                zerg4.name = "zerg"+4;
                Zerg zerg5 = new Zerg();
                zerg5.name = "zerg"+5;
                Zerg zerg6 = new Zerg();
                zerg6.name = "zerg"+6;
                Zerg zerg7 = new Zerg();
                zerg7.name = "zerg"+7;
                Zerg zerg8 = new Zerg();
                zerg8.name = "zerg"+8;
                Zerg zerg9 = new Zerg();
                zerg9.name = "zerg"+9;
                Zerg zerg10 = new Zerg();
                zerg10.name = "zerg"+10;

                Protos protos1 = new Protos();
                protos1.name = "Protos"+1;
                Protos protos2 = new Protos();
                protos2.name = "Protos"+2;
                Protos protos3 = new Protos();
                protos3.name = "Protos"+3;
                Protos protos4 = new Protos();
                protos4.name = "Protos"+4;
                Protos protos5 = new Protos();
                protos5.name = "Protos"+5;

                Terran terran1 = new Terran();
                terran1.name = "terran"+1;
                Terran terran2 = new Terran();
                terran2.name = "terran"+2;
                Terran terran3 = new Terran();
                terran3.name = "terran"+3;
                Terran terran4 = new Terran();
                terran4.name = "terran"+4;
                Terran terran5 = new Terran();
                terran5.name = "terran"+5;
                Terran terran6 = new Terran();
                terran6.name = "terran"+6;
                Terran terran7 = new Terran();
                terran7.name = "terran"+7;
                Terran terran8 = new Terran();
                terran8.name = "terran"+8;
                Terran terran9 = new Terran();
                terran9.name = "terran"+9;
                Terran terran10 = new Terran();
                terran10.name = "terran"+10;
                Terran terran11 = new Terran();
                terran11.name = "terran"+11;
                Terran terran12 = new Terran();
                terran12.name = "terran"+12;
        /* Произведение 10 чисел
        Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
        Подсказка: будет три миллиона с хвостиком.
        */
        int proz =1;
        for (int i = 1; i <11 ; i++){
            proz*=i;
        }
        /* Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
...
*/

        System.out.println(proz);

        int sum = 0;

        for(int i=1; i <= 10; i++) {
            sum = sum + i;
            System.out.println(sum);
        }


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}

