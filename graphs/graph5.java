import java.util.*;
public class graph5 {
    static class edge{
        vertex destination_vertex;
        edge next_edge;
    }
    static class vertex
    {
        String vertex_info;
        vertex vertex_next;
        edge adjacent_edge;
    }
    public static void main(String args[])
    {
        vertex p;
        Scanner sc=new Scanner(System.in);
        vertex start=null;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
             p=new vertex();
            p.vertex_info=sc.next();
            p.vertex_next=null;
            p.adjacent_edge=null;
            if(start==null)
            {
                start=p;
            }
            else
            {
                p.vertex_next=start;
                start=p;
            }
        }
       int  no_edges=sc.nextInt();
        for(int i=0;i<no_edges;i++)
        {
           String src=sc.next();
           String dest=sc.next();
           p=start;
         while(p!=null&&p.vertex_info!=src)
         {
             p=p.vertex_next;
         }
        vertex  q=start;
         while(q!=null&&q.vertex_info!=dest)
         {
             q=q.vertex_next;
         }
         if(p==null||q==null)
         {
             System.out.println("please enter correct src and dest");
         }
         else
         {
             edge t=new edge();
             t.destination_vertex=q;
             t.next_edge=p.adjacent_edge;
             p.adjacent_edge=t;
         }
        }
        
    }
}
