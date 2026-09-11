import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
          List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++){

            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++){

                if(j == 0 || j == i){
                    row.add(1);
                } else {
                    row.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
                }

            }

            triangle.add(row);
        }

        return triangle.get(rowIndex);
    }
    public static void main(String[] args) {
        PascalTriangle2 obj = new PascalTriangle2();
        int rowIndex = 3;
        List<Integer> result = obj.getRow(rowIndex);
        System.out.println(result);
    }
}
    
