import java.util.*;
public class kthLargestSumInBinaryTree {
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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Long> list = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            long levelSum = 0l;

            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                levelSum += node.val;
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            list.add(levelSum);
        }

        long[] result = new long[list.size()];
        for(long i = 0; i < list.size(); i++){
            result[(int) i] = list.get((int) i);
        }
        Arrays.sort(result);
        return result[result.length - k];
    }
}
