import java.util.*;
class InsertElement{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Size of Array = ");
		int size = input.nextInt();
		//creating array
		int[] x = new int[size];
		int i;
		System.out.println("Enter the Element in The Array");
		for(i=0; i<size; i++){
			System.out.print("x["+i+"] = ");
			int a = input.nextInt();
			x[i]=a;
			}
			System.out.println("Print the Array");
			for(i=0; i<size; i++){

			System.out.print("x["+i+"] = "+x[i]+"\n");

			}
		}
	}