package www.list.test;

import java.util.Scanner;

public class ArrayListTestOne {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        int[] arr = new int[10];
        //
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("输入第"+i+"个学生成绩");
            int nexted = scanner.nextInt();
            arr[i-1] = nexted;
            sum += nexted;

        }
        System.out.println("和"+sum);
        System.out.println("平均"+sum/10);
        System.out.println("第六个"+arr[5]);
        //遍历数组，增强for循环
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
