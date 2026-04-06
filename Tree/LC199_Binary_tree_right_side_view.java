package Tree;

import java.util.ArrayList;
import java.util.List;

public class LC199_Binary_tree_right_side_view {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {

      }

      TreeNode(int val) {
         this.val = val;
       }

      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    class Solution {
        int visited =-1;
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> ll =new ArrayList<>();
        view(root, 0, ll);
        return ll;
    }

    public void view(TreeNode root, int currlevel, List<Integer> ll){
        if(root == null){
            return;
        }
        if(currlevel >visited){
            ll.add(root.val);
            visited =currlevel;
        }
        view(root.right, currlevel +1, ll);
        view(root.left, currlevel+1, ll);
    }
}
}
