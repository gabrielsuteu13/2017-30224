
import java.util.Scanner;

public class MatrixOperations 
	{

		
		
		public static void settozero(int n, int matrix3[][])
			{
				int index1,index2;
				for(index1=0; index1 < n; index1++)
					for(index2=0; index2 < n; index2++)
						matrix3[index1][index2]=0;
			}
		
		
		public static void add(int n, int matrix1[][], int matrix2[][], int matrix3[][])
			{
				int index1,index2;
				
				
				settozero(n, matrix3);
				
				for(index1=0; index1 < n; index1++)
					for(index2=0; index2 < n; index2++)
						matrix3[index1][index2]= matrix1[index1][index2] + matrix2[index1][index2];
			}
		
		public static void sub(int n, int matrix1[][], int matrix2[][], int matrix3[][])
			{
				int index1,index2;
			
			
				settozero(n, matrix3);
			
				for(index1=0; index1 < n; index1++)
					for(index2=0; index2 < n; index2++)
						matrix3[index1][index2]= matrix1[index1][index2] - matrix2[index1][index2];
			}
		
		public static void multiplyscalar(int n, int scalar, int matrix1[][])
			{
				int index1,index2;
				
				for(index1=0; index1 < n; index1++)
					for(index2=0; index2 < n; index2++)
						matrix1[index1][index2] = matrix1[index1][index2] * scalar;
								
			}
		
		
	
		public static int determinant(int n, int matrix1[][])
			{
				
				if(n==1)
					return matrix1[0][0];
				else if(n==2)
						return matrix1[0][0] * matrix1[1][1] - matrix1[1][0] * matrix1[0][1];
				else if(n==3)
						return matrix1[0][0] * matrix1[1][1] * matrix1[2][2] + matrix1[0][1] * matrix1[1][2] * matrix1[2][0] + matrix1[1][0] * matrix1[2][1] * matrix1[0][2] - matrix1[2][0] * matrix1[1][1] * matrix1[0][2] - matrix1[0][0] * matrix1[2][1] * matrix1[1][2] - matrix1[1][0] * matrix1[0][1] * matrix1[2][2];
				else return -100000;
				
			}
		
		
		
		public static int AreEqual(int n, int matrix1[][], int matrix2[][])
			{
				int index1,index2;
				int validare=1;
		
				for(index1=0; index1 < n; index1++)
					for(index2=0; index2 < n; index2++)
						if(matrix1[index1][index2] != matrix2[index1][index2])
							{
								validare=0;
								break;
							}
				return validare;
			}
		
		public static int IsZero(int n, int matrix1[][])
			{
				int index1,index2;
				int validare=1;
				
				for(index1=0; index1 < n; index1++)
					for(index2=0; index2 < n; index2++)
						if(matrix1[index1][index2] != 0)
						{
							validare=0;
							break;
						}
			return validare;
			}
		
		
		
		public static int isIdentity(int n, int matrix1[][])
			{
				int index1,index2;
				int validare1=1, validare2=1;
				
				for(index1=0; index1 < n; index1++)
					for(index2=0; index2 < n; index2++)
						if(index1==index2)
							if (matrix1[index1][index2] != 1)
								{
									validare1=0;
									break;
								}
				
				for(index1=0; index1 < n; index1++)
					for(index2=0; index2 < n; index2++)
						if(index1 != index2)
							if(matrix1[index1][index2] != 0)
								{ 
									validare2=0;
									break;
								}
				if(validare1 == 1 && validare2 == 1)
					 return 1;
				else return 0;
							
			}
		
		
		
		public static float fillDegree(int n, int matrix1[][])
			{
				int index1,index2;
				float counter=0;
				
				
				for(index1=0; index1 < n; index1++)
					for(index2=0; index2 < n; index2++)
						if(matrix1[index1][index2] != 0)
							counter=counter+1;
				
				
				return counter/(n*n)*100;
			}
		
		
		
		public static void multiply(int n, int matrix1[][], int matrix2[][], int matrix3[][])
			{
				int index1,index2,index3;
				
				
				for(index1=0; index1 < n; index1++)
					{
						for(index2=0; index2 < n; index2++)
							{
								matrix3[index1][index2]=0;
								for(index3 = 0; index3 < n; index3++)
									matrix3[index1][index2] += matrix1[index1][index3] * matrix2[index3][index2];
							}
					}
			}
		
		public static void main(String[] args) 
		
			{
				Scanner reading= new Scanner(System.in);
			    int size= reading.nextInt();
			    int[][] matrix1= new int[10][10];
			    int[][] matrix2= new int[10][10];
			    int[][] matrix3= new int[10][10];
			    int index1;
			    int index2;
			    
			    for(index1=0; index1 < size; index1++)
					for(index2=0; index2 < size; index2++)
						 matrix1[index1][index2] = reading.nextInt();
			    
			    for(index1=0; index1 < size; index1++)
					for(index2=0; index2 < size; index2++)
						 matrix2[index1][index2] = reading.nextInt();
			    
			    
			    
			    add(size, matrix1, matrix2, matrix3);
			    for(index1=0; index1 < size; index1++)
					{
			    		for(index2=0; index2 < size; index2++)
			    			System.out.print(matrix3[index1][index2]+ " ");
			    		    System.out.println(" ");
			    		    System.out.println(" ");
					}
			    
			    
			    
			    sub(size, matrix1, matrix2, matrix3);
			    for(index1=0; index1 < size; index1++)
				{
		    		for(index2=0; index2 < size; index2++)
		    			System.out.print(matrix3[index1][index2]+ " ");
		    		    System.out.println(" ");
		    		    System.out.println(" ");
				}
			    
			    
			    
			    multiplyscalar(size, 5, matrix1);
			    for(index1=0; index1 < size; index1++)
				{
		    		for(index2=0; index2 < size; index2++)
		    			System.out.print(matrix1[index1][index2]+ " ");
		    		    System.out.println(" ");
		    		    System.out.println(" ");
				}
			    
			    
			    System.out.print("Calculati determinantul primei matrice? 1-Yes 2-No");
			    System.out.println(" ");
			    		int selectie= reading.nextInt();
			    if(selectie == 1)
			    	{
			    		if (size < 1)
					    	System.out.println("Nu trisa!");
			    		else if (size > 3)
						    	System.out.println("Nu mai stiu sa fac determinant de ordinu' "+ size+" nici pe foaie, cu atat mai putin in java" );
			    		else System.out.println(determinant(size, matrix1));
			    	}
			    else
			    	System.out.println("OK");
			    
			    
			    if(AreEqual( size, matrix1, matrix2 ) == 0 )
			    	System.out.println("Nu sunt egale");
			    else
			    	System.out.println("Sunt egale");
			    
			    
			    if ( IsZero(size, matrix1) == 0)
			    	System.out.println("Nu e matrice nula");
			    else
			    	System.out.println("E matrice nula");
			
			    
			    
			    if( isIdentity(size, matrix1) == 0)
			    	System.out.println("Nu e matrice identitate");
			    else
			    	System.out.println("E matrice identitate");
			    
			    System.out.println(fillDegree(size,matrix1)+" %");
			    
			    
			    
			    
			    System.out.println("Produsul matricelor 1 si 2 este ");
			    System.out.println(" ");
			    for(index1=0; index1 < size; index1++)
				{
		    		for(index2=0; index2 < size; index2++)
		    			System.out.print(matrix3[index1][index2]+ " ");
		    		    System.out.println(" ");
		    		    System.out.println(" ");
				}
			}

	}
