package com.lzf.tfirst.junit.runWitch;

public class MessageUtil {
    private String msg = "";
    public  MessageUtil(String str){
        this.msg = str;
    }

    public String printMessage() {
        return this.msg;
    }

    public String salutationMessage() {
        return "Hi!"+this.msg;
    }
}
