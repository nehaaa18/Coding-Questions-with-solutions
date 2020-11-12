/******************************************************************************
Invert A Binary Tree

*******************************************************************************/
public class Main
{
   static class Node{
    Node left,right;
    int data;
    Node(int item)
    {
        this.data=item;
        left=right=null;
    }
    
} 
    static Node root;
    //Inverting a Binary Tree
    public static Node invertTree(Node root)
    {
      if (root==null)
      {
          return null;
      }
      Node left=invertTree(root.left);
      Node right=invertTree(root.right);
      root.left=right;
      root.right=left;
      return root;
    }
    public static void printTree(Node root)
    {
        if (root==null)
        {
            return;
        }
        printTree(root.left);
        System.out.print(root.data+" ");
        printTree(root.right);
    }
    
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Main graph=new Main();
		graph.root=new Node(4);
		graph.root.left=new Node(2);
		graph.root.left.left=new Node(1);
		graph.root.left.right=new Node(3);
		graph.root.right=new Node(7);
		graph.root.right.left=new Node(6);
		graph.root.right.right=new Node(9);
		printTree(root);
		invertTree(root);
		printTree(root);
		
	}
}
