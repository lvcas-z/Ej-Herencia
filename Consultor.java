package Herencia;

public class Consultor extends Persona{
    private String consulName;
    private Integer consulNum;

    public Consultor(String name, Integer dni, String lastName, String nationality, Integer age, String consulName, Integer consulNum) {
        super(name, dni, lastName, nationality, age);
        this.consulName = consulName;
        this.consulNum = consulNum;
    }

    public String getConsulName() {
        return consulName;
    }

    public void setConsulName(String consulName) {
        this.consulName = consulName;
    }

    public Integer getConsulNum() {
        return consulNum;
    }

    public void setConsulNum(Integer consulNum) {
        this.consulNum = consulNum;
    }
}
