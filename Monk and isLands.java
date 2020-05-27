
/*
Monk visits the land of Islands. There are a total of N islands numbered from 1 to N. Some pairs of islands are connected to each other by Bidirectional bridges running over water.
Monk hates to cross these bridges as they require a lot of efforts. He is standing at Island #1 and wants to reach the Island #N. Find the minimum the number of bridges that he shall have to cross, if he takes the optimal route.

Input:
First line contains T. T testcases follow.
First line of each test case contains two space-separated integers N, M.
Each of the next M lines contains two space-separated integers X and Y , denoting that there is a bridge between Island X and Island Y.

Output:
Print the answer to each test case in a new line.

Constraints:
1 ≤ T ≤ 10
1 ≤ N ≤ 104
1 ≤ M ≤ 105
1 ≤ X, Y ≤ N

SAMPLE INPUT 
2
3 2
1 2
2 3
4 4
1 2
2 3
3 4
4 2
SAMPLE OUTPUT 
2
2
*/




import java.util.*;

class Graph {
    public static  int V;   // No. of vertices 
    public static LinkedList<Integer> adj[]; //Adjacency Lists 
   
    // Constructor 
    public Graph(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v;i++) 
            adj[i] = new LinkedList<>(); 

    } 
  
    // Function to add an edge into the graph 
    public static void addEdge(int v,int w) 
    { 
        adj[v].add(w); 
       adj[w].add(v);
    } 
    
      
    static  void Bfs(int s,int dist[])
    {
        boolean visited[] = new boolean[V]; 
      
        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        // Mark the current node as visited and enqueue it 
        visited[s]=true; 
       
        queue.add(s); 
  
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            s = queue.poll(); 
           
            Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    
                    queue.add(n); 
                    dist[n]=dist[s]+1;
                } 
            } 
        } 

    }


   public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int vertices=0,edge=0,X=0,Y=0;
      for(int j=0;j<t ;j++)
      {
          vertices=sc.nextInt();
          edge=sc.nextInt();
          int dist[]=new int[vertices+1];
          Graph g=new Graph(vertices+1);
          
          for(int i=0;i<edge;i++)
          {
              X=sc.nextInt();
              Y=sc.nextInt();

              g.addEdge(X,Y);
          }
          g.Bfs(1,dist);
          System.out.println(dist[vertices]);
      }

    }



}
    
