package tb;
import java.util.Scanner;

public abstract class ruang {
    Input in=new Input();
    Scanner j=new Scanner(System.in);
    public abstract void n_ruang();
    public abstract void u_ruang();
    public void data(){
         
        System.out.println("masukkan jumlah kursi : ");
        in.setJ_kursi(j.nextInt());
        System.out.println("masukkan jumlah pintu : ");
        in.setJ_pintu(j.nextInt());
        System.out.println("masukkan jumlah jendela : ");
        in.setJ_jendela(j.nextInt());
        System.out.println("masukkan jumlah stop kontak : ");
        in.setJ_steker(j.nextInt());
        System.out.println("kondisi stop kontak : ");
        in.setKon_steker(j.next());
        System.out.println("posisi stop kontak : ");
        in.setPos_steker(j.next());
        System.out.println("masukkan jumlah kabel LCD : ");
        in.setJ_kabel_lcd(j.nextInt());
        System.out.println("kondisi kabel LCD : ");
        in.setKon_kabel_lcd(j.next());
        System.out.println("posisi kable LCD : "); 
        in.setPos_kabel_lcd(j.next());
        System.out.println("masukkan jumlah lampu : ");
        in.setJ_lampu(j.nextInt());
        System.out.println("kondisi lampu : ");
        in.setKon_lampu(j.next());
        System.out.println("posisi lampu : ");
        in.setPos_lampu(j.next());
        System.out.println("masukkan jumlah kipas angin : ");
        in.setJ_kipas(j.nextInt());
        System.out.println("kondisi kipas angin : ");
        in.setKon_kipas(j.next());
        System.out.println("posisi kipas angin : ");
        in.setPos_kipas(j.next());
        System.out.println("masukkan jumlah AC : ");
        in.setJ_ac(j.nextInt());
        System.out.println("kondisi AC : ");
        in.setKon_ac(j.next());
        System.out.println("posisi AC : ");
        in.setPos_ac(j.next());
        System.out.println("masukkan SSID : ");
        in.setSsid(j.next());
        System.out.println("masukkan bandwidth : ");
        in.setBandwidth(j.next());
        System.out.println("masukkan jumlah CCTV : ");
        in.setJ_cctv(j.nextInt());
        System.out.println("kondisi CCTV : ");
        in.setKon_cctv(j.next());
        System.out.println("posisi CCTV : ");
        in.setPos_cctv(j.next());
    }
}
