public class P {
    static class Queue{
        int size;
        int[] arr;
        int front = 0;
        int rear;

        Queue(int size){
            this.size = size;
            this.arr = new int[size];
            this.rear = -1;
        }
        public boolean isEmpty(){
            return rear == -1;
        }
        public void add(int data){
            if(rear== size-1){
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = data;
        }
        int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty!!");
                return -1;
            }
            int front = arr[0];
            for(int i =0;i<=rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty!!");
                return -1;
            }
            int peek = arr[front];
            return peek;
        }
        public void print(){
            if(isEmpty()){
                System.out.println("Queue is empty!!");
                return;
            }

            for(int i = 0;i<=rear;i++){
                System.out.println(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(45);
        q.add(18);
        q.add(7);
        q.remove();
        q.print();

        System.out.println("Peek element: "+q.peek());

    }
}
