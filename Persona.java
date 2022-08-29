package Herencia;

public class Persona {
    private String name;
    private Integer dni;
    private String lastName;
    private String nationality;
    private Integer age;

    public Persona(String name, Integer dni, String lastName, String nationality, Integer age) {
        this.name = name;
        this.dni = dni;
        this.lastName = lastName;
        this.nationality = nationality;
        this.age = age;
    }
    public Integer getDni() {
        return dni;
    }
    public String getFullName() {
        return name +""+lastName;
    }
    public String getNationality() {
        return nationality;
    }
}
