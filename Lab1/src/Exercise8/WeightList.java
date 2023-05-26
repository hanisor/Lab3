package Exercise8;

import java.util.ArrayList;
import java.util.StringTokenizer;
import Exercise7.HumanWeight;

public class WeightList {
public String calculateWeights (String earthWeights) {
		
		ArrayList<HumanWeight> weights = new ArrayList<HumanWeight>();
		
		// Tokenize data
		StringTokenizer tokens = new StringTokenizer(earthWeights, ";");
		while (tokens.hasMoreTokens()) {
			
			String data = tokens.nextToken();
			
			// Wrap data in object
			HumanWeight weight = new HumanWeight();
			weight.setWeightEarth(Double.parseDouble(data));
			
			// Add to list
			weights.add(weight);
			
		} 
		
		// Wrap in record
		WeightList record = new WeightList();
		record.setWeights(weights);
		
		
		// Format output
		String result = "";
		for (HumanWeight weight:record.getWeights()) {
			
			result += "  Earth Weight: " + weight.getWeightEarth() + "kg \tMars Weight: " 
					+ String.format("%.2f", weight.getWeightMars()) + "kg\n";
			
		}
		
		return result;
	}
	
	private HumanWeight[] getWeights() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void setWeights(ArrayList<HumanWeight> weights) {
		// TODO Auto-generated method stub
		
	}
}