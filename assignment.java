package calculator;

public class assignment implements InterfaceCal
{
	 public int first;
	 public int second;
	 public int third;
	 
	 public void setOprands(int first, int second, int third)
	 {
		 this.first = first;
		 this.second = second;
		 this.third = third;
	 }
	 public int sum()
	 {
		 return this.first+this.second+this.third;
	 }
	 public int avg()
	 {
		 int sum = this.sum();
		 int avg = (int)sum/3;
		 return avg;
	 }
	
}