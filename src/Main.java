class Actividad1{
    /**
     * Enunciado:
     * Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores 144 y
     * 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la
     * resta, la división y la multiplicación.
     * **/
    static final int x = 144;
    static final int y = 999;
    public static int addition(){
        return (x+y);
    }
    public static int rest(){
        return (x-y);
    }
    public static int multiplication(){
        return (x*y);
    }
    public static int division(){
        return (x/y);
    }
}
class Actividad2{
    static final String nombre = "Natalia cortés bernal";
    public static String mostrarNombre(){
        return nombre;
    }
}
class Actividad3{
    static final String nombre = "Natalia cortés bernal";
    static final String direction = " calle walavy 15";
    static final String telephone = " 123456789";
    public static String mostrarDatos(){
        return nombre + direction + telephone;
    }
}
class Actividad4{
    static double euros = 6.00;
    public static double convertirEurosAPesetas(){
        return euros * 166.386;
    }
}
class Actividad5{
    static double pesetas = 1200;
    public static double convertirPesetasAEuros(){
        return pesetas / 166.386;
    }
}
class Actividad6{
    static double precioBase = 1200;
    public static double calcularIva(){
        return precioBase * 0.21 + precioBase;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Mostrando actividad 1");
        System.out.println(Actividad1.addition());
        System.out.println(Actividad1.rest());
        System.out.println(Actividad1.multiplication());
        System.out.println(Actividad1.division());
        System.out.println("----------------------");
        System.out.println("Mostrando actividad 2");
        System.out.println(Actividad2.mostrarNombre());
        System.out.println("----------------------");
        System.out.println("Mostrando actividad 3");
        System.out.println(Actividad3.mostrarDatos());
        System.out.println("----------------------");
        System.out.println("Mostrando actividad 4");
        System.out.println(Actividad4.convertirEurosAPesetas());
        System.out.println("----------------------");
        System.out.println("Mostrando actividad 5");
        System.out.println(Actividad5.convertirPesetasAEuros());
        System.out.println("----------------------");
        System.out.println("Mostrando actividad 6");
        System.out.println(Actividad6.calcularIva());
    }
}
