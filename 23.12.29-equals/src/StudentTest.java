
public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("둘리", 100, 100, 100,new Pen(3000));
		Student s2 = new Student("도우너", 100, 100, 100,new Pen(3000));
		Student s3 = new Student("둘리", 100, 100, 100,null);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
	}
}
