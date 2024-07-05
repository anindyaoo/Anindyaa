import java.util.Scanner;
class IdentitasDosen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan identitas dosen 1: ");
        String nama1 = scanner.nextLine();

        System.out.print("Masukkan identitas dosen 2: ");
        String identitas2 = scanner.nextLine();
        String[] dataDosen2 = identitas2.split(", ");
        String nama2 = dataDosen2[0];
        String nip2 = dataDosen2[1];

        System.out.print("Masukkan identitas dosen 3: ");
        String identitas3 = scanner.nextLine();
        String[] dataDosen3Split = identitas3.split(", ");
        String nama3 = dataDosen3Split[0];
        String nip3 = dataDosen3Split[1];
        String umurStr = dataDosen3Split[2].substring(5);
        int umur3 = Integer.parseInt(umurStr);

        System.out.println("\nBerikut adalah identitas para dosen:");

        System.out.println("\nNama: " + nama1);
        System.out.println("NIP: ");
        System.out.println("Umur: ");

        System.out.println("\nNama: " + nama2);
        System.out.println("NIP: " + nip2);

        System.out.println("\nNama: " + nama3);
        System.out.println("NIP: " + nip3);
        System.out.println("Umur: " + umur3);
    }
}

