package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x;
		double y; 
		int inCircle = 0; 
		int outCircle = 0; 
		
		
		for (int i = 0; i < 1000; i++) {
			x = Math.random() - 0.5;
			y = Math.random() - 0.5;
			double distance = Math.sqrt((Math.pow(x,2))  + (Math.pow(y, 2) ));
	
		if (distance > 0.5){
			outCircle++;
		}
		else {
			inCircle++;
			
		}

		}
		double ratio = (double)(inCircle) / 1000.00 ;
	double pi = ratio / 0.25;
	System.out.println(pi);
	}

}
