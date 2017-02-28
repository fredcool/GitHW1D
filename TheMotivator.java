public class TheMotivator 
{
	public void feedback(int score) 
	{
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	
	public void feedbackByGPA(double GPA) 
	{
		if (GPA >= 3.8)
			System.out.println("A+");
		else if (GPA >= 3.5)
			System.out.println("A");
		else if (GPA >= 3.2)
			System.out.println("B");
		else
			System.out.println("C");
	}
	
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
		tm.feedback(50);
		tm.feedback(100);
		tm.feedbackByGPA(3.8);
	}
}
