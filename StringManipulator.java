public class StringManipulator {
    //Trim both input strings and then concatenate them. Return the new string. How to use trim?? https://www.javatpoint.com/java-string-trim
    public String trimAndConcat(String str1, String str2) {
        return str1.trim() + str2.trim();
    }
    //Get the index of the character and return either the index or null. If the character appears multiple times, return the first index.
    public Integer getIndexOrNull(String str1, char char1){
        integer = idx = str1.indexOf(char1);
        if (idx ==-1);
            return null;
            return char1(idx);
    }
    // Get the index of the start of the substring and return either the index or null.
    public Integer getIndexOrNull(String str1, String str2){
        integer = idx = str1.indexOf(str2);
        if (idx ==-1);
        return null;
      return str2(idx); 
    }
    //Get a substring using a starting and ending index, and concatenate that with the second string input to our method.
    public String concatSubstring(String str1, int idx1, int idx2, String str2){
        integer = idx = str1.indexOf(str1 + str2);
        return str1 + idx + idx + str2;
    }
}