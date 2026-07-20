import java.util.HashSet;
import java.util.Set;

class TokenValidator {
    public boolean hasDuplicateToken(String[] tokens) {
        Set<String> seen = new HashSet<>();
        for (String token : tokens) {
            // add() returns false if the item was already in the set
            if (!seen.add(token)) {
                return true;
            }
        }
        return false;
    }
}