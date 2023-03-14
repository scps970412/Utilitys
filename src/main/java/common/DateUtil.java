package common;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    /**
     * 字串日期格式化
     * 
     * @param inDate           需格式化的日期字串
     * @param inPattern        輸入日期字串的格式
     * @param outPatternString 輸出日期字串的格式
     * @return 格式化結果
     */
    public static String format(String inDate, String inPattern, String outPatternString) {
        String dateSeparatorRegex = "[ -/\\.]";
        String tempDate = inDate.replaceAll(dateSeparatorRegex, "");
        inPattern = inPattern.replaceAll(dateSeparatorRegex, "");
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(inPattern);
            LocalDate outputDate = LocalDate.parse(tempDate, formatter);
            DateTimeFormatter outFormatter = DateTimeFormatter.ofPattern(outPatternString);
            return outputDate.format(outFormatter);
        } catch (Exception e) {
            return inDate;
        }
    }
}
