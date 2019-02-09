import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array [1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if (Arrays.asList(array).contains(value)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            result[currentIndex] = "";
            result[currentIndex] += array[array.length - (currentIndex + 1)];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = reverse(array);
        for (int currentIndex = 0; currentIndex  < array.length; currentIndex ++) {
            if (!array[currentIndex].equals(reversedArray[currentIndex ])){
                return false;
            }
        } return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean result = true;
        String arrStr = Arrays.toString(array).toLowerCase();
        String[] req = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};
           for(String str : req){
               if(arrStr.contains(str) == false){
                   result = false;
               }
           }
       return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++){
            if (array[currentIndex].equals(value)) {
                result ++;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        list.remove(valueToRemove);
        array = list.toArray(new String[0]);
   
        return array;
}

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(array[0]);
        for (int currentIndex = 1; currentIndex < array.length; currentIndex++){
            if (!array[currentIndex].equals(array[currentIndex - 1])){
                list.add(array[currentIndex]);
            }
        }
        String[] resultArray = list.toArray(new String[list.size()]);
        return resultArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int size = 1;
        for (int currentIndex = 0; currentIndex < array.length -1; currentIndex++){
            if (array[currentIndex] != array[currentIndex + 1]) size ++;
        }
        String[] answer = new String[size];
        String temp = array[0];
        int placeHolder = 0;
        for (int currentIndex = 1; currentIndex < array.length; currentIndex++){
            if (array[currentIndex] == array[currentIndex - 1]){
                temp = temp + array[currentIndex];
            }
            else {
                answer[placeHolder++] = temp;
                temp = array[currentIndex];
            }
        }
        answer[answer.length - 1] = temp;
        return answer;
    }
}
