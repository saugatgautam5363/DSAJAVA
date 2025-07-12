public class HeapShort {
    private int[] heap;
    private int size;
    private int capacity;

    public HeapShort(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }



    public void insert(int val) {
        if (size == capacity) {
            System.out.println("Heap full");
            return;
        }
        heap[size] = val;
        int current = size;
        size++;

        while (current > 0 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int extractMax() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);
        return max;
    }

    private void heapify(int i) {
        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] > heap[largest])
            largest = left;

        if (right < size && heap[right] > heap[largest])
            largest = right;

        if (largest != i) {
            swap(i, largest);
            heapify(largest);
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
         HeapShort heap = new HeapShort(10);

        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);

        heap.printHeap();

        System.out.println("Max: " + heap.extractMax());
        heap.printHeap();
    }
}
