import java.util.Objects;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        // numbers => [1, 2, 3]
        // answer => [3, 1, 2]
        
        // numbers[0] => numbers[1] => answer[0]
        // numbers[1] => numbers[2] => answer [1]
        // numbers[2] => numbers[0] => answer [2]
        // 인덱스값이 +1씩 늘어나는 규칙이 있음
        if(Objects.equals(direction, "right")){
            for (int i = 0; i < numbers.length- 1; i++) {
                answer[i+1] = numbers[i];
                // answer [1] = numbers[0]
                // answer [2] = numbers[1]
            }
            answer[0] = numbers[numbers.length -1];
        }

        if(Objects.equals(direction, "left")){
            for (int i = 0; i < numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[answer.length -1] = numbers[0];
        }
        return answer;
    }

    // deque
    import java.util.ArrayDeque;
    import java.util.Deque;

        class Solution {
            public int[] solution(int[] numbers, String direction) {
                Deque<Integer> deque = new ArrayDeque<>();
                for (int number : numbers) {
                    deque.add(number);
                }

                if ("right".equals(direction)) {
                    deque.addFirst(deque.removeLast());
                } else if ("left".equals(direction)) {
                    deque.addLast(deque.removeFirst());
                }

                int[] answer = new int[numbers.length];
                int i = 0;
                for (int num : deque) {
                    answer[i++] = num;
                }

                return answer;
            }
        }

}
