package www.list.test;

public class ArrayListTestTwo {
    public static void main(String[] args) {


        //静态初始化
        //除了用new关键字来产生数组外，还可以在定义数组的同时就为数组元素分配空间并赋值
        int[] arr = {1,2,3,65};
        int[] arr1 = new int[]{12,23,56};

        //动态初始化
        //数组定义与给数组元素分配空间并赋值操作分开进行
        int[] arr2;
        arr2 = new int[3];
        arr2[0] = 45;
        arr2[1] = 33;
        arr2[2] = 89;
    }
}
