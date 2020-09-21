package LL;

class Node { 
    int value; 
    Node left, right; 
  
    public Node(int item) 
    { 
        this.value = item; 
        left = right = null; 
    } 
} 

class Btree {
	 Node root;
	 String r="";
	

	 Btree(int key) 
	 { 
	     root = new Node(key); 
	 } 

	 Btree() 
	 { 
	     root = null; 
	 } 

		
	private Node insert(Node current, int value) {
		if (current == null) {
	        return new Node(value);
	    }
		if(value < current.value) {
			current.left= insert(current.left,value);
		//}else if (value >current.value) {
		}else if (value >=current.value) {	
			current.right = insert(current.right,value);
		}
		else {return current;}
		
		return current;
	}
	
	public void add(int value) {
		root = insert(root, value);		
	}
	

	public void traverseInOrder(Node node) {		
	    if (node != null)    {
	        traverseInOrder(node.left);
	        //System.out.print(" " + node.value);
	        r = r+ node.value +" ";
	        traverseInOrder(node.right);
	    }
		  	    
	}
	
	public void traversePreOrder(Node node) {
	    if (node != null) {
	        //System.out.print(" " + node.value);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	
	public String toString() {	
			this.traverseInOrder(root);
			return r;	
	}
	
	
}


public class BtreeDemo {
	public static void main(String[] args) {
		Btree bt = new Btree(); // root is counted from null
		bt.add(7);
		bt.add(5);
		
		
	 	bt.add(54);
		bt.add(36);
		bt.add(11);
		bt.add(27);
		bt.add(20);
		
		//bt.add(36);
		System.out.println("Print Btree in numerical order String as: ");
	    System.out.println(bt);
	    
	    //System.out.println("traverseInOrder\n");
		//bt.traverseInOrder(bt.root);

		//System.out.println("\n");
		//System.out.println("traversePreOrder\n");
		//bt.traversePreOrder(bt.root); 
	}

}
