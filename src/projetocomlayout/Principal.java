
package projetocomlayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;

/**
 *
 * @author Maickel
 */
public class Principal extends javax.swing.JFrame{

    public Principal() {
       initComponents();
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
           
        }
        
    };
     
public static void breakmin(){}  
    public ArrayList<Funcionario> funcionarios = new ArrayList<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtHoraEntrada = new javax.swing.JTextField();
        txtHoraSaida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionarios = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jFrame4.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame4.setAlwaysOnTop(true);

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Incluir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        tbFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Entrada", "Saída", "Brekar", "Meio da Jornada", "Sair para brekar até:", "Hora que foi brekar", "Hora que deve voltar", "Tempo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFuncionarios);

        jButton2.setText("Deletar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Corrigir");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel1.setText("Nome do Funcionário:");

        jLabel2.setText("Horário de Entrada:");

        jLabel3.setText("Horário de Saída:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(86, 86, 86))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    
       
            
        String nome = txtNome.getText();
        String entrada = txtHoraEntrada.getText();
        String saida = txtHoraSaida.getText();
        
String Entrada1 = entrada.substring(0,2);
int Entrada1int = Integer.parseInt(Entrada1);
String Entrada2;
Entrada2 = entrada.substring(3,5);
int Entrada2int = Integer.parseInt(Entrada2);
String Saida1;
Saida1 = saida.substring(0,2);
int Saida1int = Integer.parseInt(Saida1);
String Saida2;
Saida2 = saida.substring(3,5);
int Saida2int = Integer.parseInt(Saida2);
//Fim da entrada de dados.

//Ida de Break Minima:
int aposentrada1 = 03; // Hora minima após entrada para ir brekar
int aposentrada2 = 30; // Minutos
int Apartir = Entrada1int * 3600 + Entrada2int * 60;
int Apartirfinal = aposentrada1 * 3600 + aposentrada2 * 60;
int Apartirfinal1 = Apartir + Apartirfinal;
int Apartirfinal2 = Apartirfinal1 / 60;
//Horário minimo para ir brekar transformado em segundos = Apartirfinal2.

// Transformar valores de ida de break de segundos para horas:
long horapartir = Apartirfinal2;
long minutos2 = horapartir %60;
long horas2 = (horapartir - minutos2)/60;
Long r = horas2;
String apartirde1 = String.valueOf(r);
Long s = minutos2;

String minutosapartir1 = String.valueOf(s);
//Fim da transformação em horas.

//Meio da Jornada:
int Meiojornada1;
int Meiojornada2;
int Meiojornada3;
int Meiojornada4;
Meiojornada1 = Saida1int * 3600 + Saida2int * 60;
Meiojornada2 = Entrada1int * 3600 + Entrada2int * 60;
Meiojornada3 = Meiojornada1 - Meiojornada2;
Meiojornada4 = Meiojornada3 / 2;
Meiojornada4 = Meiojornada4 /60;
//Horário do meio da jornada de break em segundos = Meiojornada4.

// Transformar valores do meio da jornada de segundos para horas:
long valor = Meiojornada4;
long minutos = valor % 60;
long horas = (valor - minutos) / 60;
Long p = horas;
Integer horameio= Integer.valueOf(p.toString());
Long q = minutos;
Integer minutomeio= Integer.valueOf(q.toString());
//Fim da transformação em horas.

// Colocar o Horário de Break no meio da jornada no formato de horas padrão HH:MM:
  GregorianCalendar gc = new GregorianCalendar();   
		    int hora = Entrada1int;
		    int min = Entrada2int;
                  
		      
		    SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");   
		    Time time = new Time(hora, min,00);   
		    gc.setTimeInMillis(time.getTime());   
		    hora = horameio;
		    min = minutomeio;
		    gc.add(Calendar.HOUR,hora);
		    gc.add(Calendar.MINUTE,min);  
                  
                    String Meiojornadafinal = sdf2.format(gc.getTime());
// Fim da tranformação para formato de horas padrão:
                    
// Horário máximo para ir brekar:
int somarpromeio = 00;
int somarpromeio3 = 59;
String ate1 = Meiojornadafinal;
String ate2 = ate1.substring(0,2);
int ate4 = Integer.parseInt(ate2);
String ate3 = ate1.substring(3,5);
int ate5 = Integer.parseInt(ate3);
//Horário máximo para ir brekar dentro da jornada = Meio da jornada + 59 minutos

// Calcular e Colocar o Horário máximo para ir brekar no formato de horas padrão:
GregorianCalendar gc2 = new GregorianCalendar();   
		    int hora2 = ate4; // Hora do meio da jornada transformado em inteiro
		    int min2 = ate5; // Minutos transformados em inteiro
                  
		      
		    SimpleDateFormat sdf4 = new SimpleDateFormat("HH:mm");   
		    Time time2 = new Time(hora2, min2,00); 
		    gc2.setTimeInMillis(time2.getTime());   
		    hora2 = somarpromeio; // Inicio da soma do horario do meio da jornada + 59 minutos:
		    min2 = somarpromeio3;
		    gc2.add(Calendar.HOUR,hora2);
		    gc2.add(Calendar.MINUTE,min2);  
                  
                    String Atefinal = sdf4.format(gc2.getTime()); // Fim da soma.
// Fim da tranformação para formato de horas padrão:

        
 
        Funcionario f = new Funcionario();  
   
        f.setNome (nome);
        f.setEntrada (entrada);
        f.setSaida (saida);
        f.setBrekar (apartirde1 + ":"+ minutosapartir1);
        f.setMeioJornada (Meiojornadafinal);
        f.setBreakmax (Atefinal);
        f.setHoradobreak(null);
        f.setHoradevoltar(null);
        f.actualizarLabel();
       
        
      
        funcionarios.add(f);
        DefaultTableModel modelo = (DefaultTableModel) tbFuncionarios.getModel();
        modelo.setNumRows(0);
        
        for(Funcionario func: funcionarios){
        modelo.addRow(new Object[]{
        func.getNome(),
            func.getEntrada(),
            func.getSaida(),
            func.getBrekar(),
            func.getMeioJornada(),
            func.getBreakmax(),
            func.getHoradobreak(),
            func.getHoradevoltar(),
            func.getTempo()
         
        });
        
        
    
        
    }//GEN-LAST:event_jButton1MouseClicked
    }

                          
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
     int posicao = tbFuncionarios.getSelectedRow();
     funcionarios.remove (posicao);
     DefaultTableModel modelo = (DefaultTableModel) tbFuncionarios.getModel();
        modelo.setNumRows(0);
        
        for(Funcionario func: funcionarios){
        modelo.addRow(new Object[]{
        func.getNome(),
            func.getEntrada(),
            func.getSaida(),
            func.getBrekar(),
            func.getMeioJornada(),
            func.getBreakmax(),
            func.getHoradobreak(),
            func.getHoradevoltar(),
            func.getTempo()
        });}
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        int posicao = tbFuncionarios.getSelectedRow();
        funcionarios.get(posicao).setNome(txtNome.getText());
        funcionarios.get(posicao).setEntrada(txtHoraEntrada.getText());
        funcionarios.get(posicao).setSaida(txtHoraSaida.getText());
       
        
    
        DefaultTableModel modelo = (DefaultTableModel) tbFuncionarios.getModel();
        modelo.setNumRows(0);
        
        for(Funcionario func: funcionarios){
        modelo.addRow(new Object[]{
        func.getNome(),
            func.getEntrada(),
            func.getSaida(),
            func.getBrekar(),
            func.getMeioJornada(),
            func.getBreakmax(),
            func.getHoradobreak(),
            func.getHoradevoltar(),
            
        });}
    }//GEN-LAST:event_jButton3MouseClicked

    private void tbFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncionariosMouseClicked
        int posicao = tbFuncionarios.getSelectedRow();
        txtNome.setText(tbFuncionarios.getValueAt(posicao, 0).toString());
        txtHoraEntrada.setText(tbFuncionarios.getValueAt(posicao, 1).toString());
        txtHoraSaida.setText(tbFuncionarios.getValueAt(posicao, 2).toString());
        
    }//GEN-LAST:event_tbFuncionariosMouseClicked

  
    public static void main(String args[]) {
	/* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
               
            }
             
        });
    }

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFuncionarios;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSaida;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    

    
        
}
