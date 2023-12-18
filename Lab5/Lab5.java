public class Lab5 {
    public static void main(String[] args) {
        // Довільний масив
        int[] array = {64, 25, 12, 22, 11};

        // Bubble Sort
        bubbleSort(array.clone());
        System.out.println("Bubble Sort:");
        printArray(array);

        // Selection Sort
        selectionSort(array.clone());
        System.out.println("Selection Sort:");
        printArray(array);
    }

    // Bubble Sort
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    // обмін елементів, якщо вони у неправильному порядку
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int maxIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // обмін елементів, якщо вони у неправильному порядку
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Виведення масиву
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}