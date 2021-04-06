import java.util.*;
class UpdateElement{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Size of Array = ");
		int size = input.nextInt();
		//creating array
		int[] x = new int[size];
		int i,j,temp;
		System.out.println("Enter the Element in The Array");
		for(i=0; i<size; i++){
			System.out.print("x["+i+"] = ");
			int a = input.nextInt();
			x[i] = a;
			}
			for(i=0; i<size; i++){
				for(j=0; j<size-1; j++){
					if(x[j]>x[j+1]){
						temp = x[j];
						x[j] = x[j+1];
						x[j+1] = temp;
						}
					}
				}

				System.out.println("Sort of Array");
				for(i=0; i<size; i++){
					System.out.print(x[i]+",");
					}
					System.out.println();
		}
	}