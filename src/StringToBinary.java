import java.util.*; 

class StringToBinary 
{ 

	// utility function to convert a string into a binary string 
	static String strToBinary(String s) 
	{ 
		int n = s.length();
		String result = " ";

		for (int i = 0; i < n; i++) 
		{ 
			// convert each char to 
			// ASCII value 
			int val = Integer.valueOf(s.charAt(i)); 

			// Convert ASCII value to binary 
			String bin = ""; 
			while (val > 0) 
			{ 
				if (val % 2 == 1) 
				{ 
					bin += '1'; 
				} 
				else
					bin += '0'; 
				val /= 2; 
			} 
			bin = reverse((bin)); 

			result = result + bin + " ";
		}
		return result;
	} 
	// function to reverse the characters in a string
	static String reverse(String input) 
	{ 
		char[] a = input.toCharArray(); 
		int l, r = 0; 
		r = a.length - 1; 

		for (l = 0; l < r; l++, r--) 
		{ 
			// Swap values of l and r 
			char temp = a[l]; 
			a[l] = a[r]; 
			a[r] = temp; 
		} 
		return String.valueOf(a); 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String to convert to Binary: ");
		String myString = scan.next(); 
		String myBinary = strToBinary(myString); 
		System.out.println(myBinary);
		scan.close();
	} 
} 