package p1_Intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

	public static void main(String[] args) {
		String words = "nowis the time or now is not the time";
		String patt = "now";
		Pattern pattern = Pattern.compile(patt);
		Matcher match = pattern.matcher(words);
		System.out.println(words);
		while(match.find()) {
			System.out.println("Found " + patt + " at:" + match.start());
			System.out.println("Match: " + match.group());
		}
	}

}
