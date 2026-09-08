public class SortedMatrix{
    public static boolean isSorted(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found in the matrix.");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int key = 5;
        isSorted(matrix, key);
    }
}
     