import java.util.Arrays;
import java.util.Random;

public class ArrayShuffler {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original Array: " + Arrays.toString(numbers));

        shuffleArray(numbers);

        System.out.println("Shuffled Array: " + Arrays.toString(numbers));
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            // Swap array[i] with array[index]
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
