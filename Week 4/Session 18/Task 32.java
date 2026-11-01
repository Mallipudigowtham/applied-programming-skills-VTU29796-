class Solution {

    private void rightViewHelper(TreeNode node, LinkedHashMap<Integer, Integer> map, int level) {
        if (node == null) return;
        map.putIfAbsent(level, node.val);
        rightViewHelper(node.right, map, level + 1);
        rightViewHelper(node.left, map, level + 1);

    }


    public List<Integer> rightSideView(TreeNode node) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        rightViewHelper(node, map, 0);
        return map.values().stream().toList();
    }
}
