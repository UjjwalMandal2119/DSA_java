package Tree;

import java.util.Scanner;

public class BinaryTree {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    Scanner sc = new Scanner(System.in);
    private Node root;
    public BinaryTree(){
        root=CreateTree();
    }

    private Node CreateTree(){
        int item=sc.nextInt();
        Node nn= new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean(); //hlc=hasLeftChild
        if(hlc){
            nn.left = CreateTree();
        }
        boolean hrc = sc.nextBoolean(); //hrc =hasRightChild
        if(hrc){
            nn.right=CreateTree();
        }
      return nn;
    }
     
    public void Display(){
        Display(root);
    }
    private  void Display(Node node){
        if(node == null){
            return;
        }
        String s="";
        s="<--" + node.val + "-->";
        if(node.left != null){
           s= node.left.val + s;
        }else{
          s ="." + s;
        }
        if(node.right != null){
            s =s + node.right.val;
        }else{
            s= s + ".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }

    //searching a node 
    public boolean find(int item){
        return find(this.root, item);
    }
    private boolean find(Node nn, int item){
        if(nn == null){
           return false;
        }
        if(nn.val == item){
            return true;
        }
        boolean left = find(nn.left, item);
        boolean right =find(nn.right, item);
        return left || right;
    }

    public int max(){
        return max(this.root);
    }

    private int max(Node node){
     if(node ==null){
        return Integer.MIN_VALUE;
     }

        int left= max(node.left);
        int right =max(node.right);
        return Math.max(node.val,Math.max(left, right) );
    }

    //for height calculation of Binary tree ==max distance between root to leaf node
    public int height(){
        return height(this.root);
    }
    private int height(Node node){
        if(node == null){
           return 0;
        }
        int left= height(node.left);
        int right= height(node.right);

        return Math.max(left, right) +1;
    }
}
