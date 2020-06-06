package turing;


public class MT {
    private int estado;
    private char caracter;
    private char movimiento;
    
    public MT(int estado, char caracter, char movimiento){
        this.estado = estado;
        this.caracter = caracter;
        this.movimiento = movimiento;
    }
    
    public static MT[][] inicializarMatriz(){
        MT[][] matriz = new MT[1][3];
        matriz[0][0] = new MT(0,'1','r');
        matriz[0][1] = new MT(0,'0','r');
        matriz[0][2] = new MT(1,' ','l');
        return matriz;
    }
    
    public int getEstado(){
        return this.estado;
    }

    public char getCaracter() {
        return this.caracter;
    }

    public int getMovimiento() {
        if (this.movimiento == 'r'){
            return 1;
        } else {
            return -1;
        }
    }
}
