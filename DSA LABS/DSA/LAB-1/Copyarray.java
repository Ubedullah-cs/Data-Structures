public class Copyarray {
    public static void main(String[] args) {
        int[][] twoDArray = {
            {1, 2, 3, 4, 5},
            {4, 5, 6, 7, 8},
            {7, 8, 9, 10, 11},
            {10, 11, 12, 13, 14}
        };
        int[] oneDArray = new int[20];
        System.out.println("Before copying array:");
        print2DArray(twoDArray);
        noDup(twoDArray, oneDArray);
        System.out.println("After copying array:");
        print1DArray(oneDArray);
    }
    public static void noDup(int[][] twoDArray, int[] oneDArray) {
        int index = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                boolean isDuplicate = false;
                for (int k = 0; k < index; k++) {
                    if (oneDArray[k] == twoDArray[i][j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    oneDArray[index++] = twoDArray[i][j];
                }
            }
        }
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print1DArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}