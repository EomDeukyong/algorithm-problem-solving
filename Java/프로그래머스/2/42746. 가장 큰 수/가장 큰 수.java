import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        String[] str_numbers = new String[numbers.length];
        String answer="";
        for (int i = 0; i < numbers.length; i++) {
            str_numbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(str_numbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        for(String number:str_numbers){
            answer+=number;
        }
        if(str_numbers[0].equals("0")){
            return "0";
        }
        return answer;
    }
}
