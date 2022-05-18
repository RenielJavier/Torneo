package mycontainers;

public class Node {
	/*attributes*/
	private String value;
	Node succ;
	public Node(String value) {
		this.value=value;
		this.succ=null;
	}
	public Node(String value,Node succ) {
		this.value=value;
		this.succ=succ;
	}
	public Node getSucc() {
		return succ;
	}
	public void setSucc(Node succ) {
		this.succ = succ;
	}
	public void setValue(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}
	@Override
	public String toString() {
		if(succ==null) {
		return "Node [value=" + value + "]";
		}else if(succ!=null)return "Node [value=" + value + ", succ="+ succ +"]";
		return "";
	}
}
