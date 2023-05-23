/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author HugoOs
 */
public class ElementoAtomico {
    private int MasaA;
    private int NumAtomico;
    private String SimAtomico;
    private String nombre;
    private String color;
    public static ArrayList<ElementoAtomico> elementos = new ArrayList<>();
    
    public ElementoAtomico(){
    }
    public ElementoAtomico(int MasaA,int NumAtomico, String SimAtomico, String nombre, String color){
        this.MasaA = MasaA;
        this.NumAtomico = NumAtomico;
        this.SimAtomico = SimAtomico;
        this.nombre = nombre;
        this.color =  color;
    }
    public int getMasaA() {
        return MasaA;
    }

    public void setMasaA(int MasaA) {
        this.MasaA = MasaA;
    }

    public int getNumAtomico() {
        return NumAtomico;
    }

    public void setNumAtomico(int NumAtomico) {
        this.NumAtomico = NumAtomico;
    }

    public String getSimAtomico() {
        return SimAtomico;
    }

    public void setSimAtomico(String SimAtomico) {
        this.SimAtomico = SimAtomico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "elemento {" + "Masa Atomica = " + MasaA + ", Numero Atomico = " + NumAtomico + ", Simbolo Atomico = " + SimAtomico + ", Nombre = " + nombre + ", Color = " + color +'}';
    }
    public static void llenarElementos(){
        insertarElemento((int) 18.9984,9,"F","Fluor","verde");
        insertarElemento((int) 39.0983 ,19,"K","Potasio","Naranja");
        insertarElemento((int) 63.546,29,"Cu","Cobre","Naranja");
        insertarElemento((int) 88.905,39,"Y","Itrio","Naranja");
        insertarElemento((int) 114.818 ,49,"In","Indio","Naranaja");
        
    }
    public static void insertarElemento(int MasaA,int NumAtomico, String SimAtomico, String nombre, String color){
        elementos.add(new ElementoAtomico(MasaA, NumAtomico, SimAtomico, nombre, color));
    }
    public static void eliminarElemento(int posicion){ // código
        elementos.remove(posicion);
    }
    public static void ActualizarElemento(int recNo, int MasaA,int NumAtomico, String SimAtomico, String nombre, String color){
        elementos.get(recNo).setMasaA(MasaA);
        elementos.get(recNo).setNumAtomico(NumAtomico);
        elementos.get(recNo).setSimAtomico(SimAtomico);
        elementos.get(recNo).setNombre(nombre);
        elementos.get(recNo).setColor(color);
    }
    
}
