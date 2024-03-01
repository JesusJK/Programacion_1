package com.mycompany.proyecto_1;
public class NewClass {
    
    public static void main(String[] args){
        Character homero = new Character("Homero","inspector de seguridad de una planta nuclear",38,"pequeño demonio");
        homero.greeting();
        System.out.println(homero.age);
        
        Character bart = new Character("bart","vago",10, "ay caramba");
        bart.greeting();
    }
    static class Character{
        String name;
        String occupation;
        int age;
        String phrase;

        public Character(String name, String occupation, int age, String phrase) {
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.phrase = phrase;
        }
         
        
        void greeting(){
            System.out.println(this.phrase);
        }
        
    }
    
}
