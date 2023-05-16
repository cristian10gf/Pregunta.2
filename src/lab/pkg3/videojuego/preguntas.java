/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3.videojuego;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class preguntas {
    
    // generame una multilista de preguntas y respuestas
    List<List<String>> preguntas = new ArrayList<>();


    public preguntas() {
        leer_archivo();
    }


    // lee el archivo de preguntas y respuestas con el siguiente formato: pregunta,respuesta1,respuesta2,respuesta3,respuesta4,respuesta_correcta
    public void leer_archivo() {
        boolean hay = false;
        while (hay == false) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("preguntas" + ".txt"));
                String line = null; //definición de line
                while ((line = br.readLine()) != null) {
                    String temp[] = line.split(",");
                    //System.out.println(temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3] + " " + temp[4] + " " + temp[5]);
                    List<String> temp2 = new ArrayList<>();
                    temp2.add(temp[0]);
                    temp2.add(temp[1]);
                    temp2.add(temp[2]);
                    temp2.add(temp[3]);
                    temp2.add(temp[4]);
                    temp2.add(temp[5]);
                    preguntas.add(temp2);
                }
                br.close();
                hay = true;

            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
                hay = false;
            }
        }
        System.out.println(preguntas.size());
        System.out.println(preguntas);
    }

    

}
