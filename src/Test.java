import java.util.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.Collection;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println(sortDesc(123456789));

    }


        public static int sortDesc(final int num) {
            //Your code
            if ((num < 0) || (num / 10 == 0)) {
                return num;
            }
            int number = num;
            int result = 0;
            while (number > 0) {
                result += (number % 10);
                number /= 10;
                if (number == 0) {
                    break;
                }
                result = result * 10;
            }
            return result;
        }


}

