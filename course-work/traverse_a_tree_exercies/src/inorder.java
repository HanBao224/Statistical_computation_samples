import java.util.Stack;
import java.util.ArrayList;
import java.util.function.*;


public class inorder {

    // inorder-traverse a tree, built by pre-order
    // traverse and post-order tranverse
    public static ArrayList<Integer> Inorder(TreeNode root) {

        vistfn vist = new vistfn();
        vist.dynamic_sum(root);
        vist.tree_to_list(root);

        // Function Interface:
        // Function: input int, return int.
        // Consumer: input int , no return.
        // Function interface contradicts with java unit test

        //Function<Integer, Integer> vistfn1 = value -> 2 * value ;
        //Consumer<Integer> vistfn2 = value -> System.out.println(value);

        //System.out.println(vistfn1.apply(root.left.value));
        //vistfn2.accept(root.value);


        Stack<TreeNode> temp_stack = new Stack<TreeNode>();
        ArrayList<Integer> tree_inorder = new ArrayList<Integer>();

        TreeNode current = root;
        while(current != null || !temp_stack.empty()){

            while(current != null){
                temp_stack.add(current);
                current = current.left;
            }

            current = temp_stack.pop();
            tree_inorder.add(current.value);
            current = current.right;
        }

        return tree_inorder;
    }
}
