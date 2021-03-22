import org.junit.jupiter.api.Test;
import sort.HeapSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class testHeapSort{
    @Test
    public void testHeapify(){
        int[] heap = new int[]{1,2,3};
        int[] expected = new int[]{3,2,1};
        HeapSort.heapifyR(heap,0,3);
        assertArrayEquals(expected, heap);
    }

    @Test
    public void testHeapsort(){
        int[] raw = new int[]{2,3,7,5,1,4,9,0,10,6,8};
        int[] expectd = new int[]{0,1,2,3,4,5,6,7,8,9,10};

        HeapSort.heapSort(raw);
        assertArrayEquals(expectd, raw);

    }
}
