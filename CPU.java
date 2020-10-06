public class CPU {
    private int speed;
    private float type;
    private int fre;
    CPU(int speed,float type){
        setSpeed(speed);
        setType(type);
    }
    CPU(){
        setFre(fre);
    }

    public float getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = speed;
    }

    public int getFre() {
        return fre;
    }

    public void setFre(int fre) {
        this.fre = fre;
    }


    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 5000) {
            this.speed = speed;
        }else{
            System.out.println("输入错误");
        }
    }
    public void setType(float type) {
        if (type >= 0 && type <= 9) {
            this.type = type;
        }else{
            System.out.println("输入错误");
        }
    }
    public void setFlag(int fre) {
        if (fre >= 1 && fre <= 5) {
            this.fre = fre;
        }else{
            System.out.println("输入错误");
        }
    }

}






