
public class ScoreInfo extends StudentInfo{
	 double korean, math, English,sum, avg;
	public ScoreInfo(){
		super();
		korean = 0.0; math = 0.0; English = 0.0;
		sum = 0.0; avg = 0.0;
		
	}
	public ScoreInfo(String studentName, String studentId){
		setName(studentName);
		setId(studentId);
		
	}
	public void setScore(String name, double score){
		name = name;
		score = score;
	}
	public double getScore(String subject){
		return korean;
	}
	public void setKorean(double isKorean){
		 this.korean = korean;
	}
	public double getKorean(){
		return korean;
	}
	public void setMath(double isMath){
		this.math = math;
	}
	public double getMath(){
		return math;
	}
	public void setEnglish(double isEnglish){
		 this.English = English;
	}
	public double getEnglish(){
		return English;
	}
	public double sum(){
		return sum =(korean + math + English);
	}
	public double average(){
		return avg = sum / 3.0;
	}
	public double getSum() {
		return sum;
	}
	public double getAvg(){
		return avg;
	}
	public void display(){
		System.out.printf(korean+"\t"+math+"\t"+English+"\t"+getSum()+"\t"+getAvg()); 
	    System.out.println("");
		
	/*	System.out.println("Student name: " + getName());
		System.out.println("Student ID: " + getId());
		System.out.println("Korean: " + korean);
		System.out.println("Math: " + math);
		System.out.println("English: " + English);
		*/
	}
	
}
