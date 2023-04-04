package Array;

public class Array {

    private int[][] array;

    public Array(int rows, int columns) {
        array = new int[rows][columns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random()) * 10) + 1;
            }

        }
    }
    public int multiplyOfMainDiagonal() {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j)
                    count *= array[i][j];

            }

        }
        return count;
    }

    public int additionOfDiogonalAbove() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i < j) {
                    count += array[i][j];

                }
            }

        }
        return count;
    }

    public int subtractionOfDiogonalUnder() {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (i > j) {
                    count -= array[i][j];

                }
            }


        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int[] ints : array){
            for (int j = 0; j < array.length; j ++) {
                res.append("[").append(ints[j]).append("]");
            }
            res.append("\n");
        }
        return res.toString();
    }



}
