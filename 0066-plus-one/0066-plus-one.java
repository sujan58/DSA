class Solution {
    public int[] plusOne(int[] digits) {
        int num=0;
        boolean carry=false;
        int place=1;
        // for(int i=digits.length-1;i>=0;i--){
        //     if(carry){
        //         digits[i]+=1;
        //         carry=false;
        //     }
        //     if(digits[i]+1>9){
        //         num+=10*(place++)+0;
        //     }
        // }
        //ArrayList<Integer> arr = new ArrayList<>();
        digits[digits.length-1]+=1;
        for(int i=digits.length-1;i>=0;i--){
            if(carry){
                digits[i]+=1;
                carry=false;
            }
            if(digits[i]>9){
                digits[i]=0;
                carry=true;
            }
        }
        System.out.print(carry);
        if(carry){
            int[] arr = new int [digits.length+1];
            arr[0]=1;
            for(int i=1;i<=digits.length;i++){
                arr[i]=digits[i-1];
            }
            return arr;
        }
        return digits;
        
    }
}