public class Matrix {
    public static boolean search(int matrix[][], int key)
    {
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int key = 5;
        if(search(matrix, key)){
            System.out.println("Element found in the matrix.");
        } else {
            System.out.println("Element not found in the matrix.");
        }
    }
}
