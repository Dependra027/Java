
public class LinearSearch {
    public static int linearsearch(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 4;
        int index = linearsearch(a, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("Fount at index " + index);
        }
    }
}