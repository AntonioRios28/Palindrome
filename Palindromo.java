/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

public class Palindromo {
    public static void main(String[] args) {
        String[] palabras = {"reconocer","asdfdsa","AsDdSa","Sale El As","No palindromos","Cualquier frase","O palabra","Que no sea palindromo"};
        int indice = (int)(Math.random() * palabras.length);
        System.out.println("Palabra utilizada: "+ palabras[indice]);
        if (palindromo(palabras[indice]))
            System.out.println("Palindromo");
        else
            System.out.println("NO Palindromo");
    }
    static boolean palindromo(String palabra)
    {
     
        String modificado = palabra.replaceAll(" ","").toLowerCase();
        int i=0;
        while (i < modificado.length() / 2)
        {
            if (modificado.charAt(i) != modificado.charAt(modificado.length() -1 -i))
                return false;
            i++;
        }
        return true;
    }
}
