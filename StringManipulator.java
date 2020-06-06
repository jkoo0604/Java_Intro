public class StringManipulator {
    public String trimAndConcat(String strA, String strB) {
        return strA.trim() + strB.trim();
    }

    public Integer getIndexOrNull(String str, char char1) {
        if (str.indexOf(char1) != -1) {
            return str.indexOf(char1);
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull(String str, String lookupstr) {
        if (str.indexOf(lookupstr) != -1) {
            return str.indexOf(lookupstr);
        } else {
            return null;
        }
    }

    public String concatSubstring(String strA, int start, int end, String strB) {
        if (start < end && end <= strA.length()) {
            return strA.substring(start, end) + strB;
        } else {
            return "Invalid parameters";
        }
    }
}