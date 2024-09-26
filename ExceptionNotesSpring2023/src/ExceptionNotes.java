
public class ExceptionNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {1, 2, 3, 4, 5, 6,};
			
			try {
				System.out.println(arr[3]);
				int num = gimmeNum(arr, 1);
			}catch(Exception e) {//typing Exception e is like cheating.
				System.out.println(e.getMessage());
				e.printStackTrace(); //SUPER HELPFUL - tells you all method calls the 
				//and what line of code the Exception traveled through
			}finally { //must come at the end of a try-catch-finally
				System.out.println("Finally we're almost done");
			}
			
			try {
				stupidMethod('f');
			} catch (CSC330Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			
	}
	
	public static int gimmeNum(int[] arr, int index) {
		return arr[index];
	}
	
	public static boolean stupidMethod(char c) throws CSC330Exception{
		if(c == 'f') {
			throw new CSC330Exception();
		}else {
			System.out.println("I like that character.");
			return true;
		}
		
	}

}
