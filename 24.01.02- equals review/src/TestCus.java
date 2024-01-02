import java.util.Scanner;

public class TestCus {
	public static void main(String[] args) {

		Customer c1 = new Customer("둘리", "010-2323-2332", 201);
		Customer c2 = new Customer("둘리", "010-2323-2332", 201);
		Customer c3 = new Customer("둘리", "010-2323-2332", 401);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		Customer[]	arr = {c1,c2,c3};
		Scanner scan = new Scanner(System.in);
		System.out.println("고객정보 입력하셈");
		String name = scan.nextLine();
		String PhonNum	= scan.nextLine();
		Customer input = new Customer(name, PhonNum,0);
		int count = 0;
		for (Customer elem : arr) {
			if(elem.equals(input)) {
				count++;
			}
		}
		System.out.println("동일한 고객예약수"+ count);
	}
}
