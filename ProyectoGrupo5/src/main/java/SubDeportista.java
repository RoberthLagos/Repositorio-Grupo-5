/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class SubDeportista extends SCPersona {
    private String Deporte;

    public SubDeportista(String Nombre, int Edad, String Deporte) {
        super(Nombre, Edad);
        this.Deporte = Deporte;
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Deporte: " + Deporte);
    }

    public String GetDeporte() {
        return Deporte;
    }

    public void SetDeporte(String Deporte) {
        this.Deporte = Deporte;
    }
}
