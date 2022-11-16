package Fundamentos;
import java.util.HashMap;

public class PrimerCaracter {


    public static char primer(String texto) {
        HashMap <Character, Integer> letras = new HashMap<>();

        texto = texto.toLowerCase();

        for(int i= 0; i<texto.length();i++){
            char letra =texto.charAt(i);
            
            if (letras.get(letra)==null){
                letras.put(letra, 1);
            }else{
                int conteo = letras.get(letra);
                conteo++;
                letras.put(letra,conteo);
            }
        }

        for(int i= 0; i<texto.length();i++){
            char letra =texto.charAt(i);
            if (letras.get(letra)==1){
                return letra;
            }
        } 
        return ' ';
    }
    
    public static void main(String[] args) {

        char rex = primer("AaBbCcDEe");
        System.out.println(rex);
       
    }
    
}
