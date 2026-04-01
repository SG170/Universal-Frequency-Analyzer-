import java.util.*;


public class FrequencyCounter<T> {

    public void analyzeData(T[] elements) {
        
        Map<T, Integer> freqMap = new HashMap<>();
        for (T element : elements) {
            freqMap.put(element, freqMap.getOrDefault(element, 0) + 1);
        }

        int total = elements.length;
        T mode = null;
        int maxFreq = -1;

        System.out.println("--- Frequency Analysis ---");
        for (Map.Entry<T, Integer> entry : freqMap.entrySet()) {
           
            double percentage = (entry.getValue() * 100.0) / total;
            
            System.out.printf("Item: %s | Count: %d | Usage: %.2f%%%n", 
                entry.getKey(), entry.getValue(), percentage);

            
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mode = entry.getKey();
            }
        }
        
        System.out.println("--------------------------");
        System.out.println("Statistical Mode: " + mode + " (Appeared " + maxFreq + " times)");
    }

    public static void main(String[] args) {
        FrequencyCounter<String> counter = new FrequencyCounter<>();
        
       
        String[] tags = {"Java", "SQL", "React", "Java", "DSA", "Java", "SQL"};
        
        counter.analyzeData(tags);
    }
}
