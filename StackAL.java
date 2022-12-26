import java.util.ArrayList;

public class StackAL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack {
      public static Node head;
      public static void  push(int data){
        Node newnode=new Node(data);
        if (head==null) {
            head=newnode;
        }
            newnode.next=head;
            head=newnode;
      }
      public static boolean isEmpty() {
        return head==null;
                        
  }
  public static int pop(){
          if (isEmpty()) {
            return -1;
            
          }
         Node top = head.data;
         head = head.next;
         return top.data;
}
public static int peek ()
{
    if (isEmpty()) {
        System.out.println("underflow");
        return -1;
        
    }
    Node top=head.data;
    return top;
}
}
public static void main(String[] args) {
    Stack llo= new Stack();
    llo.push(34);
    llo.push(23);
    llo.push(33);
    while (!Stack.isEmpty()) {
        System.out.println(llo.peek());
        llo.push();
        
    }
}
}
