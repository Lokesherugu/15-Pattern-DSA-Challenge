public class FloodFill {
    
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) return image;

        dfs(image, sr, sc, oldColor, newColor);
        return image;
    }

    private static void dfs(int[][] image, int r, int c, int oldColor, int newColor) {
        // base conditions
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length) return;
        if (image[r][c] != oldColor) return;

        image[r][c] = newColor;

        // directions: up, down, left, right
        dfs(image, r+1, c, oldColor, newColor);
        dfs(image, r-1, c, oldColor, newColor);
        dfs(image, r, c+1, oldColor, newColor);
        dfs(image, r, c-1, oldColor, newColor);
    }

    public static void main(String[] args) {
        int[][] image = {
            {1,1,1},
            {1,1,0},
            {1,0,1}
        };

        int sr = 1, sc = 1, newColor = 2;

        int[][] result = floodFill(image, sr, sc, newColor);

        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
