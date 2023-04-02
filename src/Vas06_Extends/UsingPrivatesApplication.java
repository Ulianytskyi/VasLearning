package Vas06_Extends;

class Alpha2 {
    private int code;
    public void set(int code) {
        this.code = code;
    }
    public void show() {
        System.out.println("Code: " + code);
    }
    Alpha2(int code) {
        set(code);
    }
}
class Bravo2 extends Alpha2 {
    Bravo2(int code) {
        super(code);
    }
}
public class UsingPrivatesApplication {
    public static void main(String[] args) {
        Bravo2 obj = new Bravo2(100);
        obj.show();
        obj.set(200);
        obj.show();
    }
}
