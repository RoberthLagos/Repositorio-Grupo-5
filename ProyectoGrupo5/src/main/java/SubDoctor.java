/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class SubDoctor extends SCPersona {
    private String Especialidad;

    public SubDoctor(String Nombre, int Edad, String Especialidad) {
        super(Nombre, Edad);
        this.Especialidad = Especialidad;
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Especialidad: " + Especialidad);
    }

    public String GetEspecialidad() {
        return Especialidad;
    }

    public void SetEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
}