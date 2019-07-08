package com.stackroute.pe5;

import java.util.Map;

public class ModifyValuesInMap {
    public Map<String, String> replacevalue(Map<String, String> input) {

        if(input.size()==2) {
            String val = null;
            String key = null;
            for (Map.Entry<String, String> x : input.entrySet()) {
                key = x.getKey();
                val = x.getValue();
                break;
            }
            if(!val.isEmpty()) {
                for (Map.Entry<String, String> x : input.entrySet()) {
                    if (x.getKey().equals(key))
                        x.setValue(" ");
                    else
                        x.setValue(val);

                }
                return input;
            }else return null;
        }
        return null;

    }
}
