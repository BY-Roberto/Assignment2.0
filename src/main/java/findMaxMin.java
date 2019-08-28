public class findMaxMin {
    public Integer findMax(int[] intArray) {
        if (intArray == null || 0 == intArray.length) {
            return null;
        }
        int max = intArray[0];
        for (int i = 0; i < intArray.length - 1; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        return max;
    }
    public Integer findMin(int[] intArray) {
        if (intArray == null || 0 == intArray.length) {
            return null;
        }
        int min = intArray[0];
        for (int i = 0; i < intArray.length - 1; i++) {
            if (min < intArray[i]) {
                min = intArray[i];
            }
        }
        return min;
    }

    public static void main(String [ ] args) {
        System.out.println("hello world");
    }
}
