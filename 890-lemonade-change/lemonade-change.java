class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] copy=new int[3];
        for(int i=0;i<3;i++){
            copy[i]=0;
        }
        int net;
        for(int i=0;i<bills.length;i++){
            int j=2;
            net=bills[i];
            if(net==5){
                copy[0]++;
            }else if(net==10){
                copy[1]++;
                if(copy[0]==0){
                    return false;
                }else{
                    copy[0]--;
                }
            }else{
                copy[2]++;
                if(copy[0]==0 || (copy[1]==0 && copy[0]<3)){
                    return false;
                }else{
                    if(copy[1]>0){
                        copy[1]--;
                    }else{
                        copy[0]-=2;
                    }
                    copy[0]--;
                }
            }
            
          }
        return true;
    }
}