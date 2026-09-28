package Quizzzzzz;
import java.util.Scanner;
class Play{
	public static void stratQuiz(Question qs[]) {
		System.out.println("**********Start*********");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<qs.length;i++) {
			
		}
	}
}
public class Quiz {

	public static void main(String[] args) {
		String s1="1. Who is known as “The Pharaoh” in football?\r\n"
		+"A) Mohamed Salah\r\n"
		+"B) Sadio Mané\r\n"
		+"C) Riyad Mahrez\r\n"
		+"D) Achraf Hakimi\r\n";
		String s2="Which country won the 2022 FIFA World Cup?\r\n"
				+ "A) France\r\n"
				+ "B) Brazil\r\n"
				+ "C) Argentina\r\n"
				+ "D) Germany";
		String s3="Which country won the 2014 FIFA World Cup?\r\n"
				+ "A) France\r\n"
				+ "B) Brazil\r\n"
				+ "C) Argentina\r\n"
				+ "D) Germany";
		String s4="Which club is known as “The Red Devils”?\r\n"
				+ "A) Liverpool\r\n"
				+ "B) Arsenal\r\n"
				+ "C) Manchester United\r\n"
				+ "D) Chelsea";
		String s5="Who holds the record for the most Ballon d’Or wins?\r\n"
				+ "A) Cristiano Ronaldo\r\n"
				+ "B) Lionel Messi\r\n"
				+ "C) Luka Modrić\r\n"
				+ "D) Karim Benzema";
		Question qs[]= {new Question(s1,"a"),new Question(s2,"c"),new Question(s3,"d"),new Question(s4,"c"),new Question(s5,"b")};
		
	}

}
