import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MaxTest {
    boolean inRange(int x,int y, int z){
        if(x<0||x>200||y<0||y>200||z<0||z>200){
            return false;
        }return true;
    }
    @Test
    public void add(){
        Max mx = new Max();
        int[] arr = new int[]{-1,0,2,6,200,201};
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                for(int k = 0;k<arr.length;k++){
                    int a = arr[i],b=arr[j],c = arr[k];
                    if(inRange(a,b,c)){
                        assertEquals(Math.max(Math.max(a,b),c),mx.max3(a,b,c));
                    }else{

                        ExpectedException thrown= ExpectedException.none();
                        thrown.expect(IllegalArgumentException.class);
                    }
                }
            }
        }
    }
}