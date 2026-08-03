package GfgPractice.Greedy;
/*to find the maximum profit possible by buying and 
 * selling the stocks on different days when at most
 *  one transaction is allowed*/
public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {7, 10, 1, 3, 6, 9, 2};
		System.out.println("Max Profit:"+maxProfit(prices));
	}

	static int maxProfit(int[] prices) {
		int max=0,min = Integer.MAX_VALUE;
		for(int i=0;i<prices.length;i++) {
			if(prices[i] < min)
				min = prices[i];
			max = Math.max(max, prices[i]-min);
		}
		return max;
	}
}
