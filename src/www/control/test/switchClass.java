package www.control.test;

public class switchClass {
    public static void main(String[] args) {

        int score = 97;

        switch (score/10){
            case 10 :
                System.out.println("A级");
                break;
            case 9 :
                System.out.println("B级");
                break;
            default:
                System.out.println("C级");
                //break;
        }
    }
}
