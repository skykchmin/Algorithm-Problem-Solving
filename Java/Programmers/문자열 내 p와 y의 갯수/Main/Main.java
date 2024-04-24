class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String lowerCase = s.toLowerCase();

        int countP = 0;
        int countY = 0;
        for(int i = 0; i < lowerCase.length(); i++){
            if(lowerCase.charAt(i) == 'p'){
                countP += 1;
            } else if (lowerCase.charAt(i) == 'y') {
                countY += 1;
            }
        }

        if(countP != countY) answer = false;

        return answer;
    }
}