package com.ydm.platform.common.utils;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.IllegalFormatException;

/**
 * 时间工具类
 *
 * @author myseital
 * @date 2022/9/6
 */
public class DateUtil {

    /**
     * 时间 默认格式 yyyy-MM-dd HH:mm:ss
     */
    public static String PATTERN_DATE_TIME_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    /**
     * 时间ISO格式
     */
    public static String PATTERN_DATE_TIME_ISO = "yyyy-MM-dd'T'HH:mm:ss";
    /**
     * 日期 默认格式yyyy-MM-dd
     */
    public static String PATTERN_DATE_DEFAULT = "yyyy-MM-dd";
    /**
     * 时间开始时间 默认格式yyyy-MM-dd 00:00:00
     */
    public static String PATTERN_DATE_START = "yyyy-MM-dd 00:00:00";
    /**
     * 时间结束时间 默认格式yyyy-MM-dd 23:59:59
     */
    public static String PATTERN_DATE_END = "yyyy-MM-dd 23:59:59";
    /**
     * 时区时间 默认格式yyyy-MM-dd'T'HH:mm:ssZ
     */
    public static String PATTERN_DATE_TIME_ZONE = "yyyy-MM-dd'T'HH:mm:ssZ";
    /**
     * 时间ISO8601格式 （世界标准时间格式、UTC时间格式）
     */
    public static String PATTERN_DATE_TIME_ISO8601 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    /**
     * 获取当前时间戳 精确到秒
     */
    public static Integer getCurrentSecond() {
        return new Long(System.currentTimeMillis() / 1000).intValue();
    }

    /**
     * 获取当前时间
     */
    public static Date currentDate() {
        return new Date();
    }

    /** ============= 转 String start =================================**/

    /**
     * 将 Date 类型转为字符串
     */
    public static String format(Date date, String pattern) {
        return format(date, pattern, false);
    }

    /**
     * 将 Date 类型转为字符串
     * @param date 日期对象
     * @param pattern 格式类型
     * @param zoneFormat 是否为时区格式 false 非时区格式 true 时区格式
     * @return
     */
    public static String format(Date date, String pattern, boolean zoneFormat) {
        String result = "";
        if (date != null) {
            if (zoneFormat) {
                ZonedDateTime zonedDateTime = data2ZonedDateTime(date);
                result = dateTime2Str(zonedDateTime, pattern);
            } else {
                LocalDateTime localDateTime = data2LocalDateTime(date);
                result = dateTime2Str(localDateTime, pattern);
            }
        }

        return result;
    }

