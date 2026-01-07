package quocanh ;

import java.util.Scanner;
import java.time.LocalDate;

public class BaiTap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hoVaTen;
        String studentID;
        String hometown;
        float gpa;
        String major;
        boolean scholarship;
        LocalDate dayOfBirth;

        System.out.print("Nhap ho va ten: ");
        hoVaTen = sc.nextLine();

        System.out.print("Nhap ma sinh vien: ");
        studentID = sc.nextLine();

        System.out.print("Nhap que quan: ");
        hometown = sc.nextLine();

        System.out.print("Nhap ngay sinh (YYYY-MM-DD): ");
        dayOfBirth = LocalDate.parse(sc.nextLine());

        System.out.print("Nhap GPA: ");
        gpa = sc.nextFloat();
        sc.nextLine();

        System.out.print("Nhap chuyen nganh: ");
        major = sc.nextLine();

        System.out.print("Co hoc bong khong? (true/false): ");
        scholarship = sc.nextBoolean();

        System.out.println("\n--- THONG TIN SINH VIEN ---");
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("Ma sinh vien: " + studentID);
        System.out.println("Que quan: " + hometown);
        System.out.println("Ngay sinh: " + dayOfBirth);
        System.out.println("GPA: " + gpa);
        System.out.println("Chuyen nganh: " + major);
        System.out.println("Hoc bong: " + scholarship);

        sc.close();
    }
}
