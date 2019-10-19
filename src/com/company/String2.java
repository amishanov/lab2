package com.company;

public class String2 {
    StringBuffer str;
    String2(){
        str=new StringBuffer("Стандартное предложение.");
    }
    String2(StringBuffer userString){
        str=userString;
    }
    String2(String userString){
        str=new StringBuffer(userString);
    }
    public void AppendEnd(){
    int min=0, count=0,indexOfMin=-1;
        for (int i=0; i<str.length();i++){
            if (str.charAt(i)=='.' || str.charAt(i)=='?' || str.charAt(i)=='!'){
                if (min==0){
                    min=count;
                    indexOfMin=i;
                }
                if (min>count){
                    min=count;
                    indexOfMin=i;
                }
                count=0;
            }
            count++;
        }
      str.insert(indexOfMin," КОНЕЦ");
    }
    public void InsertPlus(){
        int counter=0;
        for (int i=0; i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){
                while (Character.isDigit(str.charAt(i)) && i<str.length()-1){
                    counter++;
                    i++;
                }
                if (counter==2 && i!=str.length()-1){
                    String pluses="";
                    int number=Integer.parseInt(str.substring(i-2,i));
                    for (int j=0;j<number;j++)
                        pluses=pluses+"+";
                    str.replace(i-2,i,pluses);
                }
                counter=0;
            }
        }
        if (Character.isDigit(str.charAt(str.length()-1)) && Character.isDigit(str.charAt(str.length()-2))&& !Character.isDigit(str.charAt(str.length()-3))){
            String pluses="";
            int number=Integer.parseInt(str.substring(str.length()-2,str.length()));
            for (int j=0;j<number;j++)
                pluses=pluses+"+";
            str.replace(str.length()-2,str.length(),pluses);
        }
    }
    public void ReversNumber(){
        int counter=0;
        for (int i=0; i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){
                while (Character.isDigit(str.charAt(i)) && i<str.length()-1){
                    counter++;
                    i++;
                }
                if (counter==3 && i!=str.length()-1){
                    StringBuffer number=new StringBuffer(str.substring(i-3,i)).reverse();
                    str.replace(i-3,i,number.toString());
                }
                counter=0;
            }
        }
        if (Character.isDigit(str.charAt(str.length()-1)) && Character.isDigit(str.charAt(str.length()-2))&& Character.isDigit(str.charAt(str.length()-3))&& !Character.isDigit(str.charAt(str.length()-4))){
            StringBuffer number=new StringBuffer(str.substring(str.length()-3,str.length())).reverse();
            str.replace(str.length()-3,str.length(),number.toString());
        }
    }
    public String out(){
        return str.toString();
    }
}
