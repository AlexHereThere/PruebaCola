/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *clase para modelar una cola o fila
 * @author ACR
 * @param <T>
 */
public class Cola <T>{
    int inicio,fin,max;
    T[] cola;
    
    public Cola()
    {
        this.inicio = -1;
        this.fin = -1;
        this.max = 10;
        this.cola = (T[]) new Object[max];
    }
    
    public Cola(int max)
    {
        this.inicio = -1;
        this.fin = -1;
        this.max = max;
        this.cola = (T[]) new Object[max];
    }
    
    public boolean estaVacio()
    {
        if(inicio==-1)
        {
            System.out.println("Sub-desbordamiento");
            return true;
        }
        else return false;
    }
    
    public boolean estaLleno()
    {
        if(fin==max)
        {
            System.out.println("Desbordamiento");
            return true;
        }
        else return false;
    }
    
    public void insertarDato(T dato)
    {
        if(!estaLleno())
        {
        fin++;
        cola[fin] = dato;    
        if(fin==0)inicio=0; //inicializar fila
        }
    }
    
    public T eliminarDato()
    {
        if(!estaVacio())
        {
        T dato = cola[inicio];    
            if(inicio==fin)
            {
            inicio=-1;
            fin=-1;
            } else inicio++;
            return dato;
        }
        return null;
    }
    
    public T verInicio()
    {
       if(!estaVacio()) return cola[inicio];
       else return null;
    }
}

