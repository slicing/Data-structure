package Slow.slicing.red_black_tree;

import java.util.PrimitiveIterator;

public class RBTree<T extends Comparable<T>>{
	private RBNode<T> mRoot;
	private static final boolean RED = false;
	private static final boolean BLACK = true;
	public class RBNode<T extends Comparable<T>>{
		boolean color;
		T key;
		RBNode<T> left;
		RBNode<T> right;
		RBNode<T> parent;

		public RBNode(boolean color, T key, RBNode<T> left, RBNode<T> right, RBNode<T> parent) {
			this.color = color;
			this.key = key;
			this.left = left;
			this.right = right;
			this.parent = parent;
		}
		public T getKey(){
			return key;
		}

		@Override
		public String toString() {
			return "RBNode{" +
					"color=" + color +
					", key=" + key +
					'}';
		}
	}
	public RBTree(){
		mRoot = null;
	}
	private RBNode<T> parentOf(RBNode<T> node){
		return node != null ? node.parent : null;
	}
	private boolean colorOf(RBNode<T> node){
		return node!=null ? node.color : BLACK;
	}
	private boolean isRed(RBNode<T> node){
		return ((node != null) && (node.color == RED)) ? true:false;
	}
	private boolean isBlack(RBNode<T> node){
		return !isRed(node);
	}
	private void setBlack(RBNode<T> node){
		if (node!=null)
			node.color = BLACK;
	}
	private void serRed(RBNode<T> node){
		if (node!=null)
			node.color = RED;
	}
	private void setParent(RBNode<T> node,RBNode<T> parent){
		if (node!=null)
			node.parent = parent;
	}
	private void setColor(RBNode<T> node,boolean color){
		if (node!= null)
			node.color = color;
	}
	private void leftRotate(RBNode<T> x){
		RBNode<T> y =x.right;
		x.right = y.left;
		if (y.left != null)
			y.left.parent = x;
		y.parent = x.parent;
		if (x.parent == null)
			this.mRoot = y;
		else {
			if (x.parent.left == x)
				x.parent.left = y;
			else
				x.parent.right = y;
		}
		y.left = x;
		x.parent = y;
	}
	private void rightRotate(RBNode<T> y){
		RBNode<T> x = y.left;
		y.left = x.right;
		if (x.right != null)
			x.right.parent = y;
		x.parent = y.parent;
		if (y.parent == null)
			this.mRoot = x;
		else{
			if (y == y.parent.right)
				y.parent.right = x;
			else
				y.parent.left = x;
		}
		x.right = y;
		y.parent = x;
	}
	private void insert(RBNode<T> node){
		int cmp;
		RBNode<T> y = null;
		RBNode<T> x = this.mRoot;
		while (x!= null){
			y = x;
			cmp = node.key.compareTo(x.key);
			if (cmp<0)
				x = x.left;
			else
				x = x.right;
		}
		node.parent = y;
		if (y!=null){
			cmp = node.key.compareTo(y.key);
			if (cmp<0)
				y.left = node;
			else
				y.right = node;
		}
		else
			this.mRoot = node;
		node.color = RED;
		insetFixUp(node);
	}

	private void insetFixUp(RBNode<T> node) {//插入修正函数
		RBNode<T> parent,gparent;
		while (((parent = parentOf(node)) != null) && isRed(parent)){
			gparent = parentOf(parent);

		}
	}

	public void insert(T key){
		RBNode<T> node = new RBNode<T>(BLACK, key,null,null,null);
		if (node != null)
			insert(node);
	}

}
