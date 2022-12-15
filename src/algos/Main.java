package algos;
import java.util.Arrays;
import java.util.Locale;
import java.util.Stack;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
        int[] sampleArr = new int[] {2,3,-2,4};
        System.out.println(maximumSubarrayProduct.Solution(sampleArr));
    }
}


class processString {
    public static Boolean processString(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int[] arr = new int[]{1,3,2,5};
        Stack<String> stck = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            stck.push(str.substring(i, i+1));
        }

        StringBuilder reverseStringBuilder = new StringBuilder();
        while (!stck.isEmpty()) {
            reverseStringBuilder.append(stck.pop());
        }

        String reversedString = reverseStringBuilder.toString();
        return reversedString.equals(str);
    }
}

class maximumSubarrayProduct {
    public static int Solution(int[] arr) {
        int maxElem = Arrays.stream(arr).max().getAsInt();
        int localMax = 1;
        int localMin = 1;

        for(int num : arr) {
            if (num == 0) {
                localMax = 1;
                localMin = 1;
                continue;
            }

            int tmp = localMax * num;
            int localMaxTmp = Math.max(tmp, localMin);
            localMax = Math.max(localMaxTmp, num);

            int localMinTmp = Math.min(tmp, localMin);
            localMin = Math.min(localMinTmp, num);


            maxElem = Math.max(maxElem, localMax);

        }

        return maxElem;

    }
}