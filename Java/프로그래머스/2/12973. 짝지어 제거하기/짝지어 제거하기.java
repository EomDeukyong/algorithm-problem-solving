import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        Stack<String> stackStr = new Stack<>();
        for(int i=0;i<s.length();i++){
            String current_char = String.valueOf(s.charAt(i));
            if(stackStr.isEmpty()){
                stackStr.push(current_char);
            } else {
                String before_char = stackStr.pop();
                if (!current_char.equals(before_char)){
                    stackStr.push(before_char);
                    stackStr.push(current_char);
                }
            }

        }
        if(stackStr.isEmpty()){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}