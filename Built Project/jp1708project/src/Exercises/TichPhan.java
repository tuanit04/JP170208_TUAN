package Exercises;

import java.util.Scanner;
/**
 * <p>Title: JP1708 Project</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * <p>Company: </p>
 *
 * @author Quang
 * @version 1.0
 */
public class TichPhan {
    /**
     * Phuong thuc tinh tich phan
     * @param a float
     * @param b float
     * @param n float
     * @return float
     */
    public static float getTichPhan(float a, float b, float n) {
        float S=0;
        float h=(float)(b-a)/n;
        for(int i=0;i<n;i++){
            S+=(a+i*h);
            S*=h;
        }
       return S;
    }

    public static void main(String[] args) {
        //Phuong thuc nhap
       Scanner m=new Scanner(System.in);
       float a,b,n;

       System.out.print("\nNhap vao can a: ");
       a=m.nextFloat();
       System.out.print("\nNhap vao can b: ");
       b=m.nextFloat();
       System.out.print("Nhap vao n: ");
       n=m.nextFloat();

       //In ra man hinh
       System.out.print("Ket qua: "+TichPhan.getTichPhan(a,b,n));


    }
}
