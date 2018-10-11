package Slow.slicing.Array;

public class Try {
	public static void main(String[] args) {
		int[] arr = new int[5];
		double b = 0;
		try{
			arr[6] = 8;
		}
		catch (ArrayIndexOutOfBoundsException ex){
			System.out.println("----");
			b = 1/0;
		}catch (Exception e){
			System.out.println("****");
			e.printStackTrace();
		}finally {
			arr[4] = 3;
			System.out.println(arr[4]);
		}
	}
}
