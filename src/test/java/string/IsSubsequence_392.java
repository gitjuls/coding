package string;

public class IsSubsequence_392 {
    //Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    //A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

    //Example 1:
    //Input: s = "abc", t = "ahbgdc"
    //Output: true

    //Example 2:
    //Input: s = "axc", t = "ahbgdc"
    //Output: false

    public static void main(String[] args) {
        String s = "rjufvjafbxnbgriwgokdgqdqewn";
        String t = "mjmqqjrmzkvhxlyruonekhhofpzzslupzojfuoztvzmmqvmlhgqxehojfowtrinbatjujaxekbcydldglkbxsqbbnrkhfdnpfbuaktupfftiljwpgglkjqunvithzlzpgikixqeuimmtbiskemplcvljqgvlzvnqxgedxqnznddkiujwhdefziydtquoudzxstpjjitmiimbjfgfjikkjycwgnpdxpeppsturjwkgnifinccvqzwlbmgpdaodzptyrjjkbqmgdrftfbwgimsmjpknuqtijrsnwvtytqqvookinzmkkkrkgwafohflvuedssukjgipgmypakhlckvizmqvycvbxhlljzejcaijqnfgobuhuiahtmxfzoplmmjfxtggwwxliplntkfuxjcnzcqsaagahbbneugiocexcfpszzomumfqpaiydssmihdoewahoswhlnpctjmkyufsvjlrflfiktndubnymenlmpyrhjxfdcq";
        System.out.println(isSubsequence(s,t));

    }
    public static boolean isSubsequence(String s, String t) {
        //check if String t contains each char from String s
        //save index, if index equal -1 return false
        //otherwise cut String t and start next search from last index+1 (last index)
        //to avoid situation when index is repeating and
        //to avoid situation when next index is point back

        for(int i=0; i<s.length(); i++){
            int index = t.indexOf(s.charAt(i));
            if(index==-1){
                return false;
            }
            if(index<t.length()) {
                t = t.substring(index+1);
            }else{
                t = t.substring(index);
            }
        }
        return true;
    }
}
