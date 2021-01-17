/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public interface RadioGeneral {
    
    boolean isOn();     //Se usará para ver si el radio está o no encendido y en caso de no estar encendido, le prohíbe al main hacer que funcione el radio.
    void encender();    //Pone al boolean del radio en true. Esto enciende el radio.
    void apagar();      //Pone el boolean del radio como false. Esto apagará por completo al radio.
    void incrementar(); //Avanza la emisora. Esto verifica si la emisora es de am o fm.
    void disminuir();   //Retrocede la emisra También verifica si la emisora es am o fm. 
    void asignar();     //Creará una arraylist o array con las emisoras de am y fm.
    void emisoras();    //Enseña la lista de estaciones de radio ya sea que esté en am o fm.
    void frecuencia();  //Cambiar de am a fm o a am. 
}
