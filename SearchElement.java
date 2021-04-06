import java.util.*;
class SearchElement{
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
			x[i] = a;
			}
			//Input the Search Item
			System.out.println("Enter the Search Item");
			int item = input.nextInt();

			//First Method for Searching Element
			System.out.println("Searching Using while Loop");
			i=0;
			while(i<size && x[i]!=item){
				i++;
			}
			 if(i<size)
			 {
			 System.out.println("                 Item Found in Array index ="+i);
			 x[i] = 200;
			}
			else
			{
				System.out.println("Item Not Found");
			}
			//Second Method for Searching Element
			System.out.println("Searching Using For Loop");
			for(i=0; i<size; i++){

				System.out.println("                Item Found in Array index ="+x[i]);

			}



		}
	}