package entities;

public class Sum {

	private Double sum = 0.0;
	private Integer count = 0;
	
	public Sum() {
	}

	public Sum(Double sum, Integer count) {
		this.sum = sum;
		this.count = count;
	}

	public Double getSum() {
		return sum;
	}
	
	public void sum (double value) {
		sum += value;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	public void addCount() {
		count++;
	}
	
	public Double media() {
		return getSum() / getCount();
	}
	
	public String toString() {
		return getCount() 
		      + " positive values\n"
		      + "Media: "
		      + String.format("%.1f", media());
	}
}
