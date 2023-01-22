public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+ sum1 + " рублей");
    }

    public static void task2() {
        System.out.println("Task 2");
        int[] arr = generateRandomArray();
        int max = 0;
        int min = arr[4];
        System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальная суточная трата за месяц составила "+ max + " рублей");
        System.out.println("Минимальная суточная трата за месяц составила "+ min + " рублей");
    }

    public static void task3() {
        System.out.println("Task 3");
        int[] arr = generateRandomArray();

    }

    public static void task4() {
        System.out.println("Task 4");
        int[] arr = generateRandomArray();

    }
}