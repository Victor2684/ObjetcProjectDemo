/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetcprojectdemo;

/**
 *
 * @author victor
 */
public class ObjetcProjectDemo {

    /**
     * Invocamos la clase Staff y añadimos los valores
     * @param args 
     */
    public static void main(String[] args) {
        Empleado staff1 = new Empleado("-Peter");
        staff1.insertarHorasTrabajas(160);
        int pay = staff1.CalcularelPago(1000,400);
        System.out.println("pay= " + pay);

        Empleado staff2 = new Empleado("-Jane","Lee");
        staff2.insertarHorasTrabajas(160);
        pay=staff2.calcularPago();
        System.out.println("Pay = "+ pay);
        
        System.out.println("\n\nUpdating Jane's hours worked to -10");
        staff2.insertarHorasTrabajas(-10);
        System.out.println("\nHours Worked = "+ staff2.asignarHoursWorked());
        pay = staff2.calcularPago();
        System.out.println("Pay =" +pay);
        
        
        

   
    }
    
}
