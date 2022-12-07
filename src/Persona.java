public class Persona {
    String name;
    int energia;
    int dinheiro;

    Persona(){

    }
    
    Persona(String name, int energia, int dinheiro){
        this.name = name;
        this.energia = energia;
        this.dinheiro = dinheiro;
    }

    void gastar(int gasto){
        this.dinheiro -= gasto;
    }

    void cansaso(int energiaPerdida){
        this.energia -= energiaPerdida;
    }
}
