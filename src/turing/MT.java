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
    
    public char getMovimientoChar(){
        return this.movimiento;
    }
}
