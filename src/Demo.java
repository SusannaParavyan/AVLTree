public class Demo {

    public static void main(String[] args) {

        System.out.println("AVLTree:");
        AVLTree<Integer> bst = new AVLTree<Integer>();
        try {
            bst.insert(4);
            bst.insert(1);
            bst.insert(2);
            bst.insert(8);
            bst.insert(9);
            bst.insert(3);

            bst.remove(4);
            bst.remove(3);
            bst.remove(9);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(bst.infixTraverse());
        /*System.out.println(bst.prefixTraverse());

        bst.remove(3);
        System.out.println(bst.infixTraverse());
        System.out.println(bst.prefixTraverse());

        System.out.println(bst.exists(2));
        System.out.println(bst.exists(11));

        System.out.println(bst.find(8).prefixTraverse());
           */
    }

}
