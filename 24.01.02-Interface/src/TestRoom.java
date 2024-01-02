import java.util.Scanner;

public class TestRoom {

	public static void main(String[] args) {
		Speakable[] members = new Speakable[]	{
				new KoreanPerson("호동")
				, new KoreanPerson("수근")
				, new KoreanPerson("종민")
				, new EngPerson( "Eun")
				
		};
		
		MeetingRoom room = new MeetingRoom(members);
		room.pirntIntroduceAll();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("회의에 참여중인지 이름 확인?");
		String name = scan.nextLine();
		boolean result = room.isSame(new KoreanPerson(name));
		if(result) {
			System.out.println("회의참석중이다");
		}else {
			System.out.println("회의 참석 ㄴ");
		}
	}
}
