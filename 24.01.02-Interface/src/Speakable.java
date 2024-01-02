class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
class KoreanPerson extends Person implements Speakable {

	public KoreanPerson(String name) {
		super(name);
	}

	@Override
	public void printHello() {
	System.out.println("안녕 내이름은 :"+ super.getName());
		
	}
	
}

class EngPerson extends Person implements Speakable {

	public EngPerson(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printHello() {
		System.out.println("hi my name:"+ super.getName());
	}
	
	
}


public interface Speakable {
//인터페이스는  추상메소드만을 가질 수 있다 
	public abstract void printHello();
}

class MyKoreanPirnter implements Speakable {
	
	@Override
	public void printHello() {
		System.out.println("안뇽!");
	}
}

class MyEngPrinter implements Speakable {

	@Override
	public void printHello() {
		System.out.println("HI!");
	}
	
	
}