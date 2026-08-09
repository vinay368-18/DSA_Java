package Leet_Code.Greedy;

public class GasStation {

	public static void main(String[] args) {
		int[] gas = {2,3,4};
		int[] cost = {3,4,3};
		int r = canCompleteCircuit(gas,cost);
		System.out.println(r);
	}

	static int canCompleteCircuit(int[] gas, int[] cost) {
		 int[] fuel = new int[gas.length];

	     for (int i = 0; i < gas.length; i++) {
	    	 fuel[i] = gas[i] - cost[i];
	     }
	     for (int index = 0; index < gas.length; index++) {
   
	          if (fuel[index] < 0) {
	              continue;
	          }

	          int currentGas = 0;
	          int count = 0;
	          int i = index;

	            while (count < gas.length) {

	                currentGas += gas[i];
	                currentGas -= cost[i];

	                // Cannot reach the next station
	                if (currentGas < 0) {
	                    break;
	                }

	                // Move to next station
	                i++;

	                // Circular movement
	                if (i == gas.length) {
	                    i = 0;
	                }

	                count++;
	            }

	            // Successfully visited every station
	            if (count == gas.length) {
	                return index;
	            }
	        }

	        return -1;
	}
	
	

}
