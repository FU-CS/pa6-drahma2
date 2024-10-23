package pa6;

// Uncomment the following class to get started

public class MinHeap implements Heap {
    private int[] data;
    private int mincap = 10;
    private int size = 0;

    public MinHeap(int mincap){
        this.data = new int[this.mincap];
    }

    private void swap(int i, int j){
        int tmp = this.data[i];
        this.data[i] = this.data[j];
        this.data[j] = tmp;
    }

    public void insert(int value){
        this.data[this.size] = value;
        this.size = this.size + 1;
        int i = this.size - 1;
        while (data[i] < data[(i)/2]){
            int parent_idx = (i)/2;
            int parent = this.data[parent_idx];
            if (value < parent){
                this.swap(i, parent_idx);
            }
            i = parent_idx;
        }
    }

    public int delete(){
        int root = this.data[0];
        this.data[0] = this.data[this.size - 1];
        size = size - 1;
        
        int i = 0;
        while (i < size){
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;
            if (left < size && data[left] < data[smallest]){
                smallest = left;
            }
            if (right < size && data[right] < data[smallest]){
                smallest = right;
            }
            if (smallest == i){
                break;
            }

            swap(i, smallest);
            i = smallest;
        }
        return root;
    }

    public int peek(){
        return this.data[0];
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void print(){
        for (int i = 0; i < size; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public MinHeap() {
        this.data = new int[this.mincap];
    }

    public static int[] heapSort(int[] array){
        MinHeap minHeap = new MinHeap();

        for (int i = 0; i < array.length; i++) {
            minHeap.insert(array[i]);
        }

        int[] sorted = new int[array.length];

        for (int i = 0; i < sorted.length; i++){
            sorted[i] = minHeap.delete();
        }
        return sorted;
    }

}
