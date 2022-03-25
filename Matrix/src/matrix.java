import java.util.Scanner;
public class matrix {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Enter the number of rows of first matrix");
		int first_rows = giris.nextInt();
		System.out.println("Enter the number of colums of first matrix ");
		int first_colums = giris.nextInt();
		int A_Matrix[][] = new int[first_rows][first_colums];
		System.out.println("Enter the elements of first matrix");
		for(int i = 0; i< first_rows; i++)
		{
			for(int j = 0; j< first_colums; j++)
			{
				A_Matrix[i][j] = giris.nextInt();
			}
		}
		for(int i = 0; i < first_rows; i++)
		{
			for(int j = 0; j< first_colums; j++)
			{
				System.out.print(A_Matrix[i][j]);
			}		
		}
		
		System.out.println("Enter the number of rows of second matrix");
		int second_rows = giris.nextInt();
		System.out.println("Enter the number of colums of second matrix");
		int second_colums = giris.nextInt();
		int B_Matrix[][] = new int [second_rows][second_colums];
		System.out.println("Enter the elements of second matrix");
		for(int i = 0; i < second_rows; i++)
		{
			for(int j = 0; j < second_colums; j++)
			{
				B_Matrix[i][j] = giris.nextInt();
			}
		}
		for(int i = 0; i < second_rows; i++)
		{
			for(int j = 0; j < second_colums; j++)
			{
				System.out.print(B_Matrix[i][j]);
			}
		}
		
		int C_Matrix[][] = new int[first_rows][second_colums];
		for(int i = 0; i < first_rows; i++)
		{
			for(int j = 0; j < second_colums; j++)
			{
				C_Matrix[i][j] += A_Matrix[i][j] * B_Matrix[i][j];
			}
		}
		System.out.println(C_Matrix);	
	}
}
