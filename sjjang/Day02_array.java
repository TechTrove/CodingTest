package sjjang;
import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book){
        // 1. phone_book 정렬
        Arrays.sort(phone_book);

        // 2. 1중 loop을 돌면서 앞번호가 뒷번호의 접두어 인지 확인
        // 반복 횟수는 데이터 length 갯수보다 1번 적게 하면 됨. 마지막 비교할 필요없음.
        for(int i=0; i<phone_book.length-1; i++)
            if(phone_book[i+1].startsWith(phone_book[i]))
                return false;

        // 3. 여기까지 오지 못했다면 접두어가 X.
        return true;
    }

    public static void main(String[] args){
        String[] phone_book = {"119", "97654", "119876"};
        Solution sol = new Solution();
        System.out.println(sol.solution(phone_book));
    }
}
