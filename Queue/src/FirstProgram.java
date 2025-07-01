public class FirstProgram {
    static class Queue {
        int size;
        int arr[];
        int rear;

        Queue(int data) {
            this.arr = new int[data];
            this.size = data;
            this.rear = -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(9);
        queue.add(8);
        queue.add(0);
        queue.printQueue(); // Output: 9 8 0

        queue.remove(); // Output: 9
        queue.printQueue(); // Output: 8 0
    }
}
