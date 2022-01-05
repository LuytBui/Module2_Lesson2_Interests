import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
        double yearlyRate = 11.0f/100;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        double deposits = sc.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        double months = sc.nextInt();

        double interest = deposits * yearlyRate / 12 * months;
        System.out.printf("Số tiền lãi: %.2f", interest);
    }
}
