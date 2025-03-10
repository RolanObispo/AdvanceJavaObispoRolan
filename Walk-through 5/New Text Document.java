public class Combined2DArrayOperations {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //Printing 2D Array
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        //Sum of Matrix Elements
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of Matrix Elements: " + sum);

        //Matrix Addition
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length) {
            int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("Sum Matrix:");
            printMatrix(sumMatrix);
        } else {
            System.out.println("Matrices cannot be added (different dimensions).");
        }

        //Matrix Multiplication
        int[][] mat1 = {
            {1, 2},
            {3, 4}
        };
        int[][] mat2 = {
            {5, 6},
            {7, 8}
        };
        if (mat1[0].length == mat2.length) {
            int[][] resultMatrix = new int[mat1.length][mat2[0].length];
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat2[0].length; j++) {
                    for (int k = 0; k < mat2.length; k++) {
                        resultMatrix[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }
            System.out.println("Result Matrix (Multiplication):");
            printMatrix(resultMatrix);
        } else {
            System.out.println("Matrices cannot be multiplied (incompatible dimensions).");
        }

        //Symmetric Matrix Check
        int[][] symmetricMatrix = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        boolean isSymmetric = true;
        if (symmetricMatrix.length != symmetricMatrix[0].length) {
            isSymmetric = false;
        } else {
            for (int i = 0; i < symmetricMatrix.length; i++) {
                for (int j = 0; j < symmetricMatrix.length; j++) {
                    if (symmetricMatrix[i][j] != symmetricMatrix[j][i]) {
                        isSymmetric = false;
                        break;
                    }
                }
                if (!isSymmetric) {
                    break;
                }
            }
        }
        System.out.println("Matrix is symmetric: " + isSymmetric);

        //Transpose Matrix
        int[][] transposeMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] transposedMatrix = new int[transposeMatrix[0].length][transposeMatrix.length];
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[0].length; j++) {
                transposedMatrix[j][i] = transposeMatrix[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }

    // Helper method to print a 2D array
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}