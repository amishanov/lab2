package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String3 {
    String regAmerDate;
    String regRusDate;
    String3(){
        regAmerDate="([0][1-9]|[1][0-2])(\\.|-)([0][1-9]|[12][0-9]|[3][01])(\\.|-)[0-2][0-9][0-9][0-9]";
        regRusDate="([0][1-9]|[12][0-9]|[3][01])(\\.|-)([0][1-9]|[1][0-2])(\\.|-)[0-2][0-9][0-9][0-9]";
    }
    public String Check(String str){
        String res="";
        if (Pattern.matches(regAmerDate,str))
            res="Соответствует Американскому формату\n";
        if (Pattern.matches(regRusDate,str))
            res+="Соответствует Российскому формату";
        if (res=="")
            return "Не соответствует ни одному из форматов";
        return res;
    }
    public String ReplaceAmer(String s){
        StringBuffer str= new StringBuffer(s);
        Pattern pattern=Pattern.compile(regAmerDate);
        Matcher matcher=pattern.matcher(str);
        while (matcher.find()){
            int start=matcher.start();
            int end=matcher.end();
            StringBuffer tempStr= new StringBuffer(str.substring(start,end)); String t1=tempStr.substring(0,2), t2=tempStr.substring(3,5);
            tempStr.replace(0,2,t2); tempStr.replace(3,5,t1);
            str.replace(start,end,tempStr.toString());
        }
        return str.toString();
    }
}
