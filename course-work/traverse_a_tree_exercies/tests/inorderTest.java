import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import static org.junit.Assert.*;
import java.util.Arrays;



public class inorderTest {
    @Test

    public void main() throws Exception{
        inorder intree = new inorder();

        // Build several trees for the test

        // Tree1: no left branch
        int inorder1[] = {1, 2};
        int postorder1[] = {2, 1};
        TreeNode root1 = TreeNode.buildTree(inorder1, postorder1);
        inorder i = new inorder();
        ArrayList<Integer> result1 = i.Inorder(root1);
        ArrayList<Integer> expresult1 = new ArrayList<Integer>();
        expresult1.add(1);
        expresult1.add(2);


        assertEquals(expresult1, result1);

        // Tree2: null tree
        TreeNode root2 = null;
        ArrayList<Integer> result2 = i.Inorder(root2);
        ArrayList<Integer> expresult2 = new ArrayList<>();

        assertEquals(expresult2, result2);


        // Tree3: normal tree
        // root=1 -> leftchild = 2 -> leftchild = 3, rightchild = 3;
        int inorder3[] = {3, 2, 3, 1};
        int postorder3[] = {3, 3, 2, 1};
        TreeNode root3 = TreeNode.buildTree(inorder3, postorder3);
        ArrayList<Integer> result3 = i.Inorder(root3);
        ArrayList<Integer> expresult3 = new ArrayList<Integer>();
        expresult3.add(3);
        expresult3.add(2);
        expresult3.add(3);
        expresult3.add(1);

        assertEquals(expresult3, result3);

    }

}