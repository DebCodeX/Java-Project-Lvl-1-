package Quizzzzzz;
import java.util.Scanner;
class Play{
	void startQuiz() {
		System.out.println("------Start------");
		int count=0;
		for(int i=0;i<que.length;i++) {
			System.out.println(que[i].question);
			Scanner sc=new Scanner(System.in);
			System.out.print("Give Your Answer: ");
			String ans=sc.nextLine();
			if(ans.equalsIgnoreCase(que[i].ans)) {
				System.out.println("Right Answer");
				count++;
			}
			else {
				System.out.println("Wrong Answer");
			}
		}
		System.out.print("Your Score Is:"+count+"/5");
	}
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
			Question que[]= {new Question(s1,"A"),new Question(s2,"C"),new Question(s3,"D"),new Question(s4,"C"),new Question(s5,"B")};
			
}
public class Quiz {

	public static void main(String[] args) {
		 
		Play obj =new Play();
		obj.startQuiz();

	}

}
