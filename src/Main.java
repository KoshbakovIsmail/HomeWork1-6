public class Main {
    public static void main(String[] args) {

        int zero = 0, one = 1, two = 2, seven = 7, ten = 10, minusTen = -10,
                month = 12, seventeen = 17, ninetyEight = 98, fiveHunTwe = 512,
                salary = 29000, total = 0, yearPercent = 100, startYear = 1904,
                endYear = 2096;

        test1_4(zero, one, two, ten, minusTen, seventeen);
        test5_7(one, two, seven, ninetyEight, fiveHunTwe, startYear, endYear);
        test8(salary, total, one, month);
        test9(salary, total, one, month, yearPercent);
        test10(one, two, ten);
    }

    public static void test1_4(int zero, int one, int two, int ten, int ten01, int seventeen) {
        System.out.println("       Задача №1");
        for (int i = one; i <= ten; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("       Задача №2");
        for (int i = ten; i >= one; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("       Задача №3");
        for (int i = zero; i <= seventeen; i += two) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("       Задача №4");
        for (int i = ten; i >= ten01; i--) {
            System.out.print(i + " ");
        }
    }

    public static void test5_7(int one, int two, int seven, int ninetyEightint, int fiveHuTwo, int startyear, int endYear) {
        System.out.println();
        System.out.println("       Задача №5");
        for (int i = startyear; i <= endYear; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println("       Задача №6");
        for (int i = seven; i <= ninetyEightint; i += seven) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("       Задача №7");
        for (int i = one; i <= fiveHuTwo; i *= two) {
            System.out.print(i + " ");
        }
    }

    public static void test8(int salary, int total, int one, int twelve) {
        System.out.println();
        System.out.println("       Задача №8");
        for (int i = one; i <= twelve; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равно " + total + " рублей");
        }
    }

    public static void test9(int salary, int total, int one, int twelve, int yearPercent) {
        System.out.println("       Задача №9");
        for (int i = one; i <= twelve; i++) {
            total += total / yearPercent;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равно " + total + " рублей");
        }
    }

    public static void test10(int one, int two, int ten) {
        System.out.println("       Задача №10");
        for (int i = one; i <= ten; i++) {
            int result = i * two;
            System.out.println(two + "*" + i + "=" + result);
        }
    }
}
