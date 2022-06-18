import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String s){
        Map<Character,Integer> map = new HashMap<>();
        //get the keys as the roman values and thier correspond values as objects
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        //initialize the result with the last(index-wise) value of the string
        int result = map.get(s.charAt(s.length()-1));

        //running a loop thu string from the second last element to the first one
        for(int i=s.length()-2; i>=0; i--){
            //where-ever it finds a value less than the consecutive next char, it subtracts it from result
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                result = result-map.get(s.charAt(i));
            }//else it adds
            else{
                result = result+ map.get(s.charAt(i));
            }
        //hence return the result
    }return result;
}
    public static void main(String[] args) {
        System.out.println(romanToInteger("LIVI"));

    }
}
