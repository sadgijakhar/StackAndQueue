import java.util.Scanner;
public class QueueImplemenationWithLinkedList {
    Scanner sc = new Scanner(System.in);
;    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    void edit(){
        System.out.println();
        System.out.println("Press 1 to push into Queue");
        System.out.println("Press 2 to pop from Queue");
        System.out.println("Press 3 to check Queue empty or not");
        System.out.println("Press 4 to print the Queue");
        System.out.println("Press 5 to print peek Element");
        System.out.println("Press 6 to exit ");
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
        else if ( option == 3){
            isEmpty();
        }
        else if(option ==4){
            print();
        }
        else if (option == 5){
            peek();
        }
        else if (option == 6){
            exit();
        }
        else{
            System.out.println("Choose a valid Character: ");
            System.out.println();
            edit();
        }
    }

    void push(int num){
        Node node = new Node(num);
        node.next = null;
        if(head == null){
            head = node;
            System.out.println(num + " Pushed Into Queue");
        }
        else{
            Node temp = head;
            while( temp.next != null ){
                temp = temp.next;
            }
            temp.next = node;
            System.out.println(num + " Pushed Into Queue");
        }
        System.out.println();
        edit();
    }

    void pop(){
        Node temp = head;
        System.out.println(head.data + " Element Popped from Queue");
        temp.next = head.next ;
        head = temp.next;
        System.out.println();
        edit();
    }

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        edit();
    }

    void peek(){
        if(head == null){
            System.out.println("UnderFlow");
        }
        else{
            System.out.println("PEEK element is "+ head.data);   
        }
        System.out.println();
        edit();
    }

    void isEmpty(){
        if(head ==  null){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        System.out.println();
        edit();
    }

    void exit(){

    }

    public static void main(String[] args) {
        QueueImplemenationWithLinkedList p = new QueueImplemenationWithLinkedList();
        p.edit();
    }
}
