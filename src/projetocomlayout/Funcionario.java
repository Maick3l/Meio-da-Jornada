/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocomlayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Funcionario extends javax.swing.JFrame{
    private  String Nome;
    private  String Entrada;
    private  String Saida;
    private  String Brekar;
    private  String MeioJornada;
    private  String Breakmax;
    private  String Horadobreak;
    private  String Horadevoltar;
    private String Tempo;
    
    
      

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEntrada() {
        return Entrada;
    }

    public void setEntrada(String Entrada) {
        this.Entrada = Entrada;
    }

    public String getSaida() {
        return Saida;
    }

    public void setSaida(String Saida) {
        this.Saida = Saida;
    }

    public String getBrekar() {
        return Brekar;
    }

    public void setBrekar(String Brekar) {
        this.Brekar = Brekar;
    }

    public String getMeioJornada() {
        return MeioJornada;
    }

    public void setMeioJornada(String MeioJornada) {
        this.MeioJornada = MeioJornada;
    }

    public String getBreakmax() {
        return Breakmax;
    }

    public void setBreakmax(String Breakmax) {
        this.Breakmax = Breakmax;
    }

    public String getHoradobreak() {
        return Horadobreak;
    }

    public void setHoradobreak(String Horadobreak) {
        this.Horadobreak = Horadobreak;
    }

    public String getHoradevoltar() {
        return Horadevoltar;
    }

    public void setHoradevoltar(String Horadevoltar) {
        this.Horadevoltar = Horadevoltar;
    }

    public String getTempo() {
        return Tempo;
    }

    public void setTempo(String Tempo) {
        this.Tempo = Tempo;
    }
    
  public Funcionario() {
        
        setLocationRelativeTo(null);
        t = new Timer(10, acciones);
        t.start();
         setEnabled(false);
     setEnabled(true);
       setEnabled(true);
    }
      private Timer t;
    private int h, m, s, cs;
    private ActionListener acciones = new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs; 
            if(cs==100){
                cs = 0;
                ++s;
            }
            if(s==60) 
            {
                s = 0;
                ++m;
            }
            if(m==60)
            {
                m = 0;
                ++h;
            }
            actualizarLabel();
        }
        
    };
    
    public void actualizarLabel() {
        String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        Tempo = (tiempo);
        
    }
    }
    


