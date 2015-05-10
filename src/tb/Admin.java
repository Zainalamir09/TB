package tb;
import java.util.Scanner;
public class Admin {
    public static void main(String[] args) {
        String ul;
        int brp;
        Inventaris[] ulang; 
        ulang = new Inventaris[1];
        Scanner in = new Scanner(System.in);
        Inventaris mulai = new Inventaris();
        for(int i=0; i<ulang.length;){
            mulai.data();
            mulai.kebersihan();
            mulai.lingkungan();
            mulai.kenyamanan();
            mulai.keamanan();
            System.out.println("edit data (ya / tidak) : ");
            ul = in.next();
            if(ul.equalsIgnoreCase("ya")){
                i=i;
            }
            else{
                i++;
                System.out.println("SELESAI");
            }
        } 
        Analisis k= new Analisis();
        k.analisis_ac();
        k.analisis_bentuk();
        k.analisis_cahaya();
        k.analisis_cctv();
        k.analisis_internet();
        k.analisis_jendela();
        k.analisis_kabel_lcd();
        k.analisis_kelembapan();
        k.analisis_kipas();
        k.analisis_lampu();
        k.analisis_pintu();
        k.analisis_rasio();
        k.analisis_steker();
        k.analisis_suhu();
       
        
    }
