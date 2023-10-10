package www.list.test;

public class ListIndexTest {
    public static void main(String[] args) {
        int index = -1;
        int[] arr = {15,24,53,86,99,55};
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 86){
                index = i;

            }
        }
        System.out.println(index);
    }
}
