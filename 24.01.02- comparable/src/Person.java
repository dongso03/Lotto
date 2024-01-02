
public class Person implements Comparable<Person> {
	private int hei;
	private int wei;
	private String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hei;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + wei;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (hei != other.hei)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (wei != other.wei)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [hei=" + hei + ", wei=" + wei + ", name=" + name + "]";
	}

	public int getHei() {
		return hei;
	}

	public void setHei(int hei) {
		this.hei = hei;
	}

	public int getWei() {
		return wei;
	}

	public void setWei(int wei) {
		this.wei = wei;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int hei, int wei, String name) {
		super();
		this.hei = hei;
		this.wei = wei;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		
		return this.hei - o.hei;
	}
	
}
