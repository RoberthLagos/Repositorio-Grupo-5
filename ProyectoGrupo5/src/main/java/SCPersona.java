/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class SCPersona {
    private String Nombre;
    private int Edad;

    public SCPersona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public void Saludar() {
        System.out.println("Hola, Mi Nombre Es " + Nombre);
    }

    public void MostrarInfo() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }

    public String GetNombre() {
        return Nombre;
    }

    public void SetNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int GetEdad() {
        return Edad;
    }

    public void SetEdad(int Edad) {
        this.Edad = Edad;
    }
}