package HomeWork4;
import java.util.Scanner;
public class BMI_Calculated 
{
	private String name;
	private int age;
	private double weight;
	private double height;
	static final double KILOGRAMS_PER_POUND = 0.45359237;
	static final double METERS_PER_INCH = 0.0254;
	public  BMI_Calculated()
	{
		name = "John Black";
		age = 25;
		weight = 100;
		height = 50;	
	}
	public BMI_Calculated(String newName ,double newWeight, double newHeight)
	{
		name = newName;
		weight = newWeight;
		height = newHeight;
		setAge(20);
	}
	public BMI_Calculated(String newName, double newHeight, double newWeight, int newAge)
	{
		name = newName;
		weight = newWeight;
		height = newHeight;
		age = newAge;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String a)
	{
		a = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int b)
	{
		b = age;
	}
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double c)
	{
		c = weight;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double d)
	{
		d = height;
	}
	double getBMI()
	{
		double BMI;
		BMI = ((weight * KILOGRAMS_PER_POUND) / ((height * METERS_PER_INCH) * (height *METERS_PER_INCH)));
		BMI = (double)Math.round(BMI * 100) / 100;
		return BMI;
	}
	String getStatus(double BMI)
	{
			
		String bmý = null;
		if (BMI < 18.5)
		{ 
			bmý = "Underweight";
		}
		else if (18.5 <= BMI && 25.0 >= BMI) 
		{
			bmý = "Normal";
		}
		else if (25.0 <= BMI && 30.0 >= BMI)
		{
			bmý = "Overweight";
		}
		else 
		{
			bmý = "Obese";
		}
		return bmý;
	}
}


