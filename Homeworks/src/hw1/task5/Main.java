package hw1.task5;
/*
Во фразе "Добро пожаловать на курс по Java" переставить слова
в обратном порядке.
 */
public class Main {
    public static void main(String[] args) {
String s = "Добро пожаловать на курс по Java";
String[] splitStr = s.split(" ");
StringBuilder newStr = new StringBuilder();
        for (int i = splitStr.length-1; i >=0; i--) {
            if(i==0){
                newStr.append(splitStr[i]);
            }
            else{
                newStr.append(splitStr[i]+" ");
            }
        }
        System.out.println(newStr);
    }
}
