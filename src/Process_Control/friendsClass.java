package Process_Control;

import java.util.Scanner;

public class friendsClass {
    public static void main(String[] args) {
        //小朋友搬桌子，年龄大于7岁，可以搬
        //年龄大于5，男生可以搬
        //否则不能搬，年龄太小了

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小朋友的年龄：");
        int i = sc.nextInt();



        if (i>=7){
            System.out.println("可以搬桌子");
        } else if (i>=5) {

            System.out.println("请输入小朋友的性别");
            String sex = sc.next();
            char c = sex.charAt(0);

            if (c == '男'){
                System.out.println("可以搬桌子");
            }else {
                System.out.println("不可以搬桌子");
            }
        }else {
            System.out.println("不可以搬桌子");
        }
    }
}
