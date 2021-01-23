import java.util.Arrays;

public class MainApp {
    public static void main(String args[]) {
        int binaryArray[] = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        binaryArrayInvertItem(binaryArray);

        int arrForFillNbr[] = new int[8];
        fillArray(arrForFillNbr, 0, 3);

        int arrSmallNbr[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        arrayMultSmallNbr(arrSmallNbr);

        int squareArray[][] = new int[5][5];

        for (int i = 0, j = squareArray.length - 1; i < squareArray.length; i++, j--) {
            squareArray[i][i] = 1;
            squareArray[i][j] = 1;
        }

        getMinArrayEl(arrSmallNbr);
        getMaxArrayEl(arrSmallNbr);

        int arrNbrs[] = { 2, 2, 2, 1, 2, 2, 10, 1 };
        checkBalance(arrNbrs);
    }

    public static boolean checkBalance(int arr[]) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            for (int j = i + 1; j < arr.length; j++)
                rightSum += arr[j];
            if (leftSum == rightSum)
                return true;
            rightSum = 0;
        }
        return false;
    }

    public static int getMinArrayEl(int arr[]) {
        int min = arr[0];

        for (int item : arr)
            if (item < min)
                min = item;
        return min;
    }

    public static int getMaxArrayEl(int arr[]) {
        int max = arr[0];

        for (int item : arr)
            if (item > max)
                max = item;
        return max;
    }

    public static void binaryArrayInvertItem(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] == 1 ? 0 : 1;
    }

    public static void fillArray(int arr[], int start, int step) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start;
            start += step;
        }
    }

    public static void arrayMultSmallNbr(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6)
                arr[i] *= 2;
    }
}
