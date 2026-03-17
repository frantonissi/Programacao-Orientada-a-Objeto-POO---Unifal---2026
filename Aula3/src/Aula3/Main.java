package Aula3;

public class Main {
    static void main(String[] args) {

        //args = new String[]{"Ola", "Bom dia"};
        /*args = new String[3];
        args[0] = "Bom dia";*/

        if(args.length > 0){
            for(int i = 0; i < args.length; i++){
                System.out.println(args[i]);
            }
        }

    }
}