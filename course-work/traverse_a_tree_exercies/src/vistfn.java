import java.util.ArrayList;

public class vistfn {
    // record the information of which
    // tree nodes have been visited
    
    private int sum = 0;
    private ArrayList<Integer> result = new ArrayList<>();

    // dynamic sum of preorder traverse;
    public void dynamic_sum(TreeNode root){
        if(root == null){
           return;
        }
        sum += root.value;
        //System.out.println(sum);
        dynamic_sum(root.left);
        dynamic_sum(root.right);
    }

    // Tree to list, preorder traverse
    public void tree_to_list(TreeNode root){
        if(root == null){
            return;
        }
        result.add(root.value);
        tree_to_list(root.left);
        tree_to_list(root.right);
    }
}
