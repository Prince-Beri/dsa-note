import java.util.*;
public class findModeInBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}
        TreeNode(int val){ this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    // previous value
    Integer prev = null;
    // maximum count 
    int max = 0;
    // frequency of current value
    int count = 1;
    public int[] findMode(TreeNode root) {
        // we are using list because we dont know the fix length of result.
        List<Integer> modes = new ArrayList<>();
        //  helper function.
        traverse(root, modes);
        // making the result array.
        int[] result = new int[modes.size()];
        for(int i = 0; i < modes.size(); i++){
            // filling the values.
            result[i] = modes.get(i);
        }
        // returning the result.
        return result;
    }
    public void traverse(TreeNode node, List<Integer> modes){
        // if node is null return back.
        if(node == null) return;
        // traverse to most left node of the tree.
        traverse(node.left, modes);
        // if prev is not null.
        if(prev != null){
            // compare the prev value with current node.val.
            // if both are same then increment the count.
            if(prev == node.val){
                count++;
            }else{
                // reset the count as 1.
                count = 1;
            }
        }
        // if we find new mode.
        // set the max value and clear the modes list.
        // and update the modes list.
        if(count > max){
            max = count;
            modes.clear();
            modes.add(node.val);
        }else if(count == max){
            modes.add(node.val);
        }
        // set the prev value.
        prev = node.val;

        // traverse the right part of the tree's.
        traverse(node.right, modes);
    }
}
