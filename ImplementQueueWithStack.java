import java.util.Scanner;
import java.util.Stack;
public class ImplementQueueWithStack {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> s = new Stack<>();
    Stack<Integer> s1 = new Stack<>();
    void edit(){
        System.out.println();
        System.out.println("Press 1 to push into Queue");
        System.out.println("Press 2 to pop from Queue");
        System.out.println("Press 3 Peek Value of Queue");
        System.out.println("Press 4 to exit ");
        System.out.print("Enter Your Choice: ");
        int option = sc.nextInt();
        if(option == 1){
            System.out.print("Enter a element to push in Queue: ");
            int x = sc.nextInt();
            push(x);
        }
        else if(option == 2){
            pop();
        }
        else if(option ==3){
            peek();
        }
        else if (option == 4){
            exit();
        }
        else{
            System.out.println("Choose a valid Character: ");
            System.out.println();
            
            edit();
        }
    }
    void push(int x){
        s.push(x);
        System.out.println("Element Pushed Into Queue: " + x);
        System.out.println();
        edit();
    }
    void pop(){
        while(!s.isEmpty()){
            s1.push(s.pop());
        }
        System.out.println(s1.pop() + " Element popped from Queue");
        while(!s1.isEmpty()){
            s.push(s1.pop());
        }
        System.out.println();
        edit();
    }
    void peek(){
        while(!s.isEmpty()){
            s1.push(s.pop());
        }
        System.out.println(s1.peek() + " Peek Element of the Queue");
        while(!s1.isEmpty()){
            s.push(s1.pop());
        }
        System.out.println();
        edit();
    }
    void exit(){

    }
    public static void main(String[] args) {
        ImplementQueueWithStack q = new ImplementQueueWithStack();
        q.edit();
    }
}
