package com.ibbl.util;

import java.util.List;

/**
 * @author Khomeni
 * Created on : 16-May-17
 */
public class Utility {

    public static List<String> getMemberTypeList() {
        return Constants.INCIDENT_TYPE_LIST;
    }

    public static String getMemberType(Integer index) {
        try {
            return Constants.INCIDENT_TYPE_LIST.get(index);
        } catch (Exception e) {
            return "";
        }
    }
}
