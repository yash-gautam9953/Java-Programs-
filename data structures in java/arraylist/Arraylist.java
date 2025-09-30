import java.util.*;

public class Arraylist {

    public static boolean pairSum2(ArrayList<Integer> list,int tgt){
        int maxValueIdx = -1;
        for(int i= 0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                maxValueIdx = i;
                break;
            }
        }
        int lp = maxValueIdx+1;
        int rp = maxValueIdx;

        while(lp != rp){
            if(list.get(lp) + list.get(rp) == tgt){
                return true;
            }

            if(list.get(lp) + list.get(rp) < tgt){
                lp = (lp + 1) % list.size();
            }else{
                rp = (list.size() + rp - 1)% list.size();
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int tgt = 16;

        System.out.println(pairSum2(list, tgt));

        

    }

}
