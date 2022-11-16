package Fundamentos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class Test{
    public static void main(String[] args) {
        System.out.println("¡Hola mundo!");

        //Variables primitivas
        int OurInt;
        OurInt =400;
        double pi=3.1416;
        char unCaractes = 'A';
        boolean booleano =true;

        //Variables tipo objeto, tienen la primera letra mayúscula, tienen funcionalidadess
        String multiplesCaracters = "ABCD";
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        //Strings
        String myString = "myDouble.toString()";
        String myString2 = "myDouble.toString()";
        System.out.println(myString.length());
        System.out.println(myString.charAt(2));
        System.out.println(myString.indexOf("."));
        System.out.println(myString.indexOf("0"));
        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());
        System.out.println(multiplesCaracters.concat(myString));
        System.out.println(myString.equals(myString2));

        //Arrays

        int [] myArray; //Declarando
        myArray = new int[5];//Inicializandose
        myArray[0]=1;
        myArray[1]=2;
        myArray[2]=3;
        myArray[3]=4;
        myArray[4]=5;
        int myArray2 [] = new int [5];
        int [] myArray3 = {1,2,3,4,5};

        //Arrays con objetos

        ArrayList<Integer> myArray4 = new ArrayList<Integer>();
        myArray4.add(myInt);

        //Condicionales y operadores

        boolean llueve=false;
        boolean soleado = true;

        if (OurInt==myInt) {
            
            System.out.println("Números Iguales");
        }else{
            System.out.println("Números distintos");
        }

        if (llueve){
            System.out.println("Lleva paraguas");
        }else if(soleado){
            System.out.println("Ponte bloqueador");
        }else{
            System.out.println("Disfruta tu día!");
        }

        llueve =true;

        if (llueve&&soleado){// && annd || or
            System.out.println("Busca un arcoiris");
        }

        //Bucles
        int i=0;

        while(i<7){
            System.out.println(i);
            i++;
        }

        for (int j =0; j<7;j++){
            System.out.println("foo");
        }
         
        HelloWorld helloApp = new HelloWorld();

        System.out.println(helloApp.hola());

        System.out.println(HelloWorld.hola("Alex")); // se puede ejecutar pero no esta instanciado

        //Hashmap

        HashMap<String,String> usuarios = new HashMap<String, String>();

        usuarios.put("nombre", "Cinthya");
        usuarios.put("apellido", "Castillo");
        usuarios.put("correo", "cinthya@mail.com");

        //Conjuntos

        Set <String> keys =usuarios.keySet();
        System.out.println(usuarios.values());

        System.out.println(keys);

        for (String k : keys){
            System.out.println(k+ " "+usuarios.get(k));
        }











    }
}