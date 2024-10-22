
package pa6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MinHeapTest {

    @Test
    void testInsert() {
        MinHeap heap = new MinHeap(5);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        assertEquals(1, heap.peek());
    }

    @Test
    void testDelete(){
        MinHeap heap = new MinHeap(5);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        assertEquals(1, heap.delete());
        assertEquals(2, heap.peek());
    }

    @Test
    void testPeek(){
        MinHeap heap = new MinHeap(5);
        heap.insert(5);
        heap.insert(3);
        assertEquals(3, heap.peek());
        heap.insert(1);
        assertEquals(1, heap.peek());
    }

    @Test
    void testIsEmpty(){
        MinHeap heap = new MinHeap(5);
        assertEquals(true, heap.isEmpty());
        heap.insert(5);
        assertEquals(false, heap.isEmpty());
    }

    @Test
    void testSize() {
        MinHeap heap = new MinHeap(5);
        assertEquals(0, heap.size());
        heap.insert(5);
        heap.insert(3);
        assertEquals(2, heap.size());
    }

    @Test
    void testHeapSort(){
        MinHeap heap = new MinHeap(5);
        int[] unsorted = {5, 3, 8, 1, 2, 7};
        int[] sorted = MinHeap.heapSort(unsorted);
        assertArrayEquals(new int[]{1, 2, 3, 5, 7, 8}, sorted);
    }
}
