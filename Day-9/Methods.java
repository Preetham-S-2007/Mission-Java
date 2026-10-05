public class Methods{
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        // Methods obj = new Methods();
        int a=5;
        int b=4;
        // int c = obj.logic(a,b);
        int c = logic(a,b);
        System.out.println(c);
    }
}