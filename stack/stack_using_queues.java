import java.util.*;
public class stack_using_queues {
    Queue<Integer> q1=new  LinkedList<>();
     Queue<Integer> q2=new  LinkedList<>();
     int size;
    public stack_using_queues()
    {
         int size=0;
    }
    public  void  push(int x)
    {
        size++;
        q2.add(x);
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.remove();          
        }
        Queue<Integer>q=    q1;
        q1=q2;
        q2=q;
    }
    public  void pop()
    {
        if(q1.isEmpty())
        {
            return;
        }
        q1.remove();
        size--;
    }
    public  int size()
    {
        return size;
    }
    public int top()
    {
        if(q1.isEmpty())
        {
            return -1;
        }
        else{
            return q1.peek();
        }
    }
    public static void main(String args[])
    {
     stack_using_queues s=new stack_using_queues();
     s.push(2);
     s.push(5);
     s.push(7);
     s.push(9);
     System.out.println("current size: " + s.size());
     System.out.println(s.top());
     s.pop();
     System.out.println("current size: " + s.size());
      System.out.println(s.top());
       s.pop();
     System.out.println("current size: " + s.size());
      System.out.println(s.top());
       s.pop();
     System.out.println("current size: " + s.size());
      System.out.println(s.top());
       s.pop();
     System.out.println("current size: " + s.size());
      System.out.println(s.top());
    }
}
