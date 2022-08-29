package Herencia;

public class Empleado extends Persona{
    private Integer salary;
    private Integer fileNum;

    public Empleado(String name, Integer dni, String lastName, String nationality, Integer age, Integer salary, Integer fileNum) {
        super(name, dni, lastName, nationality, age);
        this.salary = salary;
        this.fileNum = fileNum;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getFileNum() {
        return fileNum;
    }

    public void setFileNum(Integer fileNum) {
        this.fileNum = fileNum;
    }
}
