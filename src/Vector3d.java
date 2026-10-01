import static java.lang.System.in;

public class Vector3d{
    private int x, y, z;

    public Vector3d(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public int getZ(){return z;}

    public Vector3d add(Vector3d other){
        return new Vector3d(x + other.x, y + other.y, z + other.z);
    }
    public Vector3d sub(Vector3d other){
        return new Vector3d(x - other.x, y - other.y, z - other.z);
    }
    public double scalardob(Vector3d other){
        return (x * other.x + y * other.y + z * other.z);
    }
    public Vector3d multiple(int k){
        return new Vector3d(x * k, y * k, z * k);
    }
    public double lenVector(){
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }
    public boolean equal(Vector3d other){
        if (this == other){
            return true;
        }
        else return false;
    }
    public String whatlonger(Vector3d other){
        double diff = this.lenVector() - other.lenVector();
        if (diff == 0){
            return "a == b";
        } else if (diff < 0) {
            return "a < b";
        }
        else return "a > b";
    }
    @Override
    public String toString() {
        return "(" + x + "; " + y + "; " + z + ")";
    }

}


