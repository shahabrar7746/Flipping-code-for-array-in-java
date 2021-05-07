
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
        int temp = 0;
        int lengthofarray = sc.nextInt();
        int array[] = new int[lengthofarray];
       //This loop will be used to give values to array
       
        for(int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
		//This loop will flip our array to right 
        int secondarylocation = array.length - 1;
        for(int i = 0;i<array.length/2;i++){
            temp = array[i];
            array[i] = array[secondarylocation - i];
             array[secondarylocation - i] = temp;
            
        }
		//this loop will print all value of array
        System.out.println();
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
       
    }
}
