package www.list.test;

public class ListAddTest {
    public static void main(String[] args) {
        //在2号元素位置添加98
        //创建一个数组
        int[] arr = {12,45,78,88,99,63};
        //遍历数组
        for (int i = 0; i <= arr.length-1; i++) {
           // System.out.println(arr[i]);
        }
        System.out.println(arr.length);
        //增加元素
//        arr[5] = arr[4];
//        arr[4] = arr[3];
//        arr[3] = arr[2];

        //指定一个数组下标
        int index = 2;
        for (int i = args.length-1; i >= index+1 ; i--) {
            //index+1是循环次数
            arr[i] = arr[i-1];
        }
        arr[2] = 97;
        //输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        getAddList(arr,3,666);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void getAddList(int[] arr,int index,int ele) {
        //哪个数组，哪个位置，哪个元素
        for (int i = arr.length-1; i >= index+1 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = ele;
    }

}
