import java.util.Scanner;
import java.util.Stack;
public class FindMinimumElementFromStack {
    static Stack<Integer> s = new Stack<>();
    void Minimum(){
        Stack<Integer> s1 = new Stack<>();
        while(s.size()>1){
            int a = s.pop();
            int b = s.pop();
            if(a < b){
                s1.push(b);
                s.push(a);
            }
            else{
                s1.push(a);
                s.push(b);
            }
        }
        System.out.println("Minimum Element of the Stack: " +s.pop());
    }
    public static void main(String[] args) {
        FindMinimumElementFromStack k = new FindMinimumElementFromStack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Stack: ");
        int n = sc.nextInt();
        for (int i=0 ;i<n ;i++){
            System.out.print("Enter "+(i+1)+" element to push in Stack:  ");
            s.push(sc.nextInt());
        }
        k.Minimum();
        sc.close();
    }
}
