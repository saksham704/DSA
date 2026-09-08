public class selectionsort {
    public static void SelectionSort(int numbers[]){
        for(int i = 0; i < numbers.length -1; i++){
            int minPos = i;
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[minPos] > numbers[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
    }
    public static void printArray(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int numbers[] = {64, 25, 12, 22, 11};
        SelectionSort(numbers);
        System.out.println("Sorted Array :");
        printArray(numbers);
    }
    
}
