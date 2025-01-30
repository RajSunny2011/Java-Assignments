import java.util.HashMap;
public class question2MajorityElement {
    public static void main(String[] args) {
        int numbers[] = {1,2,4,6,4,4,4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : numbers) {
            if (frequencyMap.containsKey(i)){
                frequencyMap.put(i, (frequencyMap.get(i)+1));
            }
            else{
                frequencyMap.put(i, 1);
            }
        }
        for (int i : frequencyMap.keySet()) {
            if (frequencyMap.get(i)>(numbers.length/2)){
                System.out.println(i);
                break;
            }
        }
    }
}
