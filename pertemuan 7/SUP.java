class Base {
    Base(int i) {
        System.out.println("base constructor");
    }

    Base() {
        // Konstruktor tanpa argumen
    }
}

class Sup extends Base {
    public static void main(String[] argv) {
        Sup s = new Sup();
        // baris 1
    }

    Sup() {
        super(1); // Memanggil konstruktor Base dengan argumen int 1
        // baris 2
    }

    public void derived() {
        // baris 3
    }
}
