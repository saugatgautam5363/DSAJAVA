public class Queue {
    static class Queue1 {
        int size;
        int rear;
        int[] arr;

        Queue1(int data) {
            this.arr = new int[data];
            this.rear = -1;
            this.size = data;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() {
            if (rear == -1) {
                System.out.println("Queue is empty!!");
            }
            int front = arr[0];
            for (int i = 0; i <rear; i++) {
                arr[i] = arr[i + 1];
            }
            return rear--;
        }

        public void printQueue() {
            if (rear == -1) {
                System.out.println("Queue is empty");
            }
            for (int i = 0; i <=rear; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Queue1 queue = new Queue1(3);
        queue.add(12);
        queue.add(34);
        queue.add(5);
        queue.remove();
        queue.printQueue();
    }
}
