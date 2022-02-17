/*
import java.awt.*;
import java.util.ArrayList;


public class MaximumTwinSumOfALinkedList {
    public static void main(String[] args){

    }

    public int pairSum(ListNode head) {
    int result = 0;
    int length = 0;
    // first lets find out the lenth of the singlylinkedList
        ListNode temp = head.next;
        while(temp != null){
            temp = temp.next;
            length++;
        }

        //lets find out the twins now
        //constrain
       ArrayList<Integer> arrayList = new ArrayList<Integer>();
       for(int i=0; i<length; i++){
           if(i <= length/2 -1){
               arrayList.add(i);
           }
       }

       //now lets us re-loop again
        ListNode temp2 = head.next;
        int coutIndex = 0;
        while(temp2 != null){
            int getTwinIndex = temp2.val();
            for (int i=0; i<arrayList.size(); i++){
                if (coutIndex == get)
            }
        }


        return  result;
    }

}
*/
