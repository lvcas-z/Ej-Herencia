package Herencia;

public class HerenciaMain {
    public static void main(String[] args) {
    Empleado lucasEmple = new Empleado("Lucas",4,"Caslu","Argentina",20,1500,1);
    lucasEmple.setSalary(23);
        System.out.println(lucasEmple.getSalary());

    Consultor franConsul =new Consultor("Fran",2,"Rodriguez","Brazil",22,"Franu",14);
    }

/*En resumen la herencia permite reutilizar clases , esta nueva clase(subclase) puede poseer nuevos atributos
    y nuevos metodos . Los objetos de la nueva clase heredan los atributos y metodos de la clase original, que se
    denomina superclase
* */
}
