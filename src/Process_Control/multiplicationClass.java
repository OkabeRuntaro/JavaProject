package Process_Control;

public class multiplicationClass {
    //1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
    public static void main(String[] args) {

//        int num = 6;
//        int sum;
//        for (int i = 1; i <= num; i++) {
//            sum = num*i;
//            System.out.print(i+"*"+num+"="+sum+"\t");
//        }


        //99乘法
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
