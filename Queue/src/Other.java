public class Other {
    static class Queue2{
        int rear;
        int[] arr;
        int size;

        Queue2(int data){
            this.arr = new int[data];
            this.rear = -1;
            this.size = data;
        }
    public void add(int data){
        if(rear == size-1){
            System.out.println("queue is full");
        }
        rear++;
        arr[rear] = data;
    }
    public int remove(){
            if(rear == -1){
                System.out.println("Queue is empty");
            }
            int front = arr[0];
            for(int i =0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            return rear--;
    }
    public void printQueue(){
            if(rear == -1){
                System.out.println("Queue is empty");
            }
            for(int i = 0;i<=rear;i++){
                System.out.println(arr[i]+" ");
            }
          }
    }

    public static void main(String[] args) {
        Queue2 queue2 = new Queue2(3);
        queue2.add(4);
        queue2.add(8);
        queue2.add(9);
        queue2.remove();
        queue2.printQueue();
    }
}
