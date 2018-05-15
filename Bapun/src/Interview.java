
public class Interview {
	public static void main(String[] args) {
		String s = "patra";
		int count = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i; j < ch.length; j++) {
				if (ch[i] == ch[j] && i != j) {
					count++;
				}
			}
			System.out.println(ch[i] + "=" + count);
			count = 0;
		}
	}
}
