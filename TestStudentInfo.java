import java.util.Scanner;

public class TestStudentInfo {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		System.out.println("How many students are there?");
		int n = kbd.nextInt();
		StudentInfo[] s = new StudentInfo[n];
		ScoreInfo[] d = new ScoreInfo[n];
		
		StudentInfo mystu = new StudentInfo();
		ScoreInfo myscore = new ScoreInfo();
		
		int i;	
		for(i=0; i<s.length; i++){
			for(i=0;i<d.length;i++){
			s[i] = new StudentInfo();
			d[i] = new ScoreInfo();	
			
			System.out.print("ID:");
			s[i].setId(kbd.next());
			System.out.print("Name: ");
			s[i].setName(kbd.next());
			System.out.print("Korean: ");
			d[i].setKorean(kbd.nextDouble());
			System.out.print("Math: ");
			d[i].setMath(kbd.nextDouble());
			System.out.print("English:");
			d[i].setEnglish(kbd.nextDouble());
			System.out.println("");
		}
		}
			System.out.println("");
			System.out.println("Name \t ID \t KOREAN \t MATH \t ENGLISH \t SUM \t AVERAGE" );
				System.out.println(s[0].getName() + "\t" + s[0].getId() + "\t" + d[0].getKorean() + "\t" + d[0].getMath()+ "\t" + d[0].getEnglish());
				System.out.println(s[1].getName() + "\t" + s[1].getId() + "\t" + d[1].getKorean() + "\t" + d[1].getMath()+ "\t" + d[1].getEnglish());
				System.out.println(s[2].getName() + "\t" + s[2].getId() + "\t" + d[2].getKorean() + "\t" + d[2].getMath()+ "\t" + d[2].getEnglish());
	/*		s[0].display();
			d[0].display();
			s[1].display();
			d[1].display();
			s[2].display();
			d[2].display();
			System.out.println("");	*/
			
		
			
			
	/*		s[i].display();
			d.display();
			d.average();
			d.sum();
			System.out.println("Name" + s[i].getName());
			System.out.println("ID" + s[i].getId());
			System.out.println("Korean" + d.getKorean());
			System.out.println("Math" + d.getMath());
			System.out.println("English" + d.getEnglish());		*/
		
	}
}
