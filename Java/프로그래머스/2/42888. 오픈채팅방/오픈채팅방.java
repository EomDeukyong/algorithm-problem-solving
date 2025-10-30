import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String[] record) {
        List<String> answer=new ArrayList<>();
        HashMap<String, String> h1 = new HashMap<String, String>( );
        for(int i=0;i<record.length;i++){
            String[] split_str=record[i].split(" ");
            if(!split_str[0].equals("Leave")){
                h1.put(split_str[1],split_str[2]);
            }
        }
        for(int i=0;i<record.length;i++){
            String[] split_str=record[i].split(" ");
            if (split_str[0].equals("Enter")){
                answer.add(String.format("%s님이 들어왔습니다.", h1.get(split_str[1])));
            } else if (split_str[0].equals("Leave")){
                answer.add(String.format("%s님이 나갔습니다.", h1.get(split_str[1])));
            }
        }
        return answer.toArray(new String[0]);
    }
}