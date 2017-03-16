
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetcprojectdemo;

/**
 *
 * @author Victor
 */
public class Empleado {
/**
 * Declaramos las variables que contendra y dará funcionalidad a nuestra clase.
 */
    private String empleado;
    private final int tarifaporhora = 30;
    private int horasTrabajas;
 /* Metodo que visualiza el mensaje "Calculando el salario..."*/   
    public void imprimirMensaje()
    { 
        System.out.println("Calculando el salario...");
    }
    /**
     *  Este metodo calculará el salario cuando no hay bonus 
     * @return staffPay
     */
    public int calcularPago()
    {
        imprimirMensaje();
        int staffPay;
        staffPay = tarifaporhora * horasTrabajas;
        if (horasTrabajas > 0)
            return staffPay;
        else
            return -1;
    }
    /**
     *  Método que calcula es salario cuando hay bonus
     * @param bonus
     * @param tolerancia
     * @return Devuelve las horas trabajas multiplado por la tarias mas 
     * los bonus y mas la tolerancia
     */
    public int CalcularelPago(int bonus, int tolerancia)
    {
        imprimirMensaje();
        if (horasTrabajas>0)
            return horasTrabajas * tarifaporhora + bonus + tolerancia;
        else
            return 0;
    }
   /**
    * Método que verifica que horas trabajadas es mayor que cero
    * @param hours 
    */
    public void insertarHorasTrabajas(int horas)
    {
        if (horas > 0)
            horasTrabajas = horas;
        else {
            System.out.println("-Error: HoursWorked Cannot be Smaller than zero");
            System.out.println("-Error: HoursWorked is not updated");
            }          
    }
    /**
     * Método getter para asignar valores a horas trabajadas 
     * @return las horas trabajdas
     */
    public int asignarHoursWorked()
    {
        return horasTrabajas;
    }
/**
 * Constructores crean  objetos trabajadores
 * @param name 
 */
    public Empleado(String nombre)
    {
        String nameOfStaff = nombre;
        System.out.println("\n"+ nameOfStaff);
        System.out.println("-------------------------");
    }
    public Empleado(String primerNombre, String segundoNombre)
    {
        String nameOfStaff = primerNombre + segundoNombre;
        System.out.println("\n"+nameOfStaff);
        System.out.println("-------------------------------");
    }
    }
