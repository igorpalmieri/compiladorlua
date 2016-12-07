package analyzer;

public class AbstractNode {
	LUAToken token;
	Node left;
	Node right;
	Node right2;
	
	public AbstractNode(LUAToken token, Node left, Node right){
		this.token = token;
		this.left = left;
		this.right = right;
	}
	public AbstractNode(LUAToken token, Node left, Node right, Node right2){
		this.token = token;
		this.left = left;
		this.right = right;
		this.right2 = right2;
	}
}
