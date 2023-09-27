package Tree;

public class BST {
	static class tree{
		int data;
		tree left;
		tree right;
		public tree(int data){
			this.data=data;
		}
	}
	public static tree delete(tree root , int value) {
		if (root == null) {
	        return null; // Node not found
	    }
		if(root.data>value) {
			root.left=delete(root.left,value);
			
		}
		else if(root.data<value) {
			root.right=delete(root.right,value);
		}
		else {
			//case 1 wheen there is no child 
			if(root.left==null&& root.right==null) {
				return null;
			}
			//case 2 if one child is present 
			if(root.left==null) {
				return root.right;
				
			}else if(root.right==null) {
				return root.left;
			}
			//case 3 if both child aew there 
			tree is =inorderSuccessor(root.right);
			root.data=is.data;
			root.right=delete(root.right,value);
							

		}
		return root;
	}
	
	public static tree inorderSuccessor(tree root) {
		while(root.left!=null) {
			root=root.left;
		}
		return root;
	}
	
	public static boolean search(tree root,int value) {
		if(root==null) {
			return false;
		}
		if(value==root.data) {
			return true;
		}
		if(value<root.data) {
			return search(root.left,value);
		}else {
			return search(root.right,value);
		}
	}
		
	public static tree insertNode(tree root,int value) {
		if(root==null) {
			root=new tree(value);
			return root;
		}
		if(root.data>value) {
		root.left=	insertNode(root.left,value);
		} else {
		root.right=	insertNode(root.right,value);
		}	
			
		return root;
		
	}
	
	public static void  inOrder(tree root) {
		if(root==null) {
			return ;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static void  preOrder(tree root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void  postOrder(tree root) {
		if(root==null) {
			return ;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}
public static void main(String[] args) {
	tree root=null;
	int values[]= {5,1,3,4,2,7,9};
	int n=values.length;
	for(int i=0;i<n;i++) {
		root=insertNode(root,values[i]);
	}
	System.out.println(" in order  ");

	
	inOrder(root);
	System.out.println();
	System.out.println("  preorder ");

	preOrder(root);
	System.out.println();
	
	System.out.println("  postOrder ");

	postOrder(root);
	System.out.println();
	System.out.println("after search");
	System.out.println(search(root,3));
	System.out.println();
	System.out.println("after dlete");
	delete(root,6);
	System.out.println();

System.out.println(" in order  ");

	
	inOrder(root);
	System.out.println();

	
}
}
