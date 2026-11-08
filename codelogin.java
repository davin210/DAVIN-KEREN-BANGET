import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner q= new Scanner(System.in);
        System.out.println("=== BUAT AKUN ===");
        System.out.print("Nama: ");
        String nama =q.nextLine();
        System.out.print("User:");
        String user=q.nextLine();
        System.out.print("Sandi:");
        String sandi=q.nextLine();
        String user1;
        String sandi1;
        
        do {
            System.out.println("=== LOGIN ===");
            System.out.print("User:");
            user1=q.nextLine();
            System.out.print("Sandi:");
            sandi1=q.nextLine();
        } while (!(user.equals(user1))||!(sandi.equals(sandi1)));
        System.out.println("Selamat datang "+nama);
        q.close();
    }
}
