package com.zeyinpro.constant;

/**
 * 学科
 */
public enum SubjectEnum {
    MATH(1,"math"),
    ENGLISH(2,"english"),
    ;


    SubjectEnum(int code,String desc){
        this.code=code;
        this.desc=desc;
    }

    private int code;
    private String desc;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static SubjectEnum parse(int code){
        for (SubjectEnum subjectEnum:values()){
            if (subjectEnum.code==code){
                return subjectEnum;
            }
        }
        return null;
    }

}
