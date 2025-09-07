package com.malli;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CtpVersionDetails {
    private final CtpVersionMap ctpVersionMap;

    public CtpVersionDetails(CtpVersionMap ctpVersionMap) {
        this.ctpVersionMap = ctpVersionMap;
    }

    public String getCtpVersion(String partNumber) {
        Map<String, Pattern> version = ctpVersionMap.version();

        for (Map.Entry<String, Pattern> entry : version.entrySet()) {
            Matcher matcher = entry.getValue().matcher(partNumber);
            if(matcher.find()) {
                return entry.getKey();
            }
        }
        return null;
    }
}
