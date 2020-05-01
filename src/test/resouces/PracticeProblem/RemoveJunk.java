package PracticeProblem;

public class RemoveJunk {

	public static void main(String[] args) {
		String junkString = "我的名字叫阿拉克selenium";
		String junk1 = "我的名 alkd字叫阿sele拉克";
		junkString=junkString.replaceAll("[^a-zA-z0-9]", "");
		junk1= junk1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(junkString);
		System.out.println(junk1);
	}

}
