package Fundamentos;
import java.util.HashMap;

public class CaracterMasRepetido {

    public static Character caracter (String cadena){

        HashMap <Character, Integer> letras= new HashMap<Character, Integer>();
        cadena=cadena.toLowerCase();

        for( int i=0; i<cadena.length();i++){
            char letra = cadena.charAt(i);
            if (letras.get(letra)==null){
                letras.put(letra, 1);
            }else{
                letras.put(letra, (letras.get(letra))+1);
            }
        }
        int repetidos=0;
        char letrarepetida=' ';

        for (char letra: letras.keySet()){
            if (repetidos<letras.get(letra)){
                 repetidos=letras.get(letra);
                letrarepetida=letra;
            }
        }


        return letrarepetida;

    }
    
}