    /**
     * 将 java.time.LocalDateTime 转为指定格式的时间字串
     * 将 java.time.ZonedDateTime 转为指定格式的时间字串
     */
    private static String dateTime2Str(TemporalAccessor dateTime, String pattern) {
        if (dateTime == null || pattern == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(dateTime);
    }

    /**
     * 将 java.time.LocalDate 转为指定格式的时间字串
     * 格式必须是日期格式不能携带时间信息
     * @param pattern 默认 yyyy-MM-dd
     */
    public static String localDate2Str(LocalDate localDate, String pattern) throws IllegalFormatException {
        if (localDate == null || pattern == null) {
            return "";
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        try {
            return formatter.format(localDate);
        } catch (Exception e) {
            throw new IllegalArgumentException("LocalDate format error! pattern: " + pattern, e);
        }
    }

    /**
     * 时间戳转日期格式字符串
     *
     * @param timestamp milliseconds
     */
    public static String timestamp2Str(Long timestamp, String pattern) {
        return timestamp2Str(timestamp, pattern, false);
    }

    /**
     * 时间戳转日期格式字符串
     *
     * @param timestamp milliseconds
     * @param zoneFormat 是否为时区格式 false 非时区格式 true 时区格式
     * @return
     */
    public static String timestamp2Str(Long timestamp, String pattern, boolean zoneFormat) {
        String result = "";
        if (timestamp == null || pattern == null) {
            return result;
        }
        if (zoneFormat) {
            ZonedDateTime zonedDateTime = timestamp2ZonedDateTime(timestamp);
            result = dateTime2Str(zonedDateTime, pattern);
        } else {
            LocalDateTime localDateTime = timestamp2LocalDateTime(timestamp);
            result = dateTime2Str(localDateTime, pattern);
        }

        return result;
    }

    /**
     * 传入Data类型日期，返回字符串类型时间（ISO8601标准时间）
     *
     * @param date
     * @return
     */
    public static String formatISO8601(Date date) {
        ZonedDateTime zonedDateTime = data2ZonedDateTime(date);
        ZonedDateTime utcDate = zonedDateTime.withZoneSameInstant(ZoneOffset.UTC);
        return dateTime2Str(utcDate, PATTERN_DATE_TIME_ISO8601);
    }

    /** ============= 转 String end ====================================**/

    /** ============= 转 ZonedDateTime LocalDateTime start ==================**/
    /**
     * 将 Date 转为 LocalDateTime
     */
    private static LocalDateTime data2LocalDateTime(Date date) {
        Instant instant = date.toInstant();
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = instant.atZone(zoneId).toLocalDateTime();
        return localDateTime;
    }

    /**
     * 将 Date 转为 ZonedDateTime
     */
    private static ZonedDateTime data2ZonedDateTime(Date date) {
        ZoneId id = ZoneId.systemDefault();
        return ZonedDateTime.ofInstant(date.toInstant(), id);
    }

    /**
     * 将时间字串转为 LocalDateTime，时间字串的格式请用 pattern 指定
     */
    public static LocalDateTime str2LocalDateTime(String datetimeStr, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.parse(datetimeStr, dateTimeFormatter);
        return localDateTime;
    }

    /**
     * 将时间字串转为 LocalDate，时间字串的格式请用 pattern 指定
     */
    public static LocalDate str2LocalDate(String dateStr, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate localDate = LocalDate.parse(dateStr, dateTimeFormatter);
        return localDate;
    }

    /**
     * 时间戳转LocalDateTime
     *
     * @param timestamp milliseconds
     */
    public static LocalDateTime timestamp2LocalDateTime(Long timestamp) {
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zone);
    }

    /**
     * 时间戳转ZonedDateTime
     *
     * @param timestamp milliseconds
     */
    public static ZonedDateTime timestamp2ZonedDateTime(Long timestamp) {
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zone = ZoneId.systemDefault();
        return ZonedDateTime.ofInstant(instant, zone);
    }

    /** ============= 转 ZonedDateTime LocalDateTime end ===========================**/

    /** ============= 转 Date Start ===========================**/

    /**
     * 时间字符串转date
     * @param datetimeStr
     * @param pattern 默认 yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static Date datetimeStr2Date(String datetimeStr, String pattern) {
        if (null == pattern || pattern.isEmpty()) {
            pattern = PATTERN_DATE_TIME_DEFAULT;
        }
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime = str2LocalDateTime(datetimeStr, pattern);
        ZonedDateTime zdt = localDateTime.atZone(zoneId);
        return Date.from(zdt.toInstant());
    }

    /**
     * 日期字符串转date
     * @param dateStr
     * @param pattern 默认 yyyy-MM-dd
     * @return
     */
    public static Date dateStr2Date(String dateStr, String pattern) {
        if (null == pattern || pattern.isEmpty()) {
            pattern = PATTERN_DATE_DEFAULT;
        }
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate localDate = str2LocalDate(dateStr, pattern);
        ZonedDateTime zdt = localDate.atStartOfDay().atZone(zoneId);
        return Date.from(zdt.toInstant());
    }

    /** ============= 转 Date end ==============================**/

    /**
     * 获取今日起始时间
     *
     * @return
     */
    public static Date getTodayOfStart() {
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = currentDate().toInstant();
        LocalDate localDate = instant.atZone(zoneId).toLocalDate();
        ZonedDateTime zdt = localDate.atStartOfDay().atZone(zoneId);
        return Date.from(zdt.toInstant());
    }

    /**
     * 获取今日结束时间
     *
     * @return
     */
    public static Date getTodayOfEnd() {
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = currentDate().toInstant();
        LocalDate localDate = instant.atZone(zoneId).toLocalDate();
        LocalTime localTime = LocalTime.of(23, 59, 59);
        ZonedDateTime zdt = localDate.atTime(localTime).atZone(zoneId);
        return Date.from(zdt.toInstant());
    }

    /** ============= 日期计算 start ==============================**/

    /**
     * 获取几天前的日期
     *
     * @param day
     * @return
     */
    public static Date getTodayBefore(int day) {
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = currentDate().toInstant();
        LocalDate localDate = instant.atZone(zoneId).toLocalDate();
        LocalDateTime beforeDayTime = localDate.atStartOfDay().minusDays(day);
        ZonedDateTime zdt = beforeDayTime.atZone(zoneId);
        return Date.from(zdt.toInstant());
    }

    /**
     * 计算两个日期相差分钟
     *
     * @param beginTime
     * @param endTime
     * @return
     */
    public static Long getMinuteDuration(Date beginTime, Date endTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime startLocalDateTime = LocalDateTime.ofInstant(beginTime.toInstant(), zoneId);
        LocalDateTime endLocalDateTime = LocalDateTime.ofInstant(endTime.toInstant(), zoneId);
        Duration duration = Duration.between(startLocalDateTime, endLocalDateTime);
        return duration.toMinutes();
    }

    /**
     * 计算两个日期相差小时
     *
     * @param beginTime
     * @param endTime
     * @return
     */
    public static Long getHourDuration(Date beginTime, Date endTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime startLocalDateTime = LocalDateTime.ofInstant(beginTime.toInstant(), zoneId);
        LocalDateTime endLocalDateTime = LocalDateTime.ofInstant(endTime.toInstant(), zoneId);
        Duration duration = Duration.between(startLocalDateTime, endLocalDateTime);
        return duration.toHours();
    }

    /**
     * 计算两个日期相差天数
     *
     * @param beginTime
     * @param endTime
     * @return
     */
    public static Long getDayDistance(Date beginTime, Date endTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime startLocalDateTime = LocalDateTime.ofInstant(beginTime.toInstant(), zoneId);
        LocalDateTime endLocalDateTime = LocalDateTime.ofInstant(endTime.toInstant(), zoneId);
        Duration duration = Duration.between(startLocalDateTime, endLocalDateTime);
        return duration.toDays();
    }

    /**
     * 获取时间间隔总天数
     *
     * @param beginTime
     * @param endTime
     * @return
     */
    public static Long getTotalDay(Date beginTime, Date endTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime startLocalDateTime = LocalDateTime.ofInstant(beginTime.toInstant(), zoneId);
        LocalDateTime endLocalDateTime = LocalDateTime.ofInstant(endTime.toInstant(), zoneId);
        Duration duration = Duration.between(startLocalDateTime, endLocalDateTime);
        return duration.toDays() + 1;
    }

    /** ============= 日期计算 end ==============================**/
}
