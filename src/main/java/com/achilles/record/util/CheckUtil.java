package com.achilles.record.util;

public class CheckUtil {

    public static boolean isMobile (String traceId) {
        if (traceId == null || "".equals(traceId)) {
            throw new IllegalArgumentException();
        }
        if (traceId.startsWith("fm") || traceId.startsWith("mm")) {
            return true;
        }
        return false;
    }

    public static boolean isPc (String traceId) {
        if (traceId == null || "".equals(traceId)) {
            throw new IllegalArgumentException();
        }
        if (traceId.startsWith("pp") || traceId.startsWith("fp")) {
            return true;
        }
        return false;
    }
}
