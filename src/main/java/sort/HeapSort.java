package sort;

import java.util.Arrays;

public class HeapSort {
    public static void swap(int[] tree, int i, int j){
        int temp = tree[i];
        tree[i] = tree[j];
        tree[j] = temp;
    }

    public static void heapifyR(int[] tree, int i, int length){
        if (i >= length) return;
        int max = i, c1 = 2 * i + 1, c2 = 2 * i + 2;
        if (c1 < length && tree[c1] > tree[max]){
            max = c1;
        }
        if (c2 < length && tree[c2] > tree[max]) {
            max = c2;
        }

        if (max != i){
            swap(tree,max,i);
            heapifyR(tree,max,length);
        }
    }

    public static void buildTree(int[] a, int length){
        int lastNodeIndex = length - 1;
        int lastFatherIndx = (lastNodeIndex - 1) / 2;
        for (int i = lastFatherIndx; i >= 0 ; i--) {
            heapifyR(a, i, length);
        }
    }

    public static void heapSort(int[] a){
        System.out.println(Arrays.toString(a));
        System.out.println("bulid tree!");
        for (int i = 0; i < a.length; i++) {
            buildTree(a, a.length - i);
            System.out.println(Arrays.toString(a));

            swap(a, 0, a.length-1-i);
        }
    }

}
