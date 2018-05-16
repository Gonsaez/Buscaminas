/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.swing.JButton;

/**
 *
 * @author xp
 */
public class Boton extends JButton{
    
    public int mina = 0;
    public int i = 0;
    public int j = 0;
    public int numeroMinasAlRededor = 0;

    public int getMina() {
        return mina;
    }

    public void setMina(int mina) {
        this.mina = mina;
    }

    public int getNumeroMinasAlRededor() {
        return numeroMinasAlRededor;
    }

    public void setNumeroMinasAlRededor(int numeroMinasAlRededor) {
        this.numeroMinasAlRededor = numeroMinasAlRededor;
    }
    
    public Boton(int _i, int _j){
        i = _i;
        j = _j;
        this.setBorder(null);
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
