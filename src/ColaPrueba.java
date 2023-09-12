
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author karoe
 * @param <T>
 */
public class ColaPrueba <T>{

    public static void main(String[] args) {
        
        Cola<OrdenDeCliente> clientes = new Cola<>(20);
        clientes.insertarDato(generarCliente());
        atenderNumClientes(2,clientes);
        
        for(int i=0;i<10;i++) clientes.insertarDato(generarCliente());
        System.out.println("");
        atenderNumClientes(5,clientes);
    }
    
    
    
    public static OrdenDeCliente generarCliente()
    {
        Random rnd = new Random();
        String[] nombres = {"Roberto","Alejandro","Manuel",
                            "Erik","Santiago","Diego","Ulises"};
        int[] cantidades = {1,4,7,2,3,8,10};
        return new OrdenDeCliente(nombres[rnd.nextInt(7)],
                   cantidades[rnd.nextInt(7)]) ;
    }
    
    public static void atenderNumClientes(int numero_a_atender,Cola lineaDeClientes)
    {
        OrdenDeCliente cliente_a_atender;
        for(int i=0;i<numero_a_atender;i++)
        {
            cliente_a_atender = (OrdenDeCliente) lineaDeClientes.verInicio();
            if(cliente_a_atender !=null)
            {   
                System.out.println("Hola " + cliente_a_atender.getNombreCliente()
                +", aqui esta sus " + cliente_a_atender.getNumeroProductos() 
                +" productos.");
                lineaDeClientes.eliminarDato();
            }
            else
            {
                System.out.println("Ya no hay mas clientes que revisar!");
                break;
            }
        }
    }
}
