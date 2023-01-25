package Giris;
import java.util.Scanner;
public class HesapMak2 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner inp=new Scanner(System.in);
        System.out.println("Toplama-1\nÇıkarma-2\nBölme-3\nÇarpma-4\nYapmak İstediğiniz İşlemin Numarasını Giriniz:");
        z=inp.nextInt();
        System.out.println("Birinci Değeri Giriniz:");
        x=inp.nextInt();
        System.out.println("İkinci Değeri Giriniz:");
        y=inp.nextInt();
        if(z==3 && y==0)
            System.out.println("0 ile bölme işlemi yapılamaz.");
        else{
        double t=(x+y),cik=(x-y),bol=(x/y),car=(x*y);
        switch (z){
            case(1):
                System.out.println("Sonuç:"+ t);
                break;
            case(2):
                System.out.println("Sonuç:"+ cik);
                break;
            case(3):
                if(y != 0){
                System.out.println("Sonuç:"+ bol);
                }
                break;
            case(4):
                System.out.println("Sonuç:"+ car);
                break;
            default:
                System.out.println("Yanlış Bir Değer Girdiniz,Tekrar Deneyiniz.");
                break;
        }


    }
    }
    }