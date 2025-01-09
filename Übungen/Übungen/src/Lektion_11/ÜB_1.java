package Lektion_11;

public class ÜB_1 {
    public static double[] zeilenMaxima(double[][] doubleMatrix) {

        double[] singleMatrix = new double[doubleMatrix.length];
        double tempMax = 0;
        for (int i = 0; i < doubleMatrix.length; i++) {
            for (int k = 0; k < doubleMatrix[i].length - 1; k++) {
                tempMax = doubleMatrix[i][0];
                if (tempMax < doubleMatrix[i][k + 1]) {
                    tempMax = doubleMatrix[i][k + 1];
                }
            }

            singleMatrix[i] = tempMax;
        }
        return singleMatrix;
    }

    public static void main(String[] args) {
        double[][] matrix = new double[4][];
        matrix[0] = new double[]{1, 3, 4, 7};
        matrix[1] = new double[]{3, 8, 2};
        matrix[2] = new double[]{8, 3, 4,};
        matrix[3] = new double[]{500, 10, 400, 50};

        double[] neuesArray = zeilenMaxima(matrix);
        for (int i = 0; i < neuesArray.length; i++) {
            System.out.print(neuesArray[i] + " ");
        }
    }
}
