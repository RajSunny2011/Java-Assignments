import java.util.HashMap;
public class MajorityElement {
    public static void main(String[] args) {
        int numbers[] = {1,2,4,6,4,4,4};
        boolean flag = true;
        HashMap<Integer, Integer> occurenceHashMap = new HashMap<>();
        for (int i : numbers) {
            if (occurenceHashMap.containsKey(i)){
                occurenceHashMap.put(i, (occurenceHashMap.get(i)+1));
            }
            else{
                occurenceHashMap.put(i, 1);
            }
        }
        for (int i : occurenceHashMap.keySet()) {
            if (occurenceHashMap.get(i)>(numbers.length/2)){
                System.out.println("Majority: "+i);
                flag = false;
                break;
            }
        }
        if (flag) {
        System.out.println("No Majority");
        }
    }
}
