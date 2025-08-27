package com.achilles.record.util;

public class CheckUtil {

    public static boolean isMobile (String traceId) {
        if (traceId == null || "".equals(traceId)) {
            return true;
        }
        if (traceId.startsWith("fm") || traceId.startsWith("m")) {
            return true;
        }
        return false;
    }
}
