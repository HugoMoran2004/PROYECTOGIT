package javaENDES;

public class Cliente implements Comparable <Cliente> {
    String dni;
    String nombre;
    int edad;
    double saldo;
    
    /**
     * Constructor del cliente
     * @param dni
     * @param nombre
     * @param edad
     * @param saldo
     */
    public Cliente(String dni, String nombre, int edad, double saldo) {
        super();
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", saldo=" + saldo + "]";
    }
    
    @Override
    public boolean equals(Object otro) {
        Cliente otroCliente = (Cliente) otro;
        boolean iguales = false;
        if(this.dni == otroCliente.dni) {
            iguales = true;
        }
        return iguales;
    }

    @Override
    public int compareTo(Cliente o) {
        return this.dni.compareTo(o.dni);
    }
    
    
    
    
}
