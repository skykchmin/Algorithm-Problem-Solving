
class Node{
    int data; // 번호 1, 2, ... , 7
    Node lt, rt; // 왼쪽, 오른쪽 노드 주소(객체 주소를 저장)

    public Node(int val){
        data = val;
        lt=rt=null;
    }
}

public class Main {
    Node root;
    public void DFS(Node root){
        if(root == null){
            return;
        } else {
            System.out.print(root.data+" ");
            DFS(root.lt); // 왼쪽으로 뻗는다
            DFS(root.rt); // 오른쪽으로 뻗는다
        }

    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);
    }

}
