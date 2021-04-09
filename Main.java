/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
        int temp = 0;
        int lengthofarray = sc.nextInt();
        int array[] = new int[lengthofarray];
       
        while(lengthofarray%2 == 1){
            System.out.println("Cannot flip on odd array");
            lengthofarray = sc.nextInt();
        }
        for(int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        int secondarylocation = array.length - 1;
        for(int i = 0;i<array.length/2;i++){
            temp = array[i];
            array[i] = array[secondarylocation - i];
             array[secondarylocation - i] = temp;
            
        }
        System.out.println();
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
       
    }
}