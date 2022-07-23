import java.util.Scanner;
public class StackImplementationWithLinkedList {
    Scanner sc = new Scanner(System.in);
    class Node{
        Node next ;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    void edit(){
        System.out.println("Press 1 to push into stack");
        System.out.println("Press 2 to pop from stack");
        System.out.println("Press 3 to check stack empty or not");
        System.out.println("Press 4 to print the stack");
        System.out.println("Press 5 to exit ");
        System.out.print("Enter Your Choice: ");
        int option = sc.nextInt();
        if(option == 1){
            System.out.print("Enter a element to push in Stack: ");
            int x = sc.nextInt();
            push(x);
        }
        else if(option == 2){
            pop();
        }
        else if ( option == 3){
            isEmpty();
        }
        else if(option ==4){
            print();
        }
        else if (option == 5){
            exit();
        }
        else{
            System.out.println("Choose a valid Character: ");
            System.out.println();
            edit();
        }
    }
    
    void push(int x){
        Node node = new Node(x);
        node.next = head;
        head = node;
        System.out.println(x + " Pushed into Stack ");
        System.out.println();
        edit();
    }
    void pop(){
        Node temp = head;
        if(temp != null){
            System.out.println(temp.data + " Popped from Satck ");
            head = temp.next;
            System.out.println();
            edit();
        }
        else{
            System.out.println("Stack Is Empty ");
            System.out.println();
            edit();
        }
        
    }
    void isEmpty(){
        if(head == null){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        System.out.println();
        edit();
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
        edit();
    }
    void exit(){

    }
    public static void main(String[] args) {
        StackImplementationWithLinkedList s = new StackImplementationWithLinkedList();
        s.edit();
    }
}
