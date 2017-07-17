package Unity;
public class stringReverse {

	public static void main(String[] args) {
		String input = "Hello World";
		stringReverse sr = new stringReverse();
		String result = sr.reverseString(input);
		System.out.println("input: "+input);
		System.out.println("output: " + result);
	}
	
	public String reverseString(String input){
		if(input == null || input.length() == 0){
			return input;
		}
		char[] inputCharArray = input.toCharArray();
		int length = inputCharArray.length;
		for(int i = 0, j = (length - 1); i < j; i++, j--){
			char temp = inputCharArray[j];
			inputCharArray[j] = inputCharArray[i];
			inputCharArray[i] = temp;
		}		
		return new String(inputCharArray);
	}

}