package Array;

public class Search2DMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

        int target = 9;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {          // loop through rows
            for (int j = 0; j < matrix[i].length; j++) {   // loop through columns

                if (matrix[i][j] == target) {              // check if element matches
                    System.out.println("Element found at position: (" + i + "," + j + ")");
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in matrix");
        }
    }
}