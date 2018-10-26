package Slow.slicing.linklist;

public class Link {
	public int iData;
	public double dData;
	public Link next;

	public Link(int iData, double dData) {
		this.iData = iData;
		this.dData = dData;
	}
	public void disPlayLink(){
		System.out.println("{" + iData + ","+ dData+ "}");
	}
}
