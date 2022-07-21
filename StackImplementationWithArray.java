public class StackImplementationWithArray {
    static int max = 10;
    int top;
    int arr[] = new int[max];
    
    void isEmpty(){
        if(top < 0){
            System.out.println("Stack Is Empty");
        }
        else{
            System.out.println("Stack is not Empty");
        }
    }
    StackImplementationWithArray(){
        top = -1;
    }
    void push(int x){
        if(top > max-1){
            System.out.println("OverFlow");
        }
        else{
            arr[++top] = x;
            System.out.println(x+" pushed in the stack");
        }
    }
   void pop(){
        if(top < 0){
            System.out.println("UnderFlow");
        }
        else{
            System.out.println(arr[top--] + " popped from stack");
        }
    }
    void peek(){
        if(top < 0){
            System.out.println("UnderFlow");
        }
        else{
            System.out.println("The Peek Element "+arr[top]);
        }
    }
    void print(){
        System.out.print("Element Left in Stack: ");
        for(int i = top ; i >= 0 ; i--){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        StackImplementationWithArray p = new StackImplementationWithArray();
        p.isEmpty();
        p.push(10);
        p.pop();
        p.push(20);
        p.push(30);
        p.peek();
        p.print();
    }
}
