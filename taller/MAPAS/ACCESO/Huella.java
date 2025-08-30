package MAPAS.ACCESO;

import java.util.HashSet;

public class Huella {

    private HashSet<String> huellas;

    public Huella() {
        huellas = new HashSet<>();
    }

    public void agregar(String huella) {
        huellas.add(huella);

    }

    public void verificar_existe(String huella){
        if(huellas.contains(huella)){
            System.out.println("EL ID: "+ huella+" Si existe");
        }else{
            System.out.println("EL ID: "+ huella+" No existe");
        }


    }

    public void setHuellas(HashSet<String> huellas) {
        this.huellas = huellas;
    }

    public void mostrar(){
        if(huellas.isEmpty()){
            System.out.println("NO HAY ELEMENTOS");
        }else{
            for (String huella : huellas) {
                System.out.println(huella);
                
            }
        }
    }

}
