package com.adc.tableau.tableauSever.util.enums;

public enum FieldTypeEnum {
    DATE(1, "DATE"),
    DOUBLE(2, "DOUBLE"),
    INTEGER(3, "INTEGER"),
    BOOLEAN(4, "BOOLEAN"),
    UNICODE_STRING(5, "UNICODE_STRING");

    FieldTypeEnum(int type, String paramDec) {
        this.type = type;
        this.paramDec = paramDec;
    }

    private int type;
    private String paramDec;

    public String getParamDec() {
        return paramDec;
    }

    public void setParamDec(String paramDec) {
        this.paramDec = paramDec;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public static FieldTypeEnum tansformInt(int i){

        switch (i){
            case 1:
                return DATE;
            case 2:
                return DOUBLE;
            case 3:
                return INTEGER;
            case 4:
                return BOOLEAN;
            case 5:
                return UNICODE_STRING;
        }
        return null;
    }
}
