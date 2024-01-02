import java.util.Comparator;

public class WeiComprator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getWei() - o2.getWei() ;
	}

	
}
