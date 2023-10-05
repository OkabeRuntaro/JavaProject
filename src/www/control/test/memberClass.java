package www.control.test;

import java.util.Scanner;

public class memberClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员积分：");

        //判断小数点
        if (sc.hasNextInt()){
            int score = sc.nextInt();
        //判断正负
            if (score>0){
                if (score>=8000){
                    System.out.println("该会员享受的折扣为：0.6");
                } else if (score>=4000&&score<8000) {
                    System.out.println("该会员享受的折扣为：0.7");
                } else if (score>=2000&&score<4000) {
                    System.out.println("该会员享受的折扣为：0.8");
                }else {
                    System.out.println("该会员享受的折扣为：0.9");
                }
            }else {
                System.out.println("非法数据-");
            }
        }else {
            System.out.println("非法数据.");
        }
    }
}
