class Node{
    int data;

    Node lt;
    Node rt;
    public Node(int value){
        data = value;
        lt=rt=null;
    }

}

public class Main2 {

    Node root;

    public void DFS(Node root){
        if(root == null){
            return;
        }
        else {
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.lt.lt.lt = new Node(6);
        tree.root.lt.lt.rt = new Node(7);
    }
}
