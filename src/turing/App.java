package turing;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
Materia: Lenguajes y Autómatas I
Alumno: José Andrés Ceballos Vadillo
 */
public class App extends javax.swing.JFrame {

    // Definición de elementos del autómata
    MT[][] matriz;
    String alfabeto = "01 ";
    String error = "";
    String[] titles = {
        "Función de transición",
        "<html>(q<sub>i</sub>, w<sub>1</sub><b><u>σ</u></b>w<sub>2</sub>)",
        "<html>a<sub>1</sub> a<sub>2</sub> ... a<sub>k-1</sub> q<sub>i</sub> "
        + "<b>a<sub>k</sub></b> a<sub>k+1</sub> ... a<sub>n</sub>"};

    public MT[][] inicializarMatriz() {
        MT[][] matriz = new MT[1][3];
        matriz[0][0] = new MT(0, '1', 'r');
        matriz[0][1] = new MT(0, '0', 'r');
        matriz[0][2] = new MT(1, ' ', 'l');
        return matriz;
    }

    public App() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.matriz = this.inicializarMatriz();
        this.tblInstantaneas.setModel(this.initializeModel(titles));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cinta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRecorrer = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bAbout = new javax.swing.JButton();
        lblImgItcolima = new javax.swing.JLabel();
        lblImgTecnm = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInstantaneas = new javax.swing.JTable();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina de Turing");

