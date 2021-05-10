package Camells;

import acm.graphics.*;
import acm.program.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;


public class Camells extends GraphicsProgram {
    /**
     * @param camells
     * Es la classe principal on esta tot el joc
     */

    public String[] noms_separats;
    public static void main(String[] args) {
        new Camells().start(args);

    }
        public final void run() {
        int nivell=0;

        String noms="";
        int numero_jugadors=0;
        String num1="";
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        setSize(900,500);
        GImage fons = new GImage(".\\src\\Camells\\fons.jpg");
        fons.setSize(900,450);
        add(fons,0,5);

            String nivells="";
            nivells = JOptionPane.showInputDialog("Quin nivell voleu jugar ");
            nivell = Integer.parseInt(nivells);

            while ((numero_jugadors==0)) {
                num1 = JOptionPane.showInputDialog("Quants jugadors jugaran maxim numero 7");
                numero_jugadors = Integer.parseInt(num1);
                if (numero_jugadors<=0|numero_jugadors>7){
                    JOptionPane.showMessageDialog(null,"El numero de jugadors ha de ser mes gran de 0 i mes petit o igual a 7");
                }

                for (int i=0;i<numero_jugadors;i++) {
                    noms +=JOptionPane.showInputDialog("Digam el nom del jugador "+(i+1)) + ":";
                }
            }
            String[]noms_separats= noms.split(":");

            if (nivell==1){

            GImage camell_rapid_0 = new GImage(".\\src\\Camells\\camells_rapids.png");
            GImage camell_rapid_1 = new GImage(".\\src\\Camells\\camells_rapids.png");
            GImage camell_rapid_2 = new GImage(".\\src\\Camells\\camells_rapids.png");
            GImage camell_rapid_3 = new GImage(".\\src\\Camells\\camells_rapids.png");
            GImage camell_rapid_4 = new GImage(".\\src\\Camells\\camells_rapids.png");
            GImage camell_rapid_5 = new GImage(".\\src\\Camells\\camells_rapids.png");
            GImage camell_rapid_6 = new GImage(".\\src\\Camells\\camells_rapids.png");

            boolean[] start = new boolean[7];
            int[] pixels=new int[7];
            int contador=0;
            int avansar =0;
            for (int i=0;i<7;i++){
                pixels[i]=20;
            }

        if (noms_separats.length==1){
            camell_rapid_0.setSize(150,150);
            add(camell_rapid_0,20,-40);

          }
        if (noms_separats.length==2){
                camell_rapid_0.setSize(150,150);
                add(camell_rapid_0,20,-40);

                camell_rapid_1.setSize(150,150);
                add(camell_rapid_1,20,30);

          }
        if (noms_separats.length==3){
            camell_rapid_0.setSize(150,150);
            add(camell_rapid_0,20,-40);

            camell_rapid_1.setSize(150,150);
            add(camell_rapid_1,20,30);

            camell_rapid_2.setSize(150,150);
            add(camell_rapid_2,20,80);

        }
        if (noms_separats.length==4){
            camell_rapid_0.setSize(150,150);
            add(camell_rapid_0,20,-40);

            camell_rapid_1.setSize(150,150);
            add(camell_rapid_1,20,30);

            camell_rapid_2.setSize(150,150);
            add(camell_rapid_2,20,80);

            camell_rapid_3.setSize(150,150);
            add(camell_rapid_3,20,135);
}
        if (noms_separats.length==5){
            camell_rapid_0.setSize(150,150);
            add(camell_rapid_0,20,-40);

            camell_rapid_1.setSize(150,150);
            add(camell_rapid_1,20,30);

            camell_rapid_2.setSize(150,150);
            add(camell_rapid_2,20,80);

            camell_rapid_3.setSize(150,150);
            add(camell_rapid_3,20,135);

            camell_rapid_4.setSize(150,150);
            add(camell_rapid_4,20,200);
}
        if (noms_separats.length==6){
            camell_rapid_0.setSize(150,150);
            add(camell_rapid_0,20,-40);

            camell_rapid_1.setSize(150,150);
            add(camell_rapid_1,20,30);

            camell_rapid_2.setSize(150,150);
            add(camell_rapid_2,20,80);

            camell_rapid_3.setSize(150,150);
            add(camell_rapid_3,20,135);

            camell_rapid_4.setSize(150,150);
            add(camell_rapid_4,20,200);

            camell_rapid_5.setSize(150,150);
            add(camell_rapid_5,20,250);
        }
        if (noms_separats.length==7){
            camell_rapid_0.setSize(150,150);
            add(camell_rapid_0,20,-40);

            camell_rapid_1.setSize(150,150);
            add(camell_rapid_1,20,30);

            camell_rapid_2.setSize(150,150);
            add(camell_rapid_2,20,80);

            camell_rapid_3.setSize(150,150);
            add(camell_rapid_3,20,135);

            camell_rapid_4.setSize(150,150);
            add(camell_rapid_4,20,200);

            camell_rapid_5.setSize(150,150);
            add(camell_rapid_5,20,250);

            camell_rapid_6.setSize(150,150);
            add(camell_rapid_6,20,310);

        }

            while(pixels[contador]<750) {
                for (int i = 0; i < 7; i++) {
                    start[i] = random.nextBoolean();
                }
                if (noms_separats.length==1){
                    if (start[0]){
                        avansar =random.nextInt(15)+1;
                        pixels[0]= avansar +pixels[0];
                        pause(10);
                        add(camell_rapid_0,pixels[0],-40);
                    }
                }
                if (noms_separats.length==2){
                    if (start[0]){
                        avansar =random.nextInt(15)+1;
                        pixels[0]= avansar +pixels[0];
                        pause(10);
                        add(camell_rapid_0,pixels[0],-40);
                    }
                    if (start[1]){
                        avansar =random.nextInt(15)+1;
                        pixels[1]= avansar +pixels[1];
                        pause(10);
                        add(camell_rapid_1,pixels[1],30);
                    }
                }
                if (noms_separats.length==3){
                    if (start[0]){
                        avansar =random.nextInt(15)+1;
                        pixels[0]= avansar +pixels[0];
                        pause(10);
                        add(camell_rapid_0,pixels[0],-40);
                    }
                    if (start[1]){
                        avansar =random.nextInt(15)+1;
                        pixels[1]= avansar +pixels[1];
                        pause(10);
                        add(camell_rapid_1,pixels[1],30);
                    }
                    if (start[2]){
                        avansar =random.nextInt(15)+1;
                        pixels[2]= avansar +pixels[2];
                        pause(10);
                        add(camell_rapid_2,pixels[2],80);
                    }
                }
                if (noms_separats.length==4){
                    if (start[0]){
                        avansar =random.nextInt(15)+1;
                        pixels[0]= avansar +pixels[0];
                        pause(10);
                        add(camell_rapid_0,pixels[0],-40);
                    }
                    if (start[1]){
                        avansar =random.nextInt(15)+1;
                        pixels[1]= avansar +pixels[1];
                        pause(10);
                        add(camell_rapid_1,pixels[1],30);
                    }
                    if (start[2]){
                        avansar =random.nextInt(15)+1;
                        pixels[2]= avansar +pixels[2];
                        pause(10);
                        add(camell_rapid_2,pixels[2],80);
                    }
                    if (start[3]) {
                        avansar = random.nextInt(15) + 1;
                        pixels[3] = avansar + pixels[3];
                        pause(10);
                        add(camell_rapid_3, pixels[3], 135);
                    }
                }
                if (noms_separats.length==5){
                    if (start[0]){
                        avansar =random.nextInt(15)+1;
                        pixels[0]= avansar +pixels[0];
                        pause(10);
                        add(camell_rapid_0,pixels[0],-40);
                    }
                    if (start[1]){
                        avansar =random.nextInt(15)+1;
                        pixels[1]= avansar +pixels[1];
                        pause(10);
                        add(camell_rapid_1,pixels[1],30);
                    }
                    if (start[2]){
                        avansar =random.nextInt(15)+1;
                        pixels[2]= avansar +pixels[2];
                        pause(10);
                        add(camell_rapid_2,pixels[2],80);
                    }
                    if (start[3]) {
                        avansar = random.nextInt(15) + 1;
                        pixels[3] = avansar + pixels[3];
                        pause(10);
                        add(camell_rapid_3, pixels[3], 135);
                    }
                    if (start[4]) {
                        avansar = random.nextInt(15) + 1;
                        pixels[4] = avansar + pixels[4];
                        pause(10);
                        add(camell_rapid_4, pixels[4], 200);
                    }
                }
                if (noms_separats.length==6){
                    if (start[0]){
                        avansar =random.nextInt(15)+1;
                        pixels[0]= avansar +pixels[0];
                        pause(10);
                        add(camell_rapid_0,pixels[0],-40);
                    }
                    if (start[1]){
                        avansar =random.nextInt(15)+1;
                        pixels[1]= avansar +pixels[1];
                        pause(10);
                        add(camell_rapid_1,pixels[1],30);
                    }
                    if (start[2]){
                        avansar =random.nextInt(15)+1;
                        pixels[2]= avansar +pixels[2];
                        pause(10);
                        add(camell_rapid_2,pixels[2],80);
                    }
                    if (start[3]) {
                        avansar = random.nextInt(15) + 1;
                        pixels[3] = avansar + pixels[3];
                        pause(10);
                        add(camell_rapid_3, pixels[3], 135);
                    }
                    if (start[4]) {
                        avansar = random.nextInt(15) + 1;
                        pixels[4] = avansar + pixels[4];
                        pause(10);
                        add(camell_rapid_4, pixels[4], 200);
                    }
                    if (start[5]) {
                        avansar = random.nextInt(15) + 1;
                        pixels[5] = avansar + pixels[5];
                        pause(10);
                        add(camell_rapid_5, pixels[5], 250);
                    }
                }
                if (noms_separats.length==7){
                    if (start[0]){
                        avansar =random.nextInt(15)+1;
                        pixels[0]= avansar +pixels[0];
                        pause(10);
                        add(camell_rapid_0,pixels[0],-40);
                    }
                    if (start[1]){
                        avansar =random.nextInt(15)+1;
                        pixels[1]= avansar +pixels[1];
                        pause(10);
                        add(camell_rapid_1,pixels[1],30);
                    }
                    if (start[2]){
                        avansar =random.nextInt(15)+1;
                        pixels[2]= avansar +pixels[2];
                        pause(10);
                        add(camell_rapid_2,pixels[2],80);
                    }
                    if (start[3]) {
                        avansar = random.nextInt(15) + 1;
                        pixels[3] = avansar + pixels[3];
                        pause(10);
                        add(camell_rapid_3, pixels[3], 135);
                    }
                    if (start[4]) {
                        avansar = random.nextInt(15) + 1;
                        pixels[4] = avansar + pixels[4];
                        pause(10);
                        add(camell_rapid_4, pixels[4], 200);
                    }
                    if (start[5]) {
                        avansar = random.nextInt(15) + 1;
                        pixels[5] = avansar + pixels[5];
                        pause(10);
                        add(camell_rapid_5, pixels[5], 250);
                    }
                    if (start[6]){
                        avansar =random.nextInt(15)+1;
                        pixels[6]= avansar +pixels[6];
                        pause(10);
                        add(camell_rapid_6,pixels[6],310);
                    }
                }
                contador++;
                if (contador==6){
                    contador=0;
                }
                if(pixels[contador]>=750){
                    JOptionPane.showMessageDialog(null,noms_separats[contador]+" Ha guanyat");
                }
            }
    }
     if (nivell==2){
         boolean[] start = new boolean[7];
         int[] pixels=new int[7];
         int contador=0;
         int avansar =0;
         for (int i=0;i<7;i++){
             pixels[i]=20;
         }
         GImage camell_rapid = new GImage(".\\src\\Camells\\camells_rapids.png");
         GImage camell_fondiste = new GImage(".\\src\\Camells\\camell_fondiste.png");
         GImage camell_antisenar = new GImage(".\\src\\Camells\\camell_antisenar.png");
         GImage camell_flipat = new GImage(".\\src\\Camells\\camell_antisenar.png");
         GImage camell_rapid1 = new GImage(".\\src\\Camells\\camells_rapids.png");
         GImage camell_fondiste1 = new GImage(".\\src\\Camells\\camell_fondiste.png");
         GImage camell_antisenar1 = new GImage(".\\src\\Camells\\camell_antisenar.png");


         if (noms_separats.length==1){
             camell_rapid.setSize(150,150);
             add(camell_rapid,20,-40);
         }
         if (noms_separats.length==2){
             camell_rapid.setSize(150,150);
             add(camell_rapid,20,-40);

             camell_fondiste.setSize(150,150);
             add(camell_fondiste,20,30);
         }
         if (noms_separats.length==3){
             camell_rapid.setSize(150,150);
             add(camell_rapid,20,-40);

             camell_fondiste.setSize(150,150);
             add(camell_fondiste,20,30);

             camell_antisenar.setSize(150,150);
             add(camell_antisenar,20,80);
         }
         if (noms_separats.length==4){
             camell_rapid.setSize(150,150);
             add(camell_rapid,20,-40);

             camell_fondiste.setSize(150,150);
             add(camell_fondiste,20,30);

             camell_antisenar.setSize(150,150);
             add(camell_antisenar,20,80);

             camell_flipat.setSize(150,150);
             add(camell_flipat,20,135);
         }
         if (noms_separats.length==4){
             camell_rapid.setSize(150,150);
             add(camell_rapid,20,-40);

             camell_fondiste.setSize(150,150);
             add(camell_fondiste,20,30);

             camell_antisenar.setSize(150,150);
             add(camell_antisenar,20,80);

             camell_flipat.setSize(150,150);
             add(camell_flipat,20,135);

         }
         if (noms_separats.length==5){
             camell_rapid.setSize(150,150);
             add(camell_rapid,20,-40);

             camell_fondiste.setSize(150,150);
             add(camell_fondiste,20,30);

             camell_antisenar.setSize(150,150);
             add(camell_antisenar,20,80);

             camell_flipat.setSize(150,150);
             add(camell_flipat,20,135);

             camell_rapid1.setSize(150,150);
             add(camell_rapid1,20,200);
         }
         if (noms_separats.length==6){
             camell_rapid.setSize(150,150);
             add(camell_rapid,20,-40);

             camell_fondiste.setSize(150,150);
             add(camell_fondiste,20,30);

             camell_antisenar.setSize(150,150);
             add(camell_antisenar,20,80);

             camell_flipat.setSize(150,150);
             add(camell_flipat,20,135);

             camell_rapid1.setSize(150,150);
             add(camell_rapid1,20,200);

             camell_fondiste1.setSize(150,150);
             add(camell_fondiste1,20,250);
         }
         if (noms_separats.length==7){
             camell_rapid.setSize(150,150);
             add(camell_rapid,20,-40);

             camell_fondiste.setSize(150,150);
             add(camell_fondiste,20,30);

             camell_antisenar.setSize(150,150);
             add(camell_antisenar,20,80);

             camell_flipat.setSize(150,150);
             add(camell_flipat,20,135);

             camell_rapid1.setSize(150,150);
             add(camell_rapid1,20,200);

             camell_fondiste1.setSize(150,150);
             add(camell_fondiste1,20,250);

             camell_antisenar1.setSize(150,150);
             add(camell_antisenar1,20,310);
         }
         int senar=0;
         int contador_flipats=0;
         while(pixels[contador]<750) {
             for (int i = 0; i < 7; i++) {
                 start[i] = random.nextBoolean();
             }
             contador_flipats++;


             if (noms_separats.length==1){
                 if (start[0]){
                     avansar =random.nextInt(15)+1;
                     if (avansar ==15){
                         avansar = avansar *2;
                     }
                     pixels[0]= avansar +pixels[0];
                     pause(10);
                     add(camell_rapid,pixels[0],-40);
                 }
             }
             if (noms_separats.length==2){
                 if (start[0]){
                     avansar =random.nextInt(15)+1;
                     if (avansar ==15){
                         avansar = avansar *2;
                     }
                     pixels[0]= avansar +pixels[0];
                     pause(10);
                     add(camell_rapid,pixels[0],-40);
                 }
                 if (start[1]){
                     avansar =random.nextInt(10)+5;
                     pixels[1]= avansar +pixels[1];
                     pause(10);
                     add(camell_fondiste,pixels[1],30);
                 }}
             if (noms_separats.length==3){
                 if (start[0]) {
                     avansar = random.nextInt(15) + 1;
                     if (avansar == 15) {
                         avansar = avansar * 2;
                     }
                     pixels[0]= avansar +pixels[0];
                     pause(10);
                     add(camell_rapid,pixels[0],-40);
                 }
                 if (start[1]){
                     avansar =random.nextInt(10)+5;
                     pixels[1]= avansar +pixels[1];
                     pause(10);
                     add(camell_fondiste,pixels[1],30);
                 }
                 if (start[2]){
                     senar=random.nextInt(15)+1;
                     if (senar%2==0){
                         avansar =2;
                     }
                     pixels[2]= avansar +pixels[1];
                     pause(10);
                     add(camell_antisenar,pixels[1],80);
                 }
             }
             if (noms_separats.length==4){
                 if (start[0]) {
                     avansar = random.nextInt(15) + 1;
                     if (avansar == 15) {
                         avansar = avansar * 2;
                     }
                     pixels[0]= avansar +pixels[0];
                     pause(10);
                     add(camell_rapid,pixels[0],-40);
                 }
                 if (start[1]){
                     avansar =random.nextInt(10)+5;
                     pixels[1]= avansar +pixels[1];
                     pause(10);
                     add(camell_fondiste,pixels[1],30);
                 }
                 if (start[2]){
                     senar=random.nextInt(15)+1;
                     if (senar%2==0){
                         avansar =2;
                     }
                     pixels[2]= avansar +pixels[2];
                     pause(10);
                     add(camell_antisenar,pixels[2],80);
                 }
                 if (start[3]){
                     avansar = random.nextInt(15) + 1;
                     if (contador_flipats%2==0){
                         pixels[3]= avansar +pixels[3];
                         pause(10);
                         add(camell_flipat,pixels[3],135);
                     }else {
                         avansar =-avansar;
                         pixels[3]= avansar +pixels[3];
                         pause(10);
                         add(camell_flipat,pixels[3],135);
                     }
                 }
             }
             if (noms_separats.length==5){
                 if (start[0]) {
                     avansar = random.nextInt(15) + 1;
                     if (avansar == 15) {
                         avansar = avansar * 2;
                     }
                     pixels[0]= avansar +pixels[0];
                     pause(10);
                     add(camell_rapid,pixels[0],-40);
                 }
                 if (start[1]){
                     avansar =random.nextInt(10)+5;
                     pixels[1]= avansar +pixels[1];
                     pause(10);
                     add(camell_fondiste,pixels[1],30);
                 }
                 if (start[2]){
                     senar=random.nextInt(15)+1;
                     if (senar%2==0){
                         avansar =2;
                     }
                     pixels[2]= avansar +pixels[2];
                     pause(10);
                     add(camell_antisenar,pixels[2],80);
                 }
                 if (start[3]){
                     avansar = random.nextInt(15) + 1;
                     if (contador_flipats%2==0){
                         pixels[3]= avansar +pixels[3];
                         pause(10);
                         add(camell_flipat,pixels[3],135);
                     }else {
                         avansar =-avansar;
                         pixels[3]= avansar +pixels[3];
                         pause(10);
                         add(camell_flipat,pixels[3],135);
                     }
                 }
                 if (start[4]){
                     if (start[4]) {
                         avansar = random.nextInt(15) + 1;
                         if (avansar == 15) {
                             avansar = avansar * 2;
                         }
                         pixels[4]= avansar +pixels[4];
                         pause(10);
                         add(camell_rapid1,pixels[4],200);
                     }
                 }}

             if (noms_separats.length==6){
                     if (start[0]) {
                         avansar = random.nextInt(15) + 1;
                         if (avansar == 15) {
                             avansar = avansar * 2;
                         }
                         pixels[0]= avansar +pixels[0];
                         pause(10);
                         add(camell_rapid,pixels[0],-40);
                     }
                     if (start[1]){
                         avansar =random.nextInt(10)+5;
                         pixels[1]= avansar +pixels[1];
                         pause(10);
                         add(camell_fondiste,pixels[1],30);
                     }
                     if (start[2]){
                         senar=random.nextInt(15)+1;
                         if (senar%2==0){
                             avansar =2;
                         }
                         pixels[2]= avansar +pixels[2];
                         pause(10);
                         add(camell_antisenar,pixels[2],80);
                     }
                     if (start[3]){
                         avansar = random.nextInt(15) + 1;
                         if (contador_flipats%2==0){
                             pixels[3]= avansar +pixels[3];
                             pause(10);
                             add(camell_flipat,pixels[3],135);
                         }else {
                             avansar =-avansar;
                             pixels[3]= avansar +pixels[3];
                             pause(10);
                             add(camell_flipat,pixels[3],135);
                         }
                    }
                     if (start[4]) {
                         avansar = random.nextInt(15) + 1;
                         if (avansar == 15) {
                             avansar = avansar * 2;
                         }
                         pixels[4]= avansar +pixels[4];
                         pause(10);
                         add(camell_rapid1,pixels[4],200);
                     }
                 if (start[5]){
                     avansar =random.nextInt(10)+5;
                     pixels[5]= avansar +pixels[5];
                     pause(10);
                     add(camell_fondiste1,pixels[5],250);
                 }
                 }
             if (noms_separats.length==7){
                 if (start[0]) {
                     avansar = random.nextInt(15) + 1;
                     if (avansar == 15) {
                         avansar = avansar * 2;
                     }
                     pixels[0]= avansar +pixels[0];
                     pause(10);
                     add(camell_rapid,pixels[0],-40);
                 }
                 if (start[1]){
                     avansar =random.nextInt(10)+5;
                     pixels[1]= avansar +pixels[1];
                     pause(10);
                     add(camell_fondiste,pixels[1],30);
                 }
                 if (start[2]){
                     senar=random.nextInt(15)+1;
                     if (senar%2==0){
                         avansar =2;
                     }
                     pixels[2]= avansar +pixels[2];
                     pause(10);
                     add(camell_antisenar,pixels[2],80);
                 }
                 if (start[3]){
                     avansar = random.nextInt(15) + 1;
                     if (contador_flipats%2==0){
                         pixels[3]= avansar +pixels[3];
                         pause(10);
                         add(camell_flipat,pixels[3],135);
                     }else {
                         avansar =-avansar;
                         pixels[3]= avansar +pixels[3];
                         pause(10);
                         add(camell_flipat,pixels[3],135);
                     }
                 }
                 if (start[4]) {
                     avansar = random.nextInt(15) + 1;
                     if (avansar == 15) {
                         avansar = avansar * 2;
                     }
                     pixels[4]= avansar +pixels[4];
                     pause(10);
                     add(camell_rapid1,pixels[4],200);
                 }
                 if (start[5]){
                     avansar =random.nextInt(10)+5;
                     pixels[5]= avansar +pixels[5];
                     pause(10);
                     add(camell_fondiste1,pixels[5],250);
                 }
                 if (start[6]){
                     if (start[6]){
                         senar=random.nextInt(15)+1;
                         if (senar%2==0){
                             avansar =2;
                         }
                         pixels[6]= avansar +pixels[6];
                         pause(10);
                         add(camell_antisenar1,pixels[6],310);
                     }
                 }
             }
                 contador++;
                 if (contador==6){
                     contador=0;
                 }
                 if(pixels[contador]>=750){
                     JOptionPane.showMessageDialog(null,noms_separats[contador]+" Ha guanyat");
                 }
             }}}}
