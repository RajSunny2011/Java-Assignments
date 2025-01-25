import java.util.HashMap;
public class question2MajorityElement {
    public static void main(String[] args) {
        int numbers[] = {1,2,4,6,4,4,4};
        HashMap<Integer, Integer> frequencyHashMap = new HashMap<>();
        for (int i : numbers) {
            if (frequencyHashMap.containsKey(i)){
                frequencyHashMap.put(i, (frequencyHashMap.get(i)+1));
            }
            else{
                frequencyHashMap.put(i, 1);
            }
        }
        for (int i : frequencyHashMap.keySet()) {
            if (frequencyHashMap.get(i)>(numbers.length/2)){
                System.out.println(i);
                break;
            }
        }
    }
}
