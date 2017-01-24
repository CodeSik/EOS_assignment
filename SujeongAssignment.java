package calculator;

class SujeongAssignment<T extends Number>
{
	 public <T extends Number> double add(T t1,T t2)
	 {
		 double v1 = t1.doubleValue();
		 double v2 = t2.doubleValue();
		 
		 return v1+v2 ;
	 }
	 
	 public <T extends Number > double sub(T t1, T t2)
	 {
		 double v1 = t1.doubleValue();
		 double v2 = t2.doubleValue();
		 return v1-v2;
	 }
	 
	 public <T extends Number > double mul(T t1, T t2)
	 {
		 double v1 = t1.doubleValue();
		 double v2 = t2.doubleValue();
		 return v1*v2;
	 }
	 
	 public <T extends Number > double div(T t1, T t2)
	 {
		 double v1 = t1.doubleValue();
		 double v2 = t2.doubleValue();
		 return v1/v2;
	 }
	 
	 
	 
}