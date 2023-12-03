package basics;

import java.util.Scanner;

public class Checkerboard {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Checkerboard width: ");
		int width = sc.nextInt();
		
		System.out.print("Checkerboard height: ");
		int height = sc.nextInt();
		
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				if((i + j) % 2 == 1) {
					System.out.print("#");
				} else {
					System.out.print("_");
				}
			}
			System.out.println();
		}
		
		sc.close();
	
	}

}
