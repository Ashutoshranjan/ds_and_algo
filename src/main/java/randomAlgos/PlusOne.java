package randomAlgos;

/**
 * Created by sssau on 05-04-2020.
 */
public class PlusOne {
    /*Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
    */

    public int[] plusOne(int[] digits) {
        //[1,2,9] [9]   [9,9]    [9,8]  [9,8,8,9] [8,9,9,9]
        //[1,3,0] [1,0] [1,0,0]  [9,9]  [9,8,9,0] [9,0,0,0]
        int[] d;
        int count=0;
        if(digits[0]==9){

            for(int i=0; i<digits.length;i++){
                if(digits[i]==9)
                    count++;
            }
        }

        if(count==digits.length){
            d= new int[count+1];
            d[0]=1;
            return d;
        }
        d= new int[digits.length+1];

        if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
        }
        else{
            int tmpVal,carry=0;;
            int index=digits.length-1;
            while(digits[index]==9){
                digits[index]=0;
                carry=1;
                index--;
            }

            if(carry==1){digits[index]+=1;}
        }

        return digits;
    }
}
