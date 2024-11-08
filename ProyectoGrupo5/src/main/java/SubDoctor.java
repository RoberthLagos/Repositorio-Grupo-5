/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class SubDoctor extends SCPersona {
    private String Especialidad;

    // Constructor de la clase Doctor que llama al constructor de SCPersona
    public SubDoctor(String Nombre, int Edad, String Especialidad) {
        super(Nombre, Edad);  // Llama al constructor de SCPersona
        this.Especialidad = Especialidad;
    }

    // Método para mostrar la especialidad junto con la información básica
    @Override
    public void MostrarInfo() {
        super.MostrarInfo();  // Llama a MostrarInfo de SCPersona
        System.out.println("Especialidad: " + Especialidad);
    }

    // Getter para la especialidad
    public String GetEspecialidad() {
        return Especialidad;
    }

    // Setter para la especialidad
    public void SetEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
}
