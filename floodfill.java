
//use bfs to traverse the image and change the color of connected cells with the same original color
import java.util.*;
class floodfill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int originalColor = image[sr][sc];

        // Edge case
        if (originalColor == newColor) return image;

        int rows = image.length;
        int cols = image[0].length;

        Queue<int[]> queue = new LinkedList<>();

        // push starting cell
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = newColor;

        // 4 directions: down, up, right, left
        int[][] directions = {
            {1, 0},   // down
            {-1, 0},  // up
            {0, 1},   // right
            {0, -1}   // left
        };

while (!queue.isEmpty()) {

    int[] curr = queue.poll();
    int r = curr[0];
    int c = curr[1];

    for (int[] d : directions) {
        int nr = r + d[0];
        int nc = c + d[1];

        // valid + same color
        if (nr >= 0 && nr < rows &&
            nc >= 0 && nc < cols &&
            image[nr][nc] == originalColor) {

            image[nr][nc] = newColor;
            queue.offer(new int[]{nr, nc});
        }
    }
}

        return image;
    }

    public static void main(String[] args) {
        floodfill solution = new floodfill();

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;

        int[][] result = solution.floodFill(image, sr, sc, newColor);

        System.out.println("Flood filled image:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}