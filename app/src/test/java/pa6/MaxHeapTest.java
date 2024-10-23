
package pa6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxHeapTest {

    @Test
    void testInsert() {
        MaxHeap heap = new MaxHeap(5);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        assertEquals(8, heap.peek());
    }

    @Test
    void testDelete(){
        MaxHeap heap = new MaxHeap(5);
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(2);
        assertEquals(8, heap.delete());
        assertEquals(5, heap.peek());
    }

    @Test
    void testPeek(){
        MaxHeap heap = new MaxHeap(5);
        heap.insert(5);
        heap.insert(3);
        assertEquals(5, heap.peek());
        heap.insert(8);
        assertEquals(8, heap.peek());
    }

    @Test
    void testIsEmpty(){
        MaxHeap heap = new MaxHeap(5);
        assertEquals(true, heap.isEmpty());
        heap.insert(5);
        assertEquals(false, heap.isEmpty());
    }

    @Test
    void testSize() {
        MaxHeap heap = new MaxHeap(5);
        assertEquals(0, heap.size());
        heap.insert(5);
        heap.insert(3);
        assertEquals(2, heap.size());
    }

    @Test
    void testHeapSort(){
        MaxHeap heap = new MaxHeap(5);
        int[] unsorted = {5, 3, 8, 1, 2, 7};
        int[] sorted = MaxHeap.heapSort(unsorted);
        assertArrayEquals(new int[]{8, 7, 5, 3, 2, 1}, sorted);
    }

    
}
