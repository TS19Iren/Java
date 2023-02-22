package seminar4.task4;

import java.util.Arrays;

public class MyStack {
   private int[] arr = new int[10];
    private int length = 0;

 int size(){
     return length;
 }

 boolean empty(){
     if(length==0){
         return true;
     }
     else{
         return false;
     }
 }
 void push(int item){
     if(length>=arr.length){
         int[] arr1 = new int[arr.length+10];
         System.arraycopy(arr,0,arr1,0,arr.length);
         arr = arr1;
     }
     arr[length++] = item;
 }

 Integer peek(){
     if(!empty()) {
         return arr[length - 1];
     }
 return null;
 }

 Integer pop(){
     if(!empty()){
         return arr[--length];
     }
     return null;
 }
}
