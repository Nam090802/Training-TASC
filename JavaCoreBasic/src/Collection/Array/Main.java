package Collection.Array;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr2 = {1,2,3,4,5};
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
