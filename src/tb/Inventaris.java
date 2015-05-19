
package tb;
import java.util.Scanner;
public class Inventaris extends ruang implements implem {
    Scanner ruang = new Scanner(System.in);
    Input in = new Input();
@Override
    public void n_ruang(){
        System.out.println("masukan ruang : ");
        in.setRuang(ruang.next());
        System.out.println("masukan lokasi ruang: ");
        in.setLokasi_ruang(ruang.next());
        System.out.println("fakultas/prodi :");
        in.setProdi(ruang.next());
        }
    @Override
   public void u_ruang(){
        System.out.println("masukan panjang: ");
        in.setP_ruang(ruang.nextInt());
        System.out.println("masukan lebar ; ");
        in.setL_ruang(ruang.nextInt());
   }
   
    public void kebersihan(){
        System.out.println("kondisi lantai : ");
        in.setKon_lantai(ruang.next());
        System.out.println("kondisi dinding : ");
        in.setKon_dinding(ruang.next());
        System.out.println("kondisi atap : ");
        in.setKon_atap(ruang.next());
        System.out.println("kondisi pintu : ");
        in.setKon_pintu(ruang.next());
        System.out.println("kondisi jendela : ");
        in.setKon_jendela(ruang.next());
    }
    public void lingkungan(){
        System.out.println("sirkulasi udara : ");
        in.setSir_udara(ruang.next());
        System.out.println("pencahayaan : ");
        in.setPencahayaan(ruang.nextInt());
        System.out.println("kelembapan : ");
        in.setKelembapan(ruang.nextDouble());
        System.out.println("suhu : ");
        in.setSuhu(ruang.nextDouble());
    }
    public void kenyamanan(){
        System.out.println("kebisingan : ");
        in.setKebisingan(ruang.next());
        System.out.println("bau : ");
        in.setBau(ruang.next());
        System.out.println("kebocoran : ");
        in.setKebocoran(ruang.next());
        System.out.println("kerusakan : ");
        in.setKerusakan(ruang.next());
        System.out.println("keausan : ");
        in.setKeausan(ruang.next());
    }
    public void keamanan(){
        System.out.println("kekokohan : ");
        in.setKekokohan(ruang.next());
        System.out.println("kunci pintu : ");
        in.setKunci_pintu(ruang.next());
        System.out.println("kunci jendela : ");
        in.setKunci_jendela(ruang.next());
        System.out.println("keamanan : ");
        in.setKeamanan(ruang.next());
    }
    
    }
   
