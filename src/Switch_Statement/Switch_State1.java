package Switch_Statement;

public class Switch_State1 {        //use to excute 1 statement from multi condition

	public static void main(String[] args) {

		int num = 400;

		switch (num) {
		case 90:
			System.out.println("NO. matched 10");
			break;

		case 200:
			System.out.println("No.matched 200");
			break;

		case 400:
			System.out.println("No.matched 400");
			break;

		default:                                              //optional
			System.out.println("No. is not matched");

		}
	}
}
