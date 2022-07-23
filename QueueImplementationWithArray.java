public class QueueImplementationWithArray {
    static int [] arr = new int[10];
    static int pointer = -1 ;
    void push(int x){
        if(pointer < 10){
            arr[pointer+1] = x;
            pointer++;
            System.out.println(x +" Pushed into Queue ");
        }
        else{
            System.out.println("Queue Overflow");
        }
    }
    void pop(){
        if(pointer > -1){
           
            for(int i = 0 ; i <= pointer+1 ;i++){
                arr[i] = arr[i+1]+arr[i];
                arr[i+1] = arr[i] - arr[i+1];
                arr[i] = arr[i] - arr[i+1];
            }
            System.out.println(arr[pointer+2] + " Popped from queue ");
            pointer--;
        }
        else{
            System.out.println("Queue UnderFlow");
        }
    }
    void print(){
        System.out.print("Elements Left in the Queue: ");
        for(int i = 0 ; i <= pointer ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    void isEmpty(){
        if(pointer < 1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    void peek(){
        System.out.println("Peek Element "+arr[0]);
    }
    public static void main(String[] args) {
        QueueImplementationWithArray p = new QueueImplementationWithArray();
        for(int i = 0 ; i < 10 ; i++){
            arr[i] = 0;
        }
        p.isEmpty();
        p.push(10);
        p.print();
        p.pop();
        p.push(20);
        p.push(30);
        p.peek();
        p.pop();
        p.print();
    }
}
