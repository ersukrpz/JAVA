import java.util.Scanner;
public class BMICalculated 
{
	public double BMICalculated() 
	{
		double BMI;
		 Scanner giris = new Scanner(System.in);
		{
			int choose;
			while(choose !=2);
			
			{
				System.out.println("1.)Check age");
				System.out.println("2.)Exit the loop");
				System.out.println("Please choose your button");
				if(choose ==1)
				{
					System.out.println("Age");
					 int age = giris.nextInt();
					 if(age >= 20)
					 {
						 int choice;
						 while (choice !=2);
						 {
							 System.out.println("1.)Check BMI");
							 System.out.println("2.)Exit the loop");
							 System.out.println("Please choose your choice");
							 if(choice == 1)
							 {
								 System.out.println("weight");
								 double weight =giris.nextDouble();
								 System.out.println("height");
								 double height =giris.nextDouble();
								 double inc,pounds;
								 inc = height *0.0254 ;
								 pounds = weight *0.45359237;
								 double BMI = weight * 0.45359237 / ((inc *0.0254)*(inc * 0.0254));
								 System.out.print("Body Mass Index is " + BMI+"\n");
								 if(BMI< 18.5)
								 {
									 System.out.println("This person is a underweight");									 
								 }
								 else if(BMI >=18.5 && BMI<=25)
								 {
									 System.out.println("This person is a normal");
								 }
								 else if(BMI >25 && BMI <= 30)
								 {
									 System.out.println("This person is a overweight");
								 }
								 else
								 {
									 System.out.println("This person is a obese");
								 }
							 }
							 else if(choice == 2)
							 {
								 System.out.println("Exit this calculated");
							 }	
							 else
							 {
								 System.out.println("Wrong choice");
							 }						 
						 }
					 }
				}
				else if(choose == 2)
				{
					 System.out.println("Exit the loop");
				}
				else
				{
					 System.out.println("Wrong choose");
				}
			}		
		}	
	}
}
