/******************************************************************************
height of A Binary Tree

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
    public static int Height(Node root)
    {
        if (root== null)
        return 0;
        int lh=0,rh=0;
        if (root.left!=null)
        {
            lh=Height(root.left);
        }
        if (root.right!=null)
        {
            rh=Height(root.right);
            
        }
        if (lh>rh)
        {
            return lh+1;
        }
        else 
        {
            return rh+1;
        }
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
	
		int heightOfTree=Height(root);
		System.out.println("Height of tree: " +heightOfTree);
	}
}
