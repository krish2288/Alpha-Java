public class TrappingRainWater {
    public static int Rain_water(int height[]) {
        //calculate left max boundary -array
        int Leftmax[]=new int[height.length];
        Leftmax[0]=height[0];
        for(int i=1;i< height.length;i++){
            Leftmax[i]=Math.max(height[i], Leftmax[i-1] );
        }
        //calculate rigiht max boundary- array
        int Rightmax[]=new int[height.length];
        Rightmax[height.length-1]=height[height.length-1];
        for(int i= height.length-2;i>=0;i--){
            Rightmax[i]=Math.max(height[i],Rightmax[i+1] );
        }
        int TrappedWater=0;
        //loop
        for(int i=0;i< height.length;i++) {
            //waterlevel = min(leftmax bound,rightmax bound)
            int WaterLevel =Math.min(Leftmax[i],Rightmax[i] );
            //trapped water = waterlevel-height
            TrappedWater+=WaterLevel-height[i];
        }
       // System.out.println(TrappedWater);
        return TrappedWater;



    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
       System.out.println(Rain_water(height));
       // Rain_water(height);
    }
}
