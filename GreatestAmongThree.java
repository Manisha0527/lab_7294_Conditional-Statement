import java.util.Scanner;

public class GreatestAmongThree {
		public static void main(String args[]) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter three numbers: ");
			double num1=scanner.nextDouble();
			double num2=scanner.nextDouble();
			double num3=scanner.nextDouble();
			
			if(num1>num2){
				if(num1>num3){
					System.out.println(num1 + "is the greatest.");
				}else{
					System.out.println(num3 + "is the greatest.");
				}
			}else{
				if(num2>num3){
					System.out.println(num2 + "is the greatest.");
				}else{
					System.out.println(num3 + "is the greatest.");
				}
			}
			scanner.close();
		}
}