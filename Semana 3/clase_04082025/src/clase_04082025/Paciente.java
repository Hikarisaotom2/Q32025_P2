/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_04082025;

/**
 *
 * @author claudiacortes
 */
public class Paciente {

    
    protected int edad;
    protected String tipoSangre;
    protected double peso;
    protected double altura;
    protected String infoPadres;
    protected String enfermedades;
    protected String alergias;
    protected String prodMedicos;
    protected String nombre;
    protected int id;
    protected String comidaFav;

    public Paciente(int edad, String tipoSangre, double peso, double altura, String infoPadres, String enfermedades, String alergias, String prodMedicos, String nombre, int id, String comidaFav) {
        this.edad = edad;
        this.tipoSangre = tipoSangre;
        this.peso = peso;
        this.altura = altura;
        this.infoPadres = infoPadres;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.prodMedicos = prodMedicos;
        this.nombre = nombre;
        this.id = id;
        this.comidaFav = comidaFav;
    }

    
   
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getInfoPadres() {
        return infoPadres;
    }

    public void setInfoPadres(String infoPadres) {
        this.infoPadres = infoPadres;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getProdMedicos() {
        return prodMedicos;
    }

    public void setProdMedicos(String prodMedicos) {
        this.prodMedicos = prodMedicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComidaFav() {
        return comidaFav;
    }

    public void setComidaFav(String comidaFav) {
        this.comidaFav = comidaFav;
    }

    @Override
    public String toString() {
        return "Paciente{" + "edad=" + edad + ", tipoSangre=" + tipoSangre + ", peso=" + peso + ", altura=" + altura + ", infoPadres=" + infoPadres + ", enfermedades=" + enfermedades + ", alergias=" + alergias + ", prodMedicos=" + prodMedicos + ", nombre=" + nombre + ", id=" + id + ", comidaFav=" + comidaFav + '}';
    }
    
    
    

    
}
