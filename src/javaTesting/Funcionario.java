package javaTesting;

import java.time.LocalDate;

public class Funcionario {
    private String nombre;
    private int matricula;
    private LocalDate fechaNacimiento;

    // Constructor
    public Funcionario() {
        // Inicialización de atributos si es necesario
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}