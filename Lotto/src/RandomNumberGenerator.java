import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 제외할 숫자 6개를 입력받음
        List<Integer> excludedNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.print("제외할 숫자를 입력하세요 (" + (i + 1) + "/6): ");
            int excludeNumber = scanner.nextInt();
            excludedNumbers.add(excludeNumber);
        }

        // 1부터 45까지의 숫자를 리스트에 추가
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }

        // 입력한 숫자들을 리스트에서 제외
        numbers.removeAll(excludedNumbers);

        // 리스트를 섞음
        Collections.shuffle(numbers);

        // 6개의 숫자 선택 (중복 없음)
        List<Integer> selectedNumbers = numbers.subList(0, 6);

        // 선택된 숫자 출력
        System.out.println("선택된 6개의 숫자: " + selectedNumbers);

        // 최종 결과 출력
        System.out.println("최종 6개의 숫자 (제외 " + excludedNumbers + "): " + selectedNumbers);
    }
}