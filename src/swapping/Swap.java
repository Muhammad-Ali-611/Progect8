package swapping;

public class Swap {

    public static void main(String[] args) {
        int num1 = 100; //glass of water
        int num2 = 200; //glass of milk //temporary glass

        System.out.println("before swapping");
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
         int temp = num1;
          num1 = num2;
          num2 = temp;
        System.out.println("After swapping");
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
    }
}
