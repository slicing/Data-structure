package Slow.slicing.linklist;

public class Link1 {
	public int iData;
	public double dData;
	public Link1 next;

	public Link1(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}
	public void displayLink(){
		System.out.print(" {" + iData + "," + dData + "} ");
	}
}
