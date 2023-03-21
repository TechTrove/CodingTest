package sjjang;
import java.util.Arrays;

class Solution {
    // String을 반환함. 파라미터는 String 형식의 배열 두개
    public String solution(String[] participant, String[] completion){
        // 1. 두 배열 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 두 배열이 다를 때 까지 search (다른애가 완주 못한애)
        int i=0;
        for (; i<completion.length; i++)
            if(!participant[i].equals(completion[i]))
                break;

        // 3. 반환
        return participant[i];
    }

    // static : 객체 인스턴스 없이도 호출 가능.
    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        // class Solution을 기반으로 sol이라는 객체 인스턴스 생성.
        Solution sol = new Solution();
        // sol 객체 인스턴스로 내부 class, method 호출 가능. 변수 접근도 가능.
        System.out.println(sol.solution(part, comp));

    }
}