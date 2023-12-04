import java.util.*;

public class findTheLargestValueInEachRow {

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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        queue.offer(root);
        result.add(root.val);

        while(!queue.isEmpty()){
            int size = queue.size();
            int maxi = Integer.MIN_VALUE;

            for(int i = 0; i < size; i++){
                TreeNode node = queue.remove();
                maxi = Math.max(maxi, node.val);
                
                if(node.left != null){
                    queue.add(node.left);
                } 

                if(node.right != null){
                    queue.add(node.right);
                }
            }
            result.add(maxi);
            
        }

        return result;
    }
}