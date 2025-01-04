import java.util.Arrays;
import java.util.Scanner;

public class homeworkeEx1 {
    public static void main(String[] args) {
        System.out.println(validID("14434310"));
    }
    public static boolean validID(String id) {
        boolean isvalid = true;
        if (id.length() > 9) {
            isvalid = false;
        } else if (id.length() < 9) {
            String zero = "";
            for (int i = 0; i < (9 - id.length()); i++) {
                zero = zero + 0;
            }
            id = zero + id;
            System.out.println(id);
        }
        if (isvalid) {
            int[] idArray = new int[id.length()];
            for (int i = 0; i < idArray.length; i++) {
                idArray[i] = Character.getNumericValue(id.charAt(i));
            }
            int[] idMultiplyBy1And2 = {1, 2, 1, 2, 1, 2, 1, 2, 1};
            int sum = 0;
            for (int i = 0; i < id.length(); i++) {
                int result = idArray[i] * idMultiplyBy1And2[i];
                if (result > 9) {
                    result = result % 10 + result / 10;
                }
                sum = sum + result;
            }
                    if (sum % 10 != 0) {
                        isvalid = false;
                    }
                }
            return isvalid;
        }
        }


