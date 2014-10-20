package odditytest;

import java.util.Arrays;

public class OddityTest {
	
	
	private static final int NUMBER_OF_VALUES = 1000000;

	public static void run(){
		runOnEqualValues();
		runOnDifferentValues();
	}
	
	public static void runOnEqualValues(){
		System.out.println("Executing comparison with the same value "+NUMBER_OF_VALUES+" times");
		int[] array=new int[NUMBER_OF_VALUES];
		int randomValue=(int)(Math.random()*NUMBER_OF_VALUES);
		Arrays.fill(array, randomValue);
		
		printArray(array);
	}
	
	
	public static void runOnDifferentValues(){
		System.out.println("Executing comparison with "+NUMBER_OF_VALUES+" different values");
		int[] array=new int[NUMBER_OF_VALUES];
		
		for(int i=0;i<array.length;i++){
			int randomValue=(int)(Math.random()*NUMBER_OF_VALUES);
			array[i]=randomValue;
		}
		
		
		printArray(array);
	}
	
	private static void printArray(int[] array){
		System.out.println("Regular way");
		long startingTime=System.currentTimeMillis();
		for(int i=0;i<array.length;i++){
			isOddRegularWay(i);
		}
		
		System.out.println("It took "+(System.currentTimeMillis()-startingTime));
		
		System.out.println("Bitwise way");
		startingTime=System.currentTimeMillis();
		for(int i=0;i<array.length;i++){
			isOddBitwiseWay(i);
		}
		
		System.out.println("It took "+(System.currentTimeMillis()-startingTime));
	}
	
	public static boolean isOddRegularWay(int number){
		return number%2!=0;
	}
	
	public static boolean isOddBitwiseWay(int number){
		return (number & 1)!=0;
	}

}
