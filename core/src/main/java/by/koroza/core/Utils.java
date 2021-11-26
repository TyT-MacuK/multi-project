package by.koroza.core;

import by.koroza.util.StringUtil;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        boolean flag = true;
        StringUtil util = new StringUtil();
        for (String line : str) {
            if (!util.isPositiveNumber(line)) {
                flag = false;
            }
        }
        return flag;
    }
}
