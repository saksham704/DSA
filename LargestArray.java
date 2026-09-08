public class LargestArray {
    public  static int largest(int numbers[]){
        int Largest = Integer.MIN_VALUE;
        for(int i =0; i<numbers.length; i++){
            if(Largest < numbers[i]){
    
                Largest = numbers[i];
            }
        }
        return Largest;

    }
    public static int smallest(int numbers[]){
        int Smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(Smallest > numbers[i]){
                Smallest = numbers[i];
            }
        }
        return Smallest;
    }
    public static void main(String args[]){
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("LARGEST VALUE IS :" + largest(numbers));
        System.out.println("SMALLEST  VALUE IS :" + smallest(numbers));
    }
}
