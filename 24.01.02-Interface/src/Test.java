
public class Test {
	public static void main(String[] args) {

	//	MyIneterface my = new MyIneterface();
		
		MyKoreanPirnter kor = new  MyKoreanPirnter();
		MyEngPrinter eng = new MyEngPrinter();
		
		kor.printHello();
		eng.printHello();
		
		Speakable i = kor;
		i.printHello();
		
		i= eng;
		i.printHello();
		
		
	}
}
