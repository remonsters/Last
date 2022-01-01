package third_task;

public class DifferentLotter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lotter1=(int)(Math.random()*10);
		int lotter2=0;
		
		for(int i=0;i<=9;i++) {
			if(lotter1!=lotter2) {
				lotter2=i;
				break;
			}
		}
		System.out.println(lotter1*10+lotter2);

	}

}
