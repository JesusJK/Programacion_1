package com.mycompany.proyecto_1;
import character.Character; 
public class NewClass {
    
    public static void main(String[] args){
        
        Character homero = new Character("Homero","inspector de seguridad de una planta nuclear",38,"pequeño demonio");
        homero.greeting();
        System.out.println(homero.age);
        
        Character bart = new Character("bart","vago",10, "ay caramba");
        bart.greeting();
    }
}
