//rotate the matrix by 90 degree
//firstly interchange the first and last column with each other, then take the transpose and its done!
class Solution {
    public void rotate(int[][] matrix) {
        int[] som = new int[matrix.length];
        for(int i = 0; i<matrix.length/2; i++){
            som = matrix[i];
            matrix[i] = matrix[matrix.length - 1 - i];
            matrix[matrix.length - 1 - i] = som;
        }
        int temp = 0;
        for(int i = 0; i<matrix[0].length; i++){
            for(int j = i; j<matrix.length; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}
