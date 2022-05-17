package com.example.tabiinw;

public class Item {
    private String textArabLang;
    private String textRuLang;
    private int number;

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public String getTextArabLang() {
        return textArabLang;
    }

    public void setTextArabLang(String textArabLang) {
        this.textArabLang = textArabLang;
    }

    public String getTextRuLang() {
        return textRuLang;
    }

    public void setTextRuLang(String textRuLang) {
        this.textRuLang = textRuLang;
    }

    @Override
    public String toString(){
       return "Arab: "+getTextArabLang() + "\nRussian: "+getTextRuLang();
    }

    public Item(String textArabLang, String textRuLang, int number) {
        this.textArabLang = textArabLang;
        this.textRuLang = textRuLang;
        this.number = number;
    }




}
