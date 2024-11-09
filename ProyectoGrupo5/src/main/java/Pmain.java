/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Autor: Roberth Joel Lagos Sanchez
public class Pmain {
    public static void main(String[] args) {
        SubDoctor doctor = new SubDoctor("Pedro", 45, "Cardiologia");
        doctor.Saludar();
        doctor.MostrarInfo();
        
        SubDeportista deportista = new SubDeportista("Carlos", 30, "Futbol");
        deportista.Saludar();
        deportista.MostrarInfo();
    }
}
