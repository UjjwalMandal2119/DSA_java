package Tree;

public class BinaryTree_Client {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display(); 
        System.out.println(bt.find(70));
        System.out.println(bt.max());
        System.out.println(bt.height());
        bt.PreOrder();
        bt.PostOrder();
        bt.InOrder();
        bt.LeverOrder();
    }
}
// Input
// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false

// output
// 20<--10-->30
// 40<--20-->50
// .<--40-->.
// .<--50-->.
// .<--30-->60
// 70<--60-->.
// .<--70-->.
//time complexity O(n)