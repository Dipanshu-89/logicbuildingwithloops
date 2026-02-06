package recursion;
public class mergesort {
    static void mergesort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergesort(a, l, m);
            mergesort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }
    static void merge(int[] a, int l, int m, int r) {
        int[] t = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            t[k++] = (a[i] < a[j]) ? a[i++] : a[j++];

        while (i <= m) t[k++] = a[i++];
        while (j <= r) t[k++] = a[j++];

        for (i = 0; i < t.length; i++)
            a[l + i] = t[i];
    }
    public static void main(String[] args) {
        int[] a = {5, 3, 1, 4, 2};
        mergesort(a, 0, a.length - 1);
        for (int x : a) System.out.print(x + " ");
    }
}

