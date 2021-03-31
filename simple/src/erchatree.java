import java.util.ArrayList;
import java.util.List;

public class erchatree{
    List<Node> list = new ArrayList<Node>();
    Node root;
    public erchatree(){
        init();
    }
    //树的初始化:先从叶节点开始,由叶到根
    public void init(){
        erchatree.Node x = new erchatree.Node("X",null,null);
        erchatree.Node y = new erchatree.Node("Y",null,null);
        erchatree.Node d = new erchatree.Node("d",x,y);
        erchatree.Node e = new erchatree.Node("e",null,null);
        erchatree.Node f = new erchatree.Node("f",null,null);
        erchatree.Node c = new erchatree.Node("c",e,f);
        erchatree.Node b = new erchatree.Node("b",d,null);
        erchatree.Node a = new erchatree.Node("a",b,c);
        root = a;
    }

    private class Node{

        private Node left;
        private Node right;
        private String data;

        public Node(String data,Node left, Node right) {
            this.left = left;
            this.right = right;
            this.data = data;
        }

        public Node() {
        }


    }

    /**
      二叉树前序遍历

     */
    public void preorder(Node node){
        list.add(node);
        if(node.left != null){
            preorder(node.left);
        }
        if(node.right != null){
            preorder(node.right);
        }
    }

    private int getTreeDeep(Node node){
        if(node.left == null && node.right == null){
            return 1;
        }
        int left = 0;
        int right = 0;
        if(node.left != null){
            left  = getTreeDeep(node.right);
        }
        if(node.right != null){
            right = getTreeDeep(node.left);
        }
        return left > right?left+1:right+1;

    }

    public static void main(String[] args) {
        erchatree tree = new erchatree();
        tree.preorder(tree.root);
        for(erchatree.Node node:tree.getResult()){
            System.out.println(node.data);
        }

        int a  = tree.getTreeDeep(tree.root);
        System.out.println(a);
    }

    private List<Node> getResult() {
        return list;
    }


}