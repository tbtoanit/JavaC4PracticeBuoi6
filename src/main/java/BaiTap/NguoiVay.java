package BaiTap;

import javax.swing.text.NumberFormatter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;

public class NguoiVay {
    String id;
    double soTienVay;
    Date ngayVay;
    float laiSuat;

    public NguoiVay input(){
        NguoiVay nv = new NguoiVay();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap vao id: ");
        nv.id = sc.nextLine();
        System.out.println("Vui long nhap vao so tien vay: ");
        nv.soTienVay = sc.nextDouble();
        sc.nextLine();
        System.out.println("Vui long nhap ngay vay tien theo dinh dang yyyy-MM-dd: ");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            nv.ngayVay = sdf.parse(sc.nextLine());
        } catch (Exception e){
            e.printStackTrace();
        }
        double soNgay = (new Date().getTime() - nv.ngayVay.getTime())/(1000*60*60*24*1);
        NumberFormat nf = new DecimalFormat("#0.00");
        nv.laiSuat = Float.parseFloat(nf.format((soNgay*nv.soTienVay * 0.17)));
        return nv;
    }

    public static void main(String[] args) {
        NguoiVay n = new NguoiVay();
        NguoiVay[] listNguoiVay = new NguoiVay[1];

        for (int i= 0; i<listNguoiVay.length; i++){
            listNguoiVay[i] = n.input();
        }

        for (NguoiVay n1: listNguoiVay){
            System.out.printf("%s - %f - %s - %f", n1.id, n1.soTienVay, n1.ngayVay, n1.laiSuat);
        }
    }

}
