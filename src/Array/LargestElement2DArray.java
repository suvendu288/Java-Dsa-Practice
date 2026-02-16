package Array;

public class LargestElement2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int mx = Integer.MIN_VALUE;

        for (int[] row : arr)
            for (int value : row)
                mx = Math.max(mx, value);

        System.out.println(mx);
    }

}







