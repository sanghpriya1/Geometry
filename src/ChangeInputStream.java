
public class ChangeInputStream {
	private static String inputConversion(String S) {
		String s = "";
		int len = S.length();
		for(int i = 0; i < len; i++) {
			if(S.charAt(i) == '[') {
				s += '{';
			}
			else if(S.charAt(i) == ']') {
				s += '}';
			}
			else {
				s += S.charAt(i);
			}
		}
		return s;
	}
	public static void main(String[] args) {
		String S = "[[8, 2], [2, 5],[2, 3], [2, 1],[8, 7],[2, 0],[0, 6],[1, 4]]";
		
		System.out.println(inputConversion(S));
		
	}

}
