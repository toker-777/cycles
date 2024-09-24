import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();

    }

    public static void task1() {
        System.out.println("Задание 1");

        int savings = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + total / 100;
            total = total + savings;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i);
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }
    }
    public static void task3(){
        System.out.println("Задание 3");

        int totalPopulation = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int years = 0;
        while (years < 10){
            years = years + 1;
            totalPopulation = totalPopulation + (totalPopulation/1000) * (birthRate - mortalityRate);
            System.out.println("Год " + years + ", численность населения составляет " + totalPopulation);
        }
    }
}