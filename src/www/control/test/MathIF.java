package www.control.test;

public class MathIF {
    public static void main(String[] args) {
        //随机数1-6
        int num1 = (int)(Math.random()*6)+1;
        int num2 = (int)(Math.random()*6)+1;
        int num3 = (int)(Math.random()*6)+1;

        int sum = num1+num2+num3;
        System.out.println(sum);

        if (sum >= 14) {
            System.out.println(sum+"一等奖");
        } else if (sum>=10 && sum<14) {
            System.out.println(sum+"二等奖");
        }else {
            System.out.println(sum+"三等奖");
        }


    }
}
