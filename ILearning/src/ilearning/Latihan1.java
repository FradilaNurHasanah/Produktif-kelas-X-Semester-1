/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilearning;
public class Latihan1 {
   class Lingkaran{
       double r;
       Lingkaran(double r){
           this.r=r;
       }
       public double Luas(){
           return Math.PI*r*r;
       }
   }
   class Tabung extends Lingkaran{
       double t;
       Tabung(double r,double t){
           super(r);
           this.t=t;
       }
       public double Luas(){
           return (2*super.Luas()) + (Math.PI*r*t);
       }
   }
   class Kerucut extends Lingkaran{
       double t, s;
       Kerucut(double r, double t, double s){
           super(r);
           this.t=t;
           this.s=s;
       }
       public double Luas(){
           return super.Luas() + (Math.PI*r*s);
       }
   }
   class Main{
       public void TampilLuas(Lingkaran circle){
           if(circle instanceof Tabung)
               System.out.println("Luas Tabung :"+circle.Luas());
           else if(circle instanceof Kerucut)
               System.out.println("Luas Kerucut :"+circle.Luas());
           else if(circle instanceof Lingkaran)
               System.out.println("Luas Lingkaran :"+circle.Luas());
       }
       public static void main(String[] args){
           Lingkaran bunder = new Kerucut(10);
           TampilLuas(bunder);
           bunder = new Tabung(10);
           TampilLuas(bunder);
}


  



            

