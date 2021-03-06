package tree;

import java.util.Objects;

/**
 * @author yeobi Created 2020-02-21
 * @description 후위순회
 */
public class PostorderTraverse implements TreeTraverse {

    @Override
    public void traverse(BinaryTreeNode node) {
        if (Objects.isNull(node)) {
            return;
        }

        traverse(node.getLeftSubTree());    // 왼쪽 서브 트리
        traverse(node.getRightSubTree());   // 오른쪽 서브 트리
        System.out.print(node.toString()); // 루트
    }

}
