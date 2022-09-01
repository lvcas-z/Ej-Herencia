package Herencia;

public class Main {
    public static void main(String[] args) {
        Empleado lucasEmple = new Empleado("Lucas",51617181,"Caslu","Argentina",20,1500.0,1);
        lucasEmple.addSalary(231.20);
        System.out.println(lucasEmple.getSalary());

        Consultor franConsul =new Consultor("Fran",21212121,"Rodriguez","Brazil",22,"Business consultant",14);
        franConsul.setConsulName("Marketing consultant");
        System.out.println(franConsul.getConsulName()+", dni: "+franConsul.getDni());
    }
}