        cinta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cintaActionPerformed(evt);
            }
        });

        jLabel2.setText("Cinta: ");

        btnRecorrer.setText("Recorrer");
        btnRecorrer.setActionCommand("Analizar");
        btnRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorrerActionPerformed(evt);
            }
        });

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bAbout.setText("About");
        bAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAboutActionPerformed(evt);
            }
        });

        lblImgItcolima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tec.png"))); // NOI18N

        lblImgTecnm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tecnm.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lblTitulo.setText("Máquina de Turing");

        lblMateria.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblMateria.setText("Lenguajes y Autómatas I");

        lblAlumno.setFont(new java.awt.Font("Arial", 3, 10)); // NOI18N
        lblAlumno.setText("José Andrés Ceballos Vadillo - 17460386");

        tblInstantaneas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Función de transición", "(qi, w1sw2)", "a1 a2 ... ak-1 qi ak ak+1 ... an"
            }
        ));
        jScrollPane2.setViewportView(tblInstantaneas);

        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addComponent(lblImgTecnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bAbout)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cinta, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRecorrer))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblAlumno)
                                                    .addComponent(lblMateria))
                                                .addGap(13, 13, 13)))
                                        .addGap(61, 61, 61)
                                        .addComponent(lblImgItcolima)))))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblImgTecnm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTitulo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMateria)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblAlumno)))
                    .addComponent(lblImgItcolima))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecorrer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalir)
                    .addComponent(bAbout))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cintaActionPerformed

    }//GEN-LAST:event_cintaActionPerformed

    private void btnRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorrerActionPerformed

        this.tblInstantaneas.setModel(this.initializeModel(titles));
        this.lblInfo.setText("");
        this.error = "";
        String cadena = this.cinta.getText();

        if (cadena.contains(" ")) {
            String nuevaCadena = this.cadenaValida(cadena.toCharArray());
            if (this.error.equals("")) {
                lblInfo.setText("<html><b>La entrada <u>" + this.cinta.getText()
                        + "</u> en la cinta es valida!!</b><br/> y fue transformada a: "
                        + nuevaCadena + "</html>");
                this.cinta.setText(nuevaCadena);
            } else {
                JOptionPane.showMessageDialog(null, "La entrada: "
                        + this.cinta.getText() + ", NO es valida!!\n" + error,
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La entrada: "
                    + this.cinta.getText() + ", no contiene el caracter"
                    + " de control (espacio en blanco)!\n" + error,
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRecorrerActionPerformed

    // Método para inicializar modelo de tabla
    private DefaultTableModel initializeModel(String[] titles) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(titles);
        return modelo;
    }

    // Método para agregar registro a modelo de tabla
    private DefaultTableModel addRowToModel(DefaultTableModel modelo, String funcion, String instantaneaA, String instantaneaB) {
        modelo.addRow(new Object[]{funcion, instantaneaA, instantaneaB});
        return modelo;
    }

// Metodo para validar la cadena    
    private String cadenaValida(char[] cadena) {
        int estado = 0;
        int posicion = 0;
        int numCaracter;
        DefaultTableModel modelo = this.initializeModel(this.titles);

        do {
            numCaracter = caracterAIndice(cadena[posicion], this.alfabeto);
            if (numCaracter == -1) {
                estado = -1;
                this.error = "El caracter: " + cadena[posicion] + " es invalido.";
            } else {

                MT funcion = this.matriz[estado][numCaracter];
                String descripcionA = descripcionA(String.valueOf(cadena), posicion, estado);
                String descripcionB = descripcionB(String.valueOf(cadena), posicion, estado);
                String funcionTransicion = funcionTransicion(estado, cadena[posicion], funcion);
                
                cadena[posicion] = funcion.getCaracter();
                posicion = posicion + funcion.getMovimiento();
                estado = funcion.getEstado();



                modelo = this.addRowToModel(
                        modelo,
                        funcionTransicion,
                        descripcionA,
                        descripcionB
                );
            }
        } while (estado != -1 && estado != 1);

        if (estado != -1) {
            modelo = this.addRowToModel(
                    modelo,
                    "",
                    descripcionA(String.valueOf(cadena), posicion, estado),
                    descripcionB(String.valueOf(cadena), posicion, estado));
        } else {
            modelo = this.addRowToModel(
                    modelo, "", "Error", "Error");
        }

        this.tblInstantaneas.setModel(modelo);
        return String.valueOf(cadena);
    }
    
    private char espcioBlanco(char caracter){
        if (caracter == ' ')
            return 'ƀ';
        return caracter;
    }

    private String funcionTransicion(int estado, char caracter, MT funcion) {
        return "<html>(q<sub>" + estado + "</sub>, " + this.espcioBlanco(caracter)
                + ") → (q<sub>" + funcion.getEstado() + "</sub>, " 
                + this.espcioBlanco(funcion.getCaracter()) + ", " 
                + String.valueOf(funcion.getMovimientoChar()).toUpperCase()
                + ")</html>";
    }

    private String descripcionA(String cadena, int posicion, int estado) {
        return "<html>(q<sub>" + estado + "</sub>, "
                + cadena.substring(0, posicion) + "<b><u>"
                + cadena.substring(posicion, posicion + 1)
                + "</u></b>" + cadena.substring(posicion + 1, cadena.length())
                + ") &ensp Ⱶ</html>";
    }

    private String descripcionB(String cadena, int posicion, int estado) {
        return "<html>" + cadena.substring(0, posicion)
                + "q<sub>" + estado + "</sub>" + "<b>"
                + cadena.substring(posicion, posicion + 1) + "</b>"
                + cadena.substring(posicion + 1, cadena.length())
                + " &ensp Ⱶ</html>";
    }

    // Metodo para regresar la posición entera del caracter en el alfabeto
    private int caracterAIndice(char caracter, String alfabeto) {
        return alfabeto.indexOf(caracter);
    }

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAboutActionPerformed
        JOptionPane.showMessageDialog(null, "Programa para validar una cadena "
                + "mediante \nun Autómata Finito Deterministico.\n\n"
                + "Ingrese la cadena deseada y \nde clic en Validar.\n\n"
                + "Autor: José Andrés Ceballos Vadillo\n"
                + "Tecnológico Nacional de México campus Colima\n"
                + "Materia: Lenguajes y Autómatas I",
                "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bAboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAbout;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton btnRecorrer;
    private javax.swing.JTextField cinta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlumno;
    private javax.swing.JLabel lblImgItcolima;
    private javax.swing.JLabel lblImgTecnm;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblInstantaneas;
    // End of variables declaration//GEN-END:variables
}
