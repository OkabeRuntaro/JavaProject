package www.list.test;

import java.util.Arrays;

public class ListUtilTest {
    public static void main(String[] args) {
        int[] arr = {85,66,94,76,33};
        //toString可以输出一个数组遍历过的字符串，好看
        String strArr = Arrays.toString(arr);
        System.out.println(strArr);

        //sort排序
        Arrays.sort(arr);

            System.out.println(Arrays.toString(arr));

        //binarySearch可以查找元素在数组里的位置，但必须要有序才行
        int atrArr2 = Arrays.binarySearch(arr,76);
        System.out.println(atrArr2);

        //copyOf 复制数组 从头开始，第四个元素结束
        int[] newArr = Arrays.copyOf(arr,4);
        System.out.println(Arrays.toString(newArr));

        //copeOfRange 区间复制 从下标为2的元素开始，到第四个元素结束。
        // 包含下标为2的元素，但不包含下标为4的元素组成的新数组
        int[] newArr2 = Arrays.copyOfRange(arr,2,4);
        System.out.println(Arrays.toString(newArr2));

        //equals 比较两个数组的值是否一样()
        //与==不同的是，==比较的是地址值，结果一定是false，但equals比较的是当前的值
        int[] arr3 = {85,66,94,76,33};
        int[] arr4 = {85,66,94,76,33};
        System.out.println(arr3 == arr4);//false
        System.out.println(Arrays.equals(arr3,arr4));//true

        //fill 数组填充
        int[] arr5 = {85,66,94,76,33};
        Arrays.fill(arr5,6);
        System.out.println(Arrays.toString(arr5));
     }

}
