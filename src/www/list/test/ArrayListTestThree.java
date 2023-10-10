package www.list.test;

public class ArrayListTestThree {
    public static void main(String[] args) {
        //实现一个功能，给定一个数组，求最大值

        int[] arr= {46,55,78,66,99,106,12};
//        int max = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//
//            if (max <= arr[i]) {
//                max = arr[i];
//                System.out.println(max);
//            }
//        }

        int a = maxNum(arr);
        System.out.println(a);
    }

    private static int maxNum(int[] nums) {
        int numMax = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            if (numMax <= nums[i]){
                numMax = nums[i];
            }
        }
    return numMax;
    }

}
