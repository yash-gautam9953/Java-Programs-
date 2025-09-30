public class recursion {

    public static int factorial(int n){
        if(n<=1){
           return 1;
        }
        return n*factorial(n-1);
    }

    public static int firstNumSum(int n){
        if(n==1){
            return 1;
        }
        return n+firstNumSum(n-1);
    }

    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);

    }

    public static void removeDuplicateString(String str,int idx,StringBuilder newStr,boolean map[]){
     
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            removeDuplicateString(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicateString(str, idx+1, newStr.append(currChar), map);
        }

    }


    public static void main(String[] args) {
      
        removeDuplicateString("yashuu", 0, new StringBuilder(""), new boolean[26]);
    }
}
