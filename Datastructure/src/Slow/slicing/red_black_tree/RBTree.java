package Slow.slicing.red_black_tree;

import com.sun.deploy.util.BlackList;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.jcp.xml.dsig.internal.dom.ApacheCanonicalizer;
import sun.font.ExtendedTextLabel;
import sun.security.krb5.internal.APRep;
import sun.text.normalizer.Replaceable;

import javax.print.attribute.standard.MediaSize;
import javax.swing.*;
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
	private void setRed(RBNode<T> node){
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
	//前序遍历红黑树
	private void preOrder(RBNode<T> tree){
		if (tree != null){
			System.out.print(tree.key + " ");
			preOrder(tree.left);
			preOrder(tree.right);
		}
	}
	public void prerOder(){
		preOrder(mRoot);
	}

	//中序
	private void inOrder(RBNode<T> tree){
		if (tree!= null){
			inOrder(tree.left);
			System.out.print(tree.key + " ");
			inOrder(tree.right);
		}
	}
	public void inOrder(){
		inOrder(mRoot);
	}
	//后序
	private void postOrder(RBNode<T> tree){
		if (tree != null){
			postOrder(tree.left);
			postOrder(tree.right);
			System.out.print(tree.key + " ");
		}
	}
	public void postOrder(){
		postOrder(mRoot);
	}
	/*递归查找，红黑树中键值为key的结点*/
	private RBNode<T> search(RBNode<T> x,T key){
		if (x == null)
			return x;
		int cmp = key.compareTo(x.key);
		if (cmp < 0)
			return search(x.left,key);
		else if (cmp > 0)
			return search(x.right,key);
		else
			return x;
	}
	public RBNode<T> search(T key){
		return search(mRoot,key);
	}
	/*非递归实现查找*/
	private RBNode<T> iterativeSearch(RBNode<T> x,T key){
		while (x != null){
			int cmp = key.compareTo(x.key);
			if (cmp < 0)
				x = x.left;
			else if (cmp>0)
				x = x.right;
			else
				return x;
		}
		return x;
	}
	public RBNode<T> iterativeSearch(T key){
		return iterativeSearch(mRoot,key);
	}

	/*查找最小结点，返回tree为根结点的红黑树的最小结点*/
	private RBNode<T> minimum(RBNode<T> tree){
		if (tree == null)
			return null;
		while (tree.left != null)
			tree = tree.left;
		return tree;
	}
	public T minimum(){
		RBNode<T> p = minimum(mRoot);
		if (p != null)
			return p.key;
		return null;
	}

	/*查找最大节点*/
	private RBNode<T> maximum(RBNode<T> tree){
		if (tree == null)
			return null;
		while (tree.right != null)
			tree = tree.right;
		return tree;
	}
	public T maximum(){
		RBNode<T> p = maximum(mRoot);
		if (p != null)
			return p.key;
		return null;
	}
	/*找结点的后继结点*/
	public RBNode<T> successor(RBNode<T> x){
		if (x.right != null)
			return minimum(x.right);
		RBNode<T> y = x.parent;
		while ((y!=null) && (x==y.right)){
			x = y;
			y = y.parent;
		}
		return y;
	}
	/*找该节点的前驱结点*/
	public RBNode<T> predecessor(RBNode<T> x){
		if (x.left != null)
			return maximum(x.left);
		RBNode<T> y = x.parent;
		while ((y!=null) && (x==y.left)){
			x = y;
			y = y.parent;
		}
		return y;
	}
	/*左旋*/
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
	/*将结点插入红黑树中*/
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
			if (parent == gparent.left)
			{
				RBNode<T> uncle = gparent.right;
				if ((uncle != null) && isRed(uncle)){
					setBlack(uncle);
					setBlack(parent);
					setRed(gparent);
					node = gparent;
					continue;
				}
				if (parent.right == node){
					RBNode<T> tmp;
					leftRotate(parent);
					tmp = parent;
					parent = node;
					node = tmp;
				}
				setBlack(parent);
				setRed(gparent);
				rightRotate(gparent);
			}else {
				RBNode<T> uncle = gparent.left;
				if ((uncle != null) && isRed(uncle)){
					setBlack(uncle);
					setBlack(parent);
					setRed(gparent);
					node = gparent;
					continue;
				}
				if (parent.left == node){
					RBNode<T >tmp;
					rightRotate(parent);
					tmp = parent;
					parent = node;
					node = tmp;
				}
				setBlack(parent);
				setRed(gparent);
				leftRotate(gparent);
			}
		}
		setBlack(this.mRoot);
	}

	public void insert(T key){
		RBNode<T> node = new RBNode<T>(BLACK, key,null,null,null);
		if (node != null)
			insert(node);
	}

	/*红黑树删除修正*/
	private void removeFixUp(RBNode<T> node,RBNode<T> parent){
		RBNode<T> other;
		while ((node == null ||isBlack(node)) && (node != this.mRoot)){
			if (parent.left == node){
				other = parent.right;
				if (isRed(other)){
					setBlack(other);
					setRed(parent);
					leftRotate(parent);
					other = parent.right;
				}
				if ((other.left == null || isBlack(other.left)) && (other.right == null || isBlack(other.right))){
					setRed(other);
					node = parent;
					parent = parentOf(node);
				}
				else {
					if (other.right == null || isBlack(other.right)){
						setBlack(other.left);
						setRed(other);
						rightRotate(other);
						other = parent.right;
					}
					setColor(other,colorOf(parent));
					setBlack(parent);
					setBlack(other.right);
					leftRotate(parent);
					node = this.mRoot;
					break;
				}
			}
			else {
				other = parent.left;
				if (isRed(other)){
					setBlack(other);
					setRed(parent);
					rightRotate(parent);
					other = parent.left;
				}
				if ((other.left == null || isBlack(other.left)) && (other.right == null) || isBlack(other.right)){
					setRed(other);
					node = parent;
					parent = parentOf(node);
				}else {
					if (other.left == null || isBlack(other.left)){
						setBlack(other.right);
						setRed(other);
						leftRotate(other);
						other = parent.left;
					}
					setColor(other,colorOf(parent));
					setBlack(parent);
					setBlack(other.left);
					rightRotate(parent);
					node = this.mRoot;
					break;
				}
			}
		}
		if (node!=null)
			setBlack(node);
	}
	/*删除结点，并返回被删除的结点*/
	private void remove(RBNode<T> node){
		RBNode<T> child,parent;
		boolean color;
		if ((node.left!= null) && (node.right != null)){
			RBNode<T> replace = node;
			replace = replace.right;
			while (replace.left != null)
				replace = replace.left;
			if (parentOf(node)!= null){
				if (parentOf(node).left == node)
					parentOf(node).left = replace;
				else
					parentOf(node).right = replace;
			}else
				this.mRoot = replace;
			child = replace.right;
			parent = parentOf(replace);
			color = colorOf(replace);
			if (parent == node) {
				parent = replace;
			}else {
				if (child!=null)
					setParent(child,parent);
				parent.left = child;
				replace.right = node.right;
				setParent(node.right,replace);
			}
			replace.parent = node.parent;
			replace.color = node.color;
			replace.left = node.left;
			node.left.parent = replace;
			if (color == BLACK)
				removeFixUp(child,parent);
			node = null;
			return;
		}
		if (node.left != null)
			child = node.left;
		else
			child = node.right;
		parent = node.parent;
		color = node.color;
		if (child != null)
			child.parent = parent;
		if (parent != null){
			if (parent.left == node)
				parent.left = child;
			else
				parent.right = child;
		}else
			this.mRoot = child;
		if (color == BLACK)
			removeFixUp(child,parent);
		node = null;
	}
	public void remove(T key){
		RBNode<T> node;
		if ((node = search(mRoot,key)) != null)
			remove(node);
	}

	/*销毁红黑树*/
	private void destroy(RBNode<T> tree){
		if (tree == null)
			return;
		if (tree.left !=null)
			destroy(tree.left);
		if (tree.right != null)
			destroy(tree.right);
		tree =null;
	}
	public void clear(){
		destroy(mRoot);
		mRoot = null;
	}
	private void print(RBNode<T> tree,T key,int direction){
		if (tree != null){
			if (direction == 0)
				System.out.println(tree.key + "is root");
			else
				System.out.println(tree.key + (isRed(tree)?"R":"B") + " is " + key + "`s " + (direction == 1 ?"right":"left")+" child" );
			print(tree.left,tree.key,-1);
			print(tree.right,tree.key,1);
		}
	}
	public void print(){
		if (mRoot != null)
			print(mRoot,mRoot.key,0);
	}
}
