import java.io.*;  

public class Tp1q9 {  
	public static void main(String args[]) throws Exception {  
		int n=MyIO.readInt();
		long tam;
		int i=0;
		RandomAccessFile raf = new RandomAccessFile("Exemplo.txt","rw");
		while(i<n){
			double real=MyIO.readDouble();
			raf.writeDouble(real);
			i++;
		}//fim while
		tam=raf.getFilePointer();
		raf.close();
		i=0;
		raf = new RandomAccessFile("Exemplo.txt","r");
		tam-=8;
		while(i<n){
			raf.seek(tam);
			double real = raf.readDouble();
			if(ehInteiro(real)){
				MyIO.println((int)real);
			}//fim if
			else MyIO.println(real);	
			tam-=8;
			i++;	
		}//fim while
		raf.close();
	}//fim main
/*
@date:12/02/2019
@author: Lincoln Antunes Nogueira Coutinho
@param: double x
@return: boolean ehInteiro
@Copyright notice: Método que retorna um valor booleano indicando se um double eh um numero inteiro
*/
	public static boolean ehInteiro(double x){
		return ((int)x==x);
	}// fim ehInteiro
}//fim class	





