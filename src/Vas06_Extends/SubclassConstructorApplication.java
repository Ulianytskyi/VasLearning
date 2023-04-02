package Vas06_Extends;

class Alpha {
    String name;
    int code;
    Alpha(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("Class Alpha:");
        System.out.println("Name - " + this.name);
        System.out.println("Code - " + this.code);
    }
    Alpha(String name) {
        this(name, 0);
    }
    Alpha(int code) {
        this("White", code);
    }
    Alpha() {
        this("Yellow", 1);
    }
}
class Bravo extends Alpha {
    char symbol;
    private void show(){
        System.out.println("Class Bravo:");
        System.out.println("Symbol - " + this.symbol);
        for (int i = 1; i <=18 ; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    Bravo(String name, int code, char symbol) {
        super(name, code);
        this.symbol =symbol;
        show();
    }
    Bravo(char symbol) {
        super();
        this.symbol = symbol;
        show();
    }
    Bravo(String name) {
        super(name);
        this.symbol = 'A';
        show();
    }
    Bravo (int code) {
        super(code);
        this.symbol = 'B';
        show();
    }
    Bravo() {
        this.symbol = 'C';
        show();
    }
    Bravo (String name, int code) {
        this(name, code, 'D');
    }
}
public class SubclassConstructorApplication {
    public static void main(String[] args) {
        Bravo obj;
        obj = new Bravo();
        obj = new Bravo("Red");
        obj = new Bravo(100);
        obj = new Bravo("Green", 200);
        obj = new Bravo('Y');
        obj = new Bravo("Blue", 300, 'W');
    }
}
