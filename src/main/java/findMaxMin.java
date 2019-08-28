

public class findMaxMin {
    public static Integer findMax(int[] intArray) {
        if (intArray == null || 0 == intArray.length) {
            return null;
        }
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        return max;
    }
    public static Integer findMin(int[] intArray) {
        if (intArray == null || 0 == intArray.length) {
            return null;
        }
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
            }
        }
        return min;
    }

}
