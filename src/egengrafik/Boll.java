package egengrafik;

public class Boll {

    private int x=100;
    private int y=100;
    private int vx=2;
    private int vy=2;
    private int direction=-1;

    public Boll(){
    }
    public void update(){
        x=x+vx;
        y=y+vy;
        if(x+50>500){
            vx=vx*direction;
        }
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}
