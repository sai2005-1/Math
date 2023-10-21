import TurtleGraphics.KeyboardReader;
import java.util.Random;
public class MathMethod 
{
	KeyboardReader reader = new KeyboardReader();
	Random genarator = new Random();
	public void Game()
	{
		int ask;
		System.out.println("Enter the number for the problem type desired");
		System.out.println("   1. Addition");
		System.out.println("   2. Subtraction");
		System.out.println("   3. Multiplication");
		
		System.out.println();
		System.out.print("Enter choice: ");
		ask=reader.readInt();
		
		while((ask<1)||(ask>3))
		{
			System.out.print("Invaild number. Enter choice: ");
			ask=reader.readInt();
		}
		
		
		
		if(ask==1)
		{
			Addition();
		}
		if(ask==2)
		{
			Subtraction();
		}
		if(ask==3)
		{
			Multiplication();
		}
		
	}
	public void Addition()
	{
		int number1, number2, total, count=1, count1=1, answer, correct=0, qcount=1;
		int score = 0, tri=1; 
		
		while(count<=10)
		{
			number1=genarator.nextInt(100)+1;
			number2=genarator.nextInt(100)+1;
			total=number1+number2;
			System.out.println();
			System.out.print(qcount+") "+number1+" + "+number2+" = ");
			answer=reader.readInt();
			while((answer!=total)&&(count1!=3))
			{
				System.out.println("WRONG Trying again");
				System.out.print(qcount+") "+number1+" + "+number2+" = ");
				answer=reader.readInt();
				
				
				if(answer!=total)
				{
					count1++;
				}
				tri++;
			}
			if(count1==3)
			{
				System.out.println("You have missed 3 times. The answer is "+total);
				qcount++;
				count1=1;
				tri++;
			}
			if(tri==1)
			{
				score=score+10;
				tri=1;
			}
			else if(tri==2)
			{
				score=score+5;
				tri=1;
			}
			else if(tri==3)
			{
				score=score+2;
				tri=1;
			}
			if(answer==total)
			{
				System.out.println("Correct");
				correct++;
				qcount++;
				count1=1;
				
			}
			count++;
		}
		
		System.out.println();
		
		System.out.println("Your score = "+score);
		
	}
	
	public void Subtraction()
	{
		int number1, number2, total, count=1, count1=1, answer, correct=0, qcount=1;
		int score = 0, tri=1; 
		
		while(count<=10)
		{
			number1=genarator.nextInt(100)+1;
			number2=genarator.nextInt(100)+1;
			total=number1-number2;
			System.out.println();
			System.out.print(qcount+") "+number1+" - "+number2+" = ");
			answer=reader.readInt();
			while((answer!=total)&&(count1!=3))
			{
				System.out.println("WRONG Trying again");
				System.out.print(qcount+") "+number1+" - "+number2+" = ");
				answer=reader.readInt();
				
				
				if(answer!=total)
				{
					count1++;
				}
				tri++;
			}
			if(count1==3)
			{
				System.out.println("You have missed 3 times. The answer is "+total);
				qcount++;
				count1=1;
				tri++;
			}
			if(tri==1)
			{
				score=score+10;
				tri=1;
			}
			else if(tri==2)
			{
				score=score+5;
				tri=1;
			}
			else if(tri==3)
			{
				score=score+2;
				tri=1;
			}
			if(answer==total)
			{
				System.out.println("Correct");
				correct++;
				qcount++;
				count1=1;
				
			}
			count++;
		}
		
		System.out.println();
		
		System.out.println("Your score = "+score);
	}
	public void Multiplication()
	{
		int number1, number2, total, count=1, count1=1, answer, correct=0, qcount=1;
		int score = 0, tri=1; 
		
		while(count<=10)
		{
			number1=genarator.nextInt(100)+1;
			number2=genarator.nextInt(100)+1;
			total=number1*number2;
			System.out.println();
			System.out.print(qcount+") "+number1+" x "+number2+" = ");
			answer=reader.readInt();
			while((answer!=total)&&(count1!=3))
			{
				System.out.println("WRONG Trying again");
				System.out.print(qcount+") "+number1+" x "+number2+" = ");
				answer=reader.readInt();
				
				
				if(answer!=total)
				{
					count1++;
				}
				tri++;
			}
			if(count1==3)
			{
				System.out.println("You have missed 3 times. The answer is "+total);
				qcount++;
				count1=1;
				tri++;
			}
			if(tri==1)
			{
				score=score+10;
				tri=1;
			}
			else if(tri==2)
			{
				score=score+5;
				tri=1;
			}
			else if(tri==3)
			{
				score=score+2;
				tri=1;
			}
			if(answer==total)
			{
				System.out.println("Correct");
				correct++;
				qcount++;
				count1=1;
				
			}
			count++;
		}
		
		System.out.println();
		
		System.out.println("Your score = "+score);
	
	}
}
