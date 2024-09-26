import java.util.Scanner;

//This program will allow the user to choose their number threads and find the greatest large divisor within a range.
//The concept of Data Parallelism is used in this program where the initial range of numbers is divided into multiple
//subsets which are then allocated to their own thread.

public class ThreadRunner {
	
    public static int maxDivCount = 0, maxDivVal = 0;
    
    public static class Divisor extends Thread {
    	
    	private int start, end;
    	
    	public Divisor(int s, int e) {
    		setStart(s);
    		setEnd(e);
    	}
    	
    	public void setStart(int s) {
    		start = s;
    	}
    	
    	public void setEnd(int e) {
    		end = e;
    	}
    	
    	/**
    	 * Counts the number of divisors for a specific integer and return the number of divisors.
    	 * The method will attempt to count the number of divisors for a number by starting to divide from one
    	 * up until it has reached the target number.
    	 * @param number
    	 * @return divisorCount
    	 */
    	
    	public int countDivisor(int num) {
    		int divCount = 0;
    		
    		for(int i = 1; i <= num; i++) {
    			if(num % i == 0) {
    				divCount++;
    			}
    		}
    		
    		return divCount;
    	}
    	
    	/*
    	 * We define a run() method so that it will be implicitly called by the start() method when we run the threads
    	 * Each thread will count the total number of divisors for each integer between the start and end value
    	 * Then the largest divisorCount will be compared to the global maxDivisorCount to see which is larger.
    	 */
    	
    	public void run() {
    		int divCount = 0;
    		int divVal = 0;
    		
    		for(int i = start; i < end; i++) {
    			int divisors = countDivisor(i);
    				if(divisors > divCount) {
    					divCount = divisors;
    					divVal = i;
    				}
    		}
    		
    		/*
    		 *Updates the maxDivisorCount and numberWithMaxaDivisor volatile variables 
    		 *if there is a larger number with greater divisors than the current largest number with the most divisors
    		 */
    		
    		if(divVal > maxDivVal && divCount > maxDivCount) {
    			maxDivCount = divCount;
    			maxDivVal = divVal;
    		}
    		
    	}

    }
    
	private static void countDivisorNumbers(int numRange, int numOfThreads) {
		
		long startTime = System.currentTimeMillis();
		
		/*
		 * An array of Divisor objects that will be assigned its own range of numbers.
		 * The total range will be divided equally amongst the total number of threads.
		 * Each of these groups will build upon the previous group until they have reached the max range.
		 */
		
		Divisor[] threadGroup = new Divisor[numOfThreads];
		
		int rangePerThread = numRange/numOfThreads;
		int start = 1; // The first thread will start counting from one
		int end = rangePerThread; // The end of the first group 
		
		/*
		 * We assign each element with its own range of numbers to perform countDivisors
		 */

		for(int i = 0; i < numOfThreads; i++) {
			threadGroup[i] = new Divisor(start, end); //Each element in the array will have a starting and ending value
			start = end + 1; // Each thread's beginning value will continue from the end of the group before
			end = start + (rangePerThread - 1); // Each thread's end value will be the the rangePerThread -1 + start value
		}
		
		/*
		 * Once we have assigned each element in the threadGroup with their own range of numbers, we can begin threading.
		 * The thread will call the start() method which will then perform the countDivisor method on its range of numbers
		 */
		
		for(int i = 0; i < threadGroup.length; i++) {
			threadGroup[i].start();
		}
		
		/* 
		 * We have to wait until all the threads finish executing and we are able to do so with the join() method.
		 */
		
		for(int i =0; i < threadGroup.length; i++) {
			try {
				threadGroup[i].join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * Output will display the total amount of time it took for the threads to finish operating
		 * as well as printing out the integer with the largest number of divisors
		 */
		
		long endTime = System.currentTimeMillis(); 
		
		long totalElapsedTime = endTime - startTime;

		System.out.println("\nThe largest number with the most number of divisors in the range of " + numRange +  " is " + maxDivVal + " with " + maxDivCount + " divisors");
		System.out.println("Total Elapsed Time: " + totalElapsedTime/1000.0 + " seconds");
		System.out.println("Calculated with: " + numOfThreads + " Threads");
	}

    
	public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);

        int numOfcores = Runtime.getRuntime().availableProcessors();
        int numRange = 10000; 
        int numOfThreads = 1;
        
        System.out.println("You have " + numOfcores + " cores available. Test with: ");
        System.out.println("(A) 1 core ");
        System.out.println("(B) " + numOfcores + " cores?");
        System.out.println("(C) Custom number of cores");
        String choice = input.next().toUpperCase();

        if(choice.equals("A")){
        	numOfThreads = 1;
        } else if(choice.equals("B")){
        	numOfThreads = numOfcores;
        } else if(choice.equals("C")){
        	System.out.println("Enter your preferred number of cores: ");
        	 int num = input.nextInt();
        	
        	if(num <= numOfcores && num > 0) {
        		numOfThreads = num;
        	}
        	}else {
                System.out.println("Unknown input. Testing with " + numOfcores + " cores");
                numOfThreads = numOfcores;
        	
        }

        countDivisorNumbers(numRange, numOfThreads);
        
        input.close();
	}

}

/*-----------OUTPUT--------------
You have 16 cores available. Test with: 
(A) 1 core 
(B) 16 cores?
(C) Custom number of cores
B

Calculating divisor of 10000 with 16 threads
Results: 
The largest number with the most number of divisors in the range of: 10000
is 7560 with 64 divisors
Total Elapsed Time: 0.058 seconds
Calculated with: 16 Threads

--------OUTPUT----------------
You have 16 cores available. Test with: 
(A) 1 core 
(B) 16 cores?
(C) Custom number of cores
A

Calculating divisor of 10000 with 1 threads
Results: 
The largest number with the most number of divisors in the range of: 10000
is 7560 with 64 divisors
Total Elapsed Time: 0.071 seconds
Calculated with: 1 Threads
*/