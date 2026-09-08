public class ArraySwap {
    public static void printHello() {
        System.out.println("Hello world");
    }

    public static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
         System.out.println("num1 ="+ num1);
         System.out.println("num2 ="+ num2);
    
    }

    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 20;
        swap(num1, num2);

    }
}
