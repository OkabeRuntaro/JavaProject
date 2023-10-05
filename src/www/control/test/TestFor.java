package www.control.test;


public class TestFor {
    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //test1();
        test2();
    }

    private static void test2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (9-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void test1() {
        for (int i = 1; i <= 4; i++) {//控制行数
            for (int j = 1; j <= (9-i); j++) {//控制空格数
                System.out.print(" ");
            }
            for (int j = 1; j <= 9; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
