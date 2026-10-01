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
    public Vector3d whatbiger(Vector3d other){
        if (x > other.x && y > other.y && z > other.z) {
            return Vector3d;
        }
        else return Vector3d.other;
    }



}
void main() {
    Scanner in = new Scanner(System.in);

    Vector3d A = new Vector3d(5, 6, 7);
    Vector3d B = new Vector3d(5, 6, 3);
    System.out.println(A.lenVector());
    System.out.println(B.lenVector());

}
