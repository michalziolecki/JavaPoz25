package java_exercises_1_sda;

public class Main {

    public static void main(String[] args){

        System.out.println("Ex1: ");
        Ex1.printMultiplying(5);

        System.out.println("Ex2: ");
        boolean result = Ex2.isPrimeNumber(7); // true
        System.out.println("isPrime: " + result);
        boolean resultTwo = Ex2.isPrimeNumber(8); // false
        System.out.println("isPrime: " + resultTwo);

        System.out.println("Ex3: ");
        Ex3 objectEx1 = new Ex3();
        int ret = objectEx1.multiplyTwoNumber(4, 5);
        System.out.println("Multiplying: " + ret);

        System.out.println("Ex4: ");
        int[] table = {1, 2, 3};
        Ex4.switchTable(table);

        System.out.println("Ex5.1: ");
        Ex5.topAndMin(table);
        System.out.println("Ex5.2: ");
        int[] minTop = {-2, -10, -4, 22, 15, 105, -20};
        Ex5.topAndMin(minTop);

        System.out.println("Ex6: ");
        int[] belowZeroTable = Ex6.minusCounter(minTop);
//        int[] belowZeroTable = Ex6_2.countBelowZeroNumb(minTop);
        TablePrinter.tablesPrinter(belowZeroTable);

        System.out.println("Ex7: ");
        int[] arithmeticSeriesTab = Ex7.arithmeticSeries(7,1, 2);
        TablePrinter.tablesPrinter(arithmeticSeriesTab);

        System.out.println("Ex8: ");
        int[] arithmeticSeries = {2, 6, 10, 14, 18, 22};
        int [] notArithmeticSeries = {2, 6, 10, 14, 18, 23};
        System.out.println(Ex8.isArithmeticSeries(arithmeticSeries)); // yes
        System.out.println(Ex8.isArithmeticSeries(notArithmeticSeries)); // no

        System.out.println("Ex9: ");
        System.out.println(Ex9.myModulo(11, 2));
        System.out.println(Ex9.myModulo(10, 2));
        System.out.println(Ex9.myModulo(17, 3));

        System.out.println("Ex9: ");
        int[] testTab = {1, 5, 7, 122, 45};
        System.out.println("Assert true: " + Ex10.testMyModulo(testTab, 3));


        Student student = new Student(24,"Michal");
        student.print();

        student.getAge();
    }
}
