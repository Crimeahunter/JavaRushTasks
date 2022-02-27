package Part2.task5;

public class TaskAnswer5 {
    public static void main(String[] args) {
        System.out.println(19);

        Cat cat11;
        cat11 = new Cat();
        Cat cat1;
        cat1 = new Cat();
        Cat cat2;
        cat2 = new Cat();
        Cat cat3;
        cat3 = new Cat();
        Cat cat4;
        cat4 = new Cat();
        Cat cat5;
        cat5 = new Cat();
        Cat cat6;
        cat6 = new Cat();
        Cat cat7;
        cat7 = new Cat();
        Cat cat8;
        cat8 = new Cat();
        Cat cat9;
        Cat cat10;


        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();//созданы объекты и их ссылки занесены в переменные
        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;//каждому животному дан собственник
    }
}
