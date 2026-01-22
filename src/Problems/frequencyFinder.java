package Problems;

public class frequencyFinder {

    // method to return frequency of a given element in an int array
    public static int getFrequency(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;

        int frequency = getFrequency(numbers, target);
        System.out.println("Frequency " + target + " = " + frequency);
    }
}

