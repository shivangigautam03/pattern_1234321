
public class reverseArray {
	public static void main(String args[])
	{
		int numbers[]= {1,2,3,4,5};
		for(int i=0;i<5;i++)
		{
			  System.out.print(numbers[i] + " ");
		}
		for (int i = 0; i < numbers.length / 2; i++) {
	         int temp = numbers[i];
	         numbers[i] = numbers[numbers.length - 1 - i];
	         numbers[numbers.length - 1 - i] = temp;
	      } 
	      System.out.println("\nArray after reverse:");
	      for (int i = 0; i < numbers.length; i++) {
	         System.out.print(numbers[i] + " ");
	      } 
	}
}
