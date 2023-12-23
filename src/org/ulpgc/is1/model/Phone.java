package org.ulpgc.is1.model;

import java.util.regex.Pattern;

public class Phone {
    private String number;

    public Phone(String number) {
        if (this.isValid(number)) {
            this.number = number;
        } else {
            this.number =  "XXXX";
        }
    }

    public String getNumber() {
        return this.number;
    }

    public boolean isValid(String number) {
        String patron = "^(\\+\\d{1,2})?[-.\\s]?\\(?\\d{1,4}\\)?[-.\\s]?\\d{1,9}$";

        if (number.length() != 9){
            return false;
        }else
            return number != null && number.matches(patron);

    }
}
