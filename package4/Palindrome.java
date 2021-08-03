public class Palindrome{
	public static void main(String[] args) {
		String text = args[0];
		boolean res = isPalindrome(text);
		System.out.println(res);
	}

	public static boolean isPalindrome(String text){
		if(text == null || text.length() == 0){
			return true;
		}

		int n = text.length();
		int i = 0, j = n - 1;
		while(i < j){
			if(text.charAt(i) != text.charAt(j)){
				return false;
			}
			i += 1;
			j -= 1;
		}
		return true;
	}
}