import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = -1;
        // before = "olleh"
        // after = 	"hello"

        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();

        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);

        if(Arrays.equals(beforeChar,afterChar) ){
            answer = 1;
        }else {
            answer = 0;
        }
        return answer;
    }
}

// 다른풀이

import java.util.Arrays;
import java.util.Objects;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        // before = "olleh"
        // after = 	"hello"
        String[] beforeSplit = before.split("");
        String[] afterSplit = after.split("");

        Arrays.sort(beforeSplit);
        Arrays.sort(afterSplit);

        for (int i = 0; i < beforeSplit.length; i++) {
            if (!Objects.equals(afterSplit[i], beforeSplit[i])) {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}
