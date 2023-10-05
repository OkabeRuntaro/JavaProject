package www.control.test;

public class whileClass {
    public static void main(String[] args) {

        //test1(); //5050
        //test2(); //250500
        //test3();    //1050
        test4();    //135135
    }

    private static void test4() {
        int num = 1;
        int sum = 1;
        while (num<=13){
            sum = sum * num;
            num = num+2;
        }
        System.out.println(sum);
    }

    private static void test3() {
        int num = 5;
        int sum = 0;
        while (num <= 100){
            sum = sum + num;
            num = num +5;
        }
        System.out.println(sum);
    }

    private static void test2() {
        int num = 2;
        int sum = 0;
        while (num <= 1000){
            sum = sum+ num;
            num = num+2;
        }
        System.out.println(sum);
    }

    public static void test1(){
        int num = 1;

        int sum = 0;
        while (num <= 100){
            sum = sum +num;
            num++;
        }
        System.out.println(sum);
    }
}
