import java.util.HashMap;
import java.util.Map;

class ErrorAnalyzer {
    public int mostFrequentErrorCode(int[] codes) {
        if (codes == null || codes.length == 0) {
            throw new IllegalArgumentException("Codes array cannot be empty");
        }
        
        Map<Integer, Integer> freq = new HashMap<>();
        int bestCode = codes[0];
        int bestCount = 0;
        
        for (int code : codes) {
            int count = freq.merge(code, 1, Integer::sum);
            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }
        return bestCode;
    }
}