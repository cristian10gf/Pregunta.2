/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3.videojuego;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class guardar_ganadores {
    String Jugador;
    int puntos;


    public guardar_ganadores(String Jugador, int puntos) {
        this.Jugador = Jugador;
        this.puntos = puntos;
    }

    public void agregar_archivo(String Jugador, int puntos) {
        // agrega el jugador y sus puntos al archivo
        try {
            FileWriter fw = new FileWriter("ganadores" + ".txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(Jugador + "\t" + puntos);
            pw.close();
        } catch (IOException ex) {
            System.out.println("No se encontro archivo");
        }
    }

    public void cambiar_puntos_jugador(String Jugador, int puntos) {
        // cambia los puntos del jugador en el archivo
        try {

            List<String> lines = Files.readAllLines(Paths.get("ganadores.txt"));

            // Modificar la línea específica
            int index = 0;
            String[] nueva_linea = new String[2];
            for (int i = 0;i<=lines.size(); i++) {
                if (lines.get(i).contains(Jugador)) {
                    index = i;
                    nueva_linea = lines.get(i).split("\t");
                    if (Integer.parseInt(nueva_linea[1]) < puntos) {
                        nueva_linea[1] = Integer.toString(puntos);
                    }
                    
                    break;
                }
            }
            lines.set(index, nueva_linea[0] + "\t" + nueva_linea[1]);

            // Escribir las líneas modificadas en el archivo
            Files.write(Paths.get("ganadores.txt"), lines);

        } catch (IOException ex) {
            System.out.println("No se encontro archivo");
        }

    }

    public void guardar_jugador_archivo() {
        // guarda el jugador y sus puntos en un archivo pero revisa si la informacion de ese jugador ya esta en el archivo
        // si ya esta en el archivo, entonces se actualizan los puntos
        // si no esta en el archivo, entonces se agrega el jugador y sus puntos
        boolean hay = false;
        while (hay == false) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("ganadores" + ".txt"));
                String line = null; //definición de line
                while ((line = br.readLine()) != null) {
                    String temp[] = line.split("\t");
                    // String temp[] ={1,2,3,4}
                    if (temp[0].equals(Jugador)) {
                        // si el jugador ya esta en el archivo, entonces se actualizan los puntos
                        cambiar_puntos_jugador(Jugador, puntos);
                        hay = true;
                    } else {
                        // si el jugador no esta en el archivo, entonces se agrega el jugador y sus puntos
                        agregar_archivo(Jugador, puntos);
                        hay = true;
                    }
                    break;
                }
                br.close();
                hay = true;

            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
                hay = false;

            }
        }
    }

    public static List leer_archivo() {
        boolean hay = false;
        List<String> lista = new ArrayList<>();
        while (hay == false) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("ganadores" + ".txt"));
                String line = null; //definición de line
                while ((line = br.readLine()) != null) {
                    String temp[] = line.split("\t");
                    // String temp[] ={1,2,3,4}
                    System.out.println(temp[0]);
                    lista.add(temp[0] + "," + temp[1]);
                }
                br.close();
                hay = true;

            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
                hay = true;

            }
        }
        return lista;
    }

    
    

}
