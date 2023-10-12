package www.list.test;

public class ListDeleteTest {
    public static void main(String[] args) {
        //删除下标为2的元素

        int[] arr = {12,65,85,775,664,3594};
        //输出数组 arr.length=6，下标为5
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //下标2的是85元素


//        arr[2] = arr[3];
//        arr[3] = arr[4];
//        arr[4] = arr[5];
//
//        arr[5] = 0;
        //调用方法来删除
        deleteArr(arr,3);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void deleteArr(int[] arr,int index) {
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[5] = 0;
    }
}
