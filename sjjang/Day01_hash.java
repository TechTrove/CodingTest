package sjjang;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion){
        String answer="";
        // 1. participant HashMap 만듬
        // for-each 구문
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0)+1);

        // 2. completion HashMap 뺌
        for (String player : completion)
            map.put(player, map.get(player)-1);

        // 3. value가 0이 아닌 주자 찾음
        for (String key : map.keySet()){
            if(map.get(key) != 0){
                answer=key;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        // class Solution을 기반으로 sol이라는 객체 인스턴스 생성.
        Solution sol = new Solution();
        // sol 객체 인스턴스로 내부 class, method 호출 가능. 변수 접근도 가능.
        System.out.println(sol.solution(part, comp));
    }
}
