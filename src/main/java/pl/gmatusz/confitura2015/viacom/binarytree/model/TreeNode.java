package pl.gmatusz.confitura2015.viacom.binarytree.model;

/**
 * Created by gmatusz on 2015-07-06.
 */
public class TreeNode {
    protected int val;
    protected TreeNode left;
    protected TreeNode right;


    public TreeNode(int x) { val = x; }

    public int getVal() {
        return val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}