public class Max {
    public int max3(int x, int y, int z)throws IllegalArgumentException{
        if(x<0||x>200||y<0||y>200||z<0||z>200)throw new IllegalArgumentException();
        int answer = x;
        if(y>answer)answer = y;
        if(z>answer)answer = z;
        return answer;
    }
}
