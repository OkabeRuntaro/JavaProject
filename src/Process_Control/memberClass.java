package Process_Control;

import java.util.Scanner;

public class memberClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员积分：");
        int score = sc.nextInt();

        if (score>=8000){
            System.out.println("该会员享受的折扣为：0.6");
        } else if (score>=4000&&score<8000) {
            System.out.println("该会员享受的折扣为：0.7");
        } else if (score>=2000&&score<4000) {
            System.out.println("该会员享受的折扣为：0.8");
        }else {
            System.out.println("该会员享受的折扣为：0.9");
        }
    }
}
