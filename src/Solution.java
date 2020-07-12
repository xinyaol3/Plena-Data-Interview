import java.util.HashMap;

public class Solution {
/*Create an application that will prompt for a user to input a string. Using the user’s inputted string, 
 * find the first letter that is not repeated. For example: If given the string ‘Bubble’, 
 * the letter ‘u’ would be the first character returned from the program. Once the first character is found and displayed back to the user, 
 * rewrite the string in order of number of occurrences and order from the inputted string. 
 * In the above example ‘Bubble’ would then be rewritten as ‘uleBbb’. Display this to the user.
*/
	public static void RewriteFirstNonRepeatLetter(String s) {
		HashMap<Character,Integer>map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c= Character.toLowerCase(s.charAt(i));
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		int i=0; int count=0;
		while(count<s.length()) {
			char c2=Character.toLowerCase(s.charAt(i));
			if(map.get(c2)>1) {
				s=s.substring(0,i)+s.substring(i+1,s.length())+""+s.charAt(i);
			}
			else {
				System.out.println("The first non repeated letter in string "+s+" is: "+s.charAt(i));
				i++;
			}
			count++;
		}
		System.out.println("The final string after been rewritten is: "+s);
	}
	public static void main(String[] args) {
		String s="Bubble";
		RewriteFirstNonRepeatLetter(s);
	}

}
