package pl.gmatusz.confitura2015.viacom.binarytree;

import pl.gmatusz.confitura2015.viacom.binarytree.model.TreeNode;

/**
 * Created by gmatusz on 2015-07-06.
 */
public class TreeNodeUtils {

    public static void invert(TreeNode node) {
        if (node.getRight() != null) {
            invert(node.getRight());
        }
        if (node.getLeft() != null) {
            invert(node.getLeft());
        }

        swapNodeChildrens(node);
    }

    private static void swapNodeChildrens(TreeNode node)  {
        TreeNode tmpNode = node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(tmpNode);
    }
}
