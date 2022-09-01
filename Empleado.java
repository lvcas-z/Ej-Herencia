package Herencia;

public class Empleado extends Persona{
    private Double salary;
    private Integer fileNum;

    //El constructor empleado hereda las caracteristicas de persona
    public Empleado(String name, Integer dni, String lastName, String nationality, Integer age, Double salary, Integer fileNum) {
        super(name, dni, lastName, nationality, age);
        this.salary = salary;
        this.fileNum = fileNum;
    }

    public Double getSalary() {
        return salary;
    }

    public void addSalary(Double salary) {
        this.salary += salary;
    }

    public Integer getFileNum() {
        return fileNum;
    }
}
