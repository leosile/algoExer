public class HeapSort {
    public static void swap(int[] tree, int i, int j){
        int temp = tree[i];
        tree[i] = tree[j];
        tree[j] = temp;
    }

    public static void heapifyR(int[] tree, int i, int length){
        int max = i, c1 = 2 * i + 1, c2 = 2 * i + 2;
        if (c1 < length && tree[c1] > tree[i]){
            max = i;
        }
        if (c2 < length && tree[c2] > tree[i]){
            max = i;
        }

        if (max != i){
            swap(tree,max,i);
            heapifyR(tree,max,length);
        }
    }

    public static void buildTree(int[] a, int length){
        int lastFatherIndx = ((a.length - 1) - 1) / 2;
        for (int i = lastFatherIndx; i >= 0 ; i--) {
            heapifyR(a, i, length);
        }
    }

    public static void heapSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            buildTree(a, a.length - i);
            swap(a, 0, a.length-1-i);
        }
    }

}
