package com.company;
import java.util.HashMap;


public class String1 {
     String str;
    HashMap<String,Integer> MyMap;
     String1(){
         str="";
         MyMap = new HashMap<String,Integer>();
     }
     String1(String s){
         str=s;
         MyMap = new HashMap<String,Integer>();
     }
     public void toLCase(){
         str=str.toLowerCase();
     }

     public String[] SplitReg(){
        String[] words = str.split(" ");
        return words;
    }
    public int PrefCounter(String prefix){
         int count=0;
         String[] words= str.split(" ");

         for (int i=0;i<words.length;i++){
             if (words[i].startsWith(prefix))
                count++;
         }
         return count;
    }
    public void WordCounter(){
         String[] wordArray=this.SplitReg();
         for (int i=0;i<wordArray.length;i++){
             if(MyMap.containsKey(wordArray[i])){
                MyMap.put(wordArray[i],MyMap.get(wordArray[i])+1);
             }
             else
                 MyMap.put(wordArray[i],1);
         }
        System.out.println(MyMap.toString());//Упорно делаем вид, что метод возвращает словарь, а словарь потом выводится в main
    }
    public String out(){
         return (str);
    }
}
