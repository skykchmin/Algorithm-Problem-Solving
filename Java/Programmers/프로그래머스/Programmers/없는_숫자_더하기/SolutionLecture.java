package 없는_숫자_더하기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SolutionLecture {
    public int solution(int[] numbers) {
        return IntStream.range(0, 10)
                .filter(i -> Arrays.stream(numbers)
                        .noneMatch(num -> i == num))
                .sum();
    }
}
