package third_task;

public class Pick_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		int number=(int)(Math.random()*12+1);
		int color=(int)(Math.random()*3+1);
		if(color==1) {
			str="Clubs";
		}
		else if(color==2) {
			str="Diamonds";
		}
		else if(color==3) {
			str="Hrarts";
		}
		else {
			str="Spades";
		}
		
		if(number==1) {
			System.out.println("The card you picked is Ace of "+str);
		}
		else if(number==2) {
			System.out.println("The card you picked is 2 of "+str);
		}
		else if(number==3) {
			System.out.println("The card you picked is 3 of "+str);
		}
		else if(number==4) {
			System.out.println("The card you picked is 4 of "+str);
		}
		else if(number==5) {
			System.out.println("The card you picked is 5 of "+str);
		}
		else if(number==6) {
			System.out.println("The card you picked is 6 of "+str);
		}
		else if(number==7) {
			System.out.println("The card you picked is 7 of "+str);
		}
		else if(number==8) {
			System.out.println("The card you picked is 8 of "+str);
		}
		else if(number==9) {
			System.out.println("The card you picked is 9 of "+str);
		}
		else if(number==10) {
			System.out.println("The card you picked is 10 of "+str);
		}
		else if(number==11) {
			System.out.println("The card you picked is Jack of "+str);
		}
		else if(number==12) {
			System.out.println("The card you picked is Queen of "+str);
		}
		else if(number==13) {
			System.out.println("The card you picked is King of "+str);
		}

	}

}
