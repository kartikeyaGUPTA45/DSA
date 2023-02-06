public static void reverse(List<Integer> lst,int si,int ei){
        
        while(si<ei){
            int temp=lst.get(si);
            lst.set(si,lst.get(ei));
            lst.set(ei,temp);
            si++;
            ei--;
        }
        
    }
    
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        int n=arr.size()-1;
        reverse(arr,0,n);
        reverse(arr,0,n-d);
        reverse(arr,n-d+1,n);
    
           return arr;
    }
