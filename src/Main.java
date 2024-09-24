import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

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
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");

        int totalPopulation = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;
        int years = 0;
        while (years < 10) {
            years = years + 1;
            totalPopulation = totalPopulation + (totalPopulation / 1000) * (birthRate - mortalityRate);
            System.out.println("Год " + years + ", численность населения составляет " + totalPopulation);
        }
    }

    public static void task4() {
        System.out.println("Задание 4");

        int vasilySavings = 15_000;
        int total = 0;
        int month = 0;
        while (total < 12_000_000) {
            month = month + 1;
            total = total + (total * 7) / 100;
            total = total + vasilySavings;
            System.out.println("Месяц " + month + " сумма накоплений " + total);
        }
    }

    public static void task5() {
        System.out.println("Задание 5");

        int vasilySavings = 15_000;
        int total = 0;
        int month = 0;
        while (total < 12_000_000) {
            month = month + 1;
            total = total + (total * 7) / 100;
            total = total + vasilySavings;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задание 6");

        int vasilySavings = 15_000;
        int total = 0;
        int month = 0;
        int savingYears = 0;
        do {
            month = month + 1;
            total = total + (total * 7) / 100;
            total = total + vasilySavings;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " сумма накоплений " + total);
            }
            if (month % 12 == 0) {
                savingYears = savingYears + 1;
            }
        }
        while (savingYears < 9);
    }

    public static void task7() {
        System.out.println("Задание 7");

        int friday = 4;
        int dateOfTheMonth = 0;
        do {
            dateOfTheMonth = dateOfTheMonth + 1;
            if (dateOfTheMonth == friday) {
                friday = friday + 7;
                System.out.println("Сегодня пятница, " + dateOfTheMonth + "-е число. Необходимо подготовить отчет");
            }
        }
        while (dateOfTheMonth < 31);
    }

    public static void task8() {
        System.out.println("Задание 8");

        int i = 79;
        int Year = 0;
        int beforeYear = 1824;
        int thisYear = 2024;
        do {
            Year = Year + i;
            if (Year > beforeYear) {
                System.out.println(Year + " - год");
            }
        }
        while (Year < thisYear);
    }
}

