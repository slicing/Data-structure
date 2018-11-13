package Slow.slicing.red_black_tree;



public class RBTreeAPP {
	private static final int a[] = {10,40,30,60,90,70,20,50,80};
	private static final boolean mDebugInsert = false;
	private static final boolean mDebugDelete = false;

	public static void main(String[] args) {
		int i,ilen = a.length;
		RBTree<Integer> tree = new RBTree<>();
		System.out.println("==原始数据： ");
		for (i = 0;i<ilen;i++)
			System.out.print(a[i] +" ");
		System.out.println();
		for (i = 0;i<ilen;i++){
			tree.insert(a[i]);
			if (mDebugInsert){
				System.out.println(" == 添加节点" + a[i]);
				System.out.println(" == 树的详细信息: ");
				tree.print();
				System.out.println();
			}
		}
		System.out.println("== 前序遍历:");
		tree.prerOder();
		System.out.println("\n== 中序遍历:");
		tree.inOrder();
		System.out.println("\n== 后序遍历:");
		tree.postOrder();
		System.out.println();
		System.out.println(" == 最小值： " + tree.minimum());
		System.out.println(" == 最大值： " + tree.maximum());
		System.out.println(" == 树的详细信息： ");
		tree.print();
		System.out.println();
		if (mDebugDelete){
			for (i=0;i<ilen;i++){
				tree.remove(a[i]);
				System.out.println("==删除结点： " + a[i]);
				System.out.println("==树的详细信息: ");
				tree.print();
				System.out.println();
			}
			tree.clear();
		}

	}
}
