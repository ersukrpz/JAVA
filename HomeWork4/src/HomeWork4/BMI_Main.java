package HomeWork4;
public class BMI_Main {

	public static void main(String[] args) 
	{
		BMI_Calculated  person1 = new BMI_Calculated();
		BMI_Calculated  person2 = new BMI_Calculated("Sara King",215,70);
		BMI_Calculated  person3 = new BMI_Calculated("Kim Young",70,145,18);
		
		System.out.println("The BMI for "+ person1.getName() + "is " + person1.getBMI() + " " + person1.getStatus(person1.getBMI()));
		System.out.println("The BMI for "+ person2.getName() + "is " + person2.getBMI() + " " + person2.getStatus(person2.getBMI()));
		System.out.println("The BMI for "+ person3.getName() + "is " + person3.getBMI() + " " + person3.getStatus(person3.getBMI()));
	}

}
