import java.util.HashMap;
import java.util.Set;
public class TrackList {
    public static void main(String[] args) {
        HashMap<String, String> trackMap = new HashMap<String, String>();
        trackMap.put("Blowin' in the Wind", "How many roads must a man walk down before you call him a man?");
        trackMap.put("Chimes of Freedom", "Far between sundown's finish an' midnight's broken toll we ducked inside the doorway, thunder crashing");
        trackMap.put("Like a Rolling Stone", "How does it feel to be on your own with no direction home, like a complete unknown, like a rolling stone?");
        trackMap.put("Dark Eyes", "I live in another world where life and death are memorized, where the earth is strung with lovers' pearls and all I see are dark eyes");

        System.out.println(trackMap.get("Dark Eyes"));
        
        Set<String> keys = trackMap.keySet();
        for(String key : keys) {
            // System.out.println(key);
            // System.out.println(trackMap.get(key));
            System.out.println(key + ": " + trackMap.get(key));
        }
    }
}