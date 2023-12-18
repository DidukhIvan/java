public class Lab4 {
    public static void main(String[] args) {
        // Заданий масив для завдання 1
        int[] array1 = {1, -2, -3, -4, 5};

        // Знаходимо кількість від'ємних чисел в масиві (завдання 1)
        int negativeCount = countNegativeNumbers(array1);
        System.out.println("Quantity of negative numbers: " + negativeCount);

        // Заданий масив для завдання 2
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        // Знаходимо номер найбільшого за модулем елемента в масиві (завдання 2)
        int maxAbsoluteIndex = findMaxAbsoluteElementIndex(array2);
        System.out.println("Number of the biggest element: " + maxAbsoluteIndex);

        // Заданий масив для завдання 3
        int[] array3 = {1, 2, 3, 4, 5};

        // Сформувати новий масив згідно з умовами (завдання 3)
        int[] modifiedArray = modifyArray(array3);

        // Вивести результат
        System.out.print("Original array: ");
        printArray(array3);

        System.out.print("Modified array: ");
        printArray(modifiedArray);
    }

    // Завдання 1: Знаходження кількості від'ємних чисел в масиві
    private static int countNegativeNumbers(int[] array) {
        int count = 0;

        for (int number : array) {
            if (number < 0) {
                count++;
            }
        }

        return count;
    }

    // Завдання 2: Знаходження номера найбільшого за модулем елемента в масиві
    private static int findMaxAbsoluteElementIndex(int[] array) {
        int maxAbsoluteIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) > Math.abs(array[maxAbsoluteIndex])) {
                maxAbsoluteIndex = i;
            }
        }

        return maxAbsoluteIndex;
    }

    // Завдання 3: Модифікація масиву
    private static int[] modifyArray(int[] array) {
        int[] resultArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                resultArray[i] = array[i] * -1;
            } else if (array[i] > 0) {
                resultArray[i] = array[i] - 3;
            } else {
                resultArray[i] = -2;
            }
        }

        return resultArray;
    }

    // Виведення масиву
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}