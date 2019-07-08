package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayElement {
    public List<String> replaceElement(String input,int arrindex)
    {
        List<String> elements = new ArrayList<>();
        elements.add("Apple");
        elements.add("Grape");
        elements.add("Melon");
        elements.add("Berry");

        if((arrindex>=0)&&(arrindex<elements.size())){
            elements.set(arrindex,input);
            elements.removeAll(elements);
            return elements;
        }
        else{
            return null;
        }
    }
}
