//URI - 1064 - 24/08/2021.

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Values;
import entities.Sum;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Values> list = new ArrayList<>();
		Sum sum = new Sum();
		
		System.out.println("How many values will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Value #" + (i + 1) + ": ");
			
			System.out.print("Value: ");
			Double value = sc.nextDouble();
			
			list.add(new Values(value));
		}
		
		for (Values pro : list) {
			if (pro.getValue() > 0) {
				sum.sum(pro.getValue()) ;
				sum.addCount();
			}
		}
		
		System.out.println(sum);
		sc.close();
	}	
}