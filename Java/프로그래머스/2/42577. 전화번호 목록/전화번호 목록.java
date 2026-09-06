import java.util.HashSet;
class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> hashSet= new HashSet<>();
        
        for (String phone : phone_book) {
            hashSet.add(phone);
        }
        
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (hashSet.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }
        return true;
    }
}