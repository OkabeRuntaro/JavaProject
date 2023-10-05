package www.faction.test;

public class FactionTestOne {
    public static void main(String[] args) {

        //方法的重载
        int i = add(10, 30);
        double j = add(5.3,4.2);
        System.out.println(i+j);
    }

    private static int add(int num1, int num2) {

        int sum = num1 * num2;

        return sum;
    }
    private static double add(double num1,double num2){

        double sum = num1 + num2;
        return sum;
    }
}
