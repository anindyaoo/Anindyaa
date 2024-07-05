interface Scanner {
    void scanImage();
}

interface Copier {
    void copyImage();

}

class Printer implements Scanner, Copier {
    @Override
    public void scanImage() {
        System.out.println("Scanning image...");
    }

    @Override
    public void copyImage() {
        System.out.println("Copy image...");
    }

    public void printImage() {
        System.out.println("Print image...");
    
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.scanImage();
        printer.copyImage();
        printer.printImage();
    }
}