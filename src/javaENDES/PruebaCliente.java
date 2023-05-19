package javaENDES;

import java.util.Arrays;

public class PruebaCliente {

    public static void main(String[] args) {
        // 
        
        Cliente [] clientes = new Cliente [5];
        
        ComparadorNombre cn = new ComparadorNombre();
        ComparadorEdad ce = new ComparadorEdad();
        
        clientes[0] = new Cliente("0000000A", "Pepe", 21, 54678);
        clientes[1] = new Cliente("4444444E", "Julio", 20, 78618);
        clientes[2] = new Cliente("2222222C", "Amanda", 17, 78618);
        clientes[3] = new Cliente("3333333D", "César", 18, 78618);
        clientes[4] = new Cliente("1111111B", "Bea", 19, 78618);
        
        System.out.println(Arrays.toString(clientes));
        
        Arrays.sort(clientes);
        System.out.println("Por DNI: " + Arrays.toString(clientes));
        
        cn.compare(clientes[0],clientes[1]);
        Arrays.sort(clientes, new ComparadorNombre());
        System.out.println("Por nombre: " + Arrays.toString(clientes));
        
        ce.compare(clientes[0],clientes[1]);
        Arrays.sort(clientes, new ComparadorEdad());
        System.out.println("Por edad: " + Arrays.toString(clientes));
    }

}
