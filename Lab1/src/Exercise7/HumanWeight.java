package Exercise7;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanWeight {
	
	private double weightEarth;
	private double weightMars;
	
	public double getWeightEarth() {
		return weightEarth;
	}
	public void setWeightEarth(double weightEarth) {
		this.weightEarth = weightEarth;
	}
	public double getWeightMars() {
		return weightMars;
	}
	public void setWeightMars(double weightMars) {
		this.weightMars = weightMars;
	}
	
	
	public static void main(String[] args ) {

		Scanner input = new Scanner(System.in);

		System.out.print("How many kg do you weigh? : ") ;

		double weight = input.nextDouble();

		// compute weights on other planets

		
		double earth = (weight * 1);
		double mars = (weight * .38);
		

		// display results

		
		System.out.print("You weigh " + earth + " kg on Earth \n");
		System.out.print("You weigh " + mars + " kg on Mars \n");
		

		}
	
	public class WeightList {
		private ArrayList<HumanWeight> humanWeights;

		public ArrayList<HumanWeight> getWeights() {
			return humanWeights;
		}

		public void setWeights(ArrayList<HumanWeight> weights) {
			this.humanWeights = weights;
		}
	
	}
	

}
