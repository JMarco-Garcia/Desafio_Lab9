/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio09;

import java.util.List;
import java.util.ArrayList;
import laboratorio09.Entidades.Estudiante;
import laboratorio09.Pantallas.PantallaListaEstudiantes;

/**
 *
 * @author Estudiante
 */
public class Laboratorio09 {

    public static List<Estudiante> listaEstudiantes = new ArrayList<>();
    public static void main(String[] args) {
        PantallaListaEstudiantes plEstudiante = new PantallaListaEstudiantes();
        plEstudiante.setVisible(true);
    }
    
}
