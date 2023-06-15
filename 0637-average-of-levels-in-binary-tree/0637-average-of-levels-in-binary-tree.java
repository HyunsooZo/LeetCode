import java.util.*;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            double average = sum / size;
            double roundedAverage = Math.ceil(average * 100000) / 100000;  // 소수점 이하 5자리까지 올림
            String formattedAverage = String.format("%.5f", roundedAverage);
            result.add(Double.parseDouble(formattedAverage));
        }

        return result;
    }
}
