package turing;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
Materia: Lenguajes y Autómatas I
Alumno: José Andrés Ceballos Vadillo
 */
public class App extends javax.swing.JFrame {

    // Definición de elementos de la máquina de Turing
    MT[][] matriz;
    String alfabeto = "01 ";
    String error = "";
    String[] titles = {
        "Función de transición",
        "<html>(q<sub>i</sub>, w<sub>1</sub><b><u>σ</u></b>w<sub>2</sub>)",
        "<html>a<sub>1</sub> a<sub>2</sub> ... a<sub>k-1</sub> q<sub>i</sub> "
        + "<b>a<sub>k</sub></b> a<sub>k+1</sub> ... a<sub>n</sub>"};

    // Método para incializar la matriz con la función de transición de nuestra máquina
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
        // Llamada para inicializar matriz
        this.matriz = this.inicializarMatriz();
        // Iniciar tabla
        this.tblInstantaneas.setModel(this.initializeModel(titles));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cinta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRecorrer = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        lblImgItcolima = new javax.swing.JLabel();
        lblImgTecnm = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        lblAlumno = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInstantaneas = new javax.swing.JTable();
        lblInfo = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina de Turing");

        cinta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        btnCreditos.setText("Creditos");
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
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

        btnAyuda.setText("Ayuda");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnCreditos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAyuda)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bSalir))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                    .addComponent(lblImgItcolima)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19))
                        .addComponent(lblImgTecnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(btnCreditos)
                    .addComponent(btnAyuda))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método para inciar el análisis de la entrada
    private void btnRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorrerActionPerformed
        // Se resetea la tabla y espacio de información para permitir un nuevo a análisis.
        this.tblInstantaneas.setModel(this.initializeModel(titles));
        this.lblInfo.setText("");
        this.error = "";
        //Obtenemos el contenido de la entrada
        String cadena = this.cinta.getText();

        // Se valida que la cadena contenga el espacio en blanco para proceder
        if (cadena.contains(" ")) {
            //Se llama al metodo para validar la cadena y se retorna la nueva cadena
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

    // Metodo para validar la cadena    
    private String cadenaValida(char[] cadena) {
        //Se inicializan las variables
        int estado = 0;
        int posicion = 0;
        int numCaracter = 0;

        //Se inicia el modelo para la construcción de la tabla
        DefaultTableModel modelo = this.initializeModel(this.titles);

        //Se inicia el recorrido de la entrada
        do {
            // Se llama a método para obtener el valor numerico de caracter analizado
            numCaracter = caracterAIndice(cadena[posicion], this.alfabeto);
            // Manejo de erro de caracter no valido
            if (numCaracter == -1) {
                estado = -1;
                this.error = "El caracter: " + cadena[posicion] + " es invalido.";
            } else {
                // Obtenemos el objeto de la matriz correspondiente al estado y caracter de entrada
                MT funcion = this.matriz[estado][numCaracter];

                // Agragamos la tupla al modelo de la tabla
                modelo = this.addRowToModel(
                        modelo,
                        funcionTransicion(estado, cadena[posicion], funcion),
                        descripcionA(String.valueOf(cadena), posicion, estado),
                        descripcionB(String.valueOf(cadena), posicion, estado)
                );

                // Se almacenan los valores para la siguiente iteración
                cadena[posicion] = funcion.getCaracter();
                posicion = posicion + funcion.getMovimiento();
                estado = funcion.getEstado();
            }
            // Termina cuando se obtiene un caracter no valido o llega a aceptación
        } while (estado != -1 && estado != 1);

        // Agregado de ultima tupla a modelo de tabla
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
        // Cargar el modelo de tabla en la interfaz gráfica
        this.tblInstantaneas.setModel(modelo);
        return String.valueOf(cadena);
    }

    // Método para inicializar modelo de tabla
    private DefaultTableModel initializeModel(String[] titles) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(titles);
        return modelo;
    }

    // Método para agregar un registro al modelo de tabla
    private DefaultTableModel addRowToModel(DefaultTableModel modelo,
            String funcion, String instantaneaA, String instantaneaB) {
        modelo.addRow(new Object[]{funcion, instantaneaA, instantaneaB});
        return modelo;
    }

    // Método para sobreescribir el espacio en blanco sobre la tabla
    private char espcioBlanco(char caracter) {
        if (caracter == ' ') {
            return 'ƀ';
        }
        return caracter;
    }

    // Método para formatear la función de transición
    private String funcionTransicion(int estado, char caracter, MT funcion) {
        return "<html>(q<sub>" + estado + "</sub>, " + this.espcioBlanco(caracter)
                + ") → (q<sub>" + funcion.getEstado() + "</sub>, "
                + this.espcioBlanco(funcion.getCaracter()) + ", "
                + String.valueOf(funcion.getMovimientoChar()).toUpperCase()
                + ")</html>";
    }

    // Método para formatear descripción instantanea
    private String descripcionA(String cadena, int posicion, int estado) {
        return "<html>(q<sub>" + estado + "</sub>, "
                + cadena.substring(0, posicion) + "<b><u>"
                + cadena.substring(posicion, posicion + 1)
                + "</u></b>" + cadena.substring(posicion + 1, cadena.length())
                + ") &ensp Ⱶ</html>";
    }

    // Método para formatear descripción instantanea
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

    // Método para desplegar creditos del programa
    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
        JOptionPane.showMessageDialog(null,
                "Tecnológico Nacional de México Campus Colima\n"
                + "Lenguajes y Autómatas I\n\n"
                + "Programa: Máquina de Turing complemento a uno\n\n"
                + "José Andrés Ceballos Vadillo\n"
                + "17460386",
                "Créditos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCreditosActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(null,
                "Con este programa se puede observar el funcionamiento de una máquina\n"
                + "de Turing que obtinene el complemento a uno de un número binario.\n\n"
                + "Las siguientes son las opciones disponibles:\n"
                + "  - Recorrer: inicia el análisis de la entrada en la cinta\n"
                + "  - Creditos: muestra los creditos del programa\n"
                + "  - Ayuda: abre este cuadro de información\n"
                + "  - Salir: termina la ejecución del programa\n\n"
                + "Para ejecutar el programa es necesario:\n"
                + "  1. Ingresar en la cinta una entrada que inluya el espacio en blanco\n"
                + "  2. Dar clic sobre el boton Recorrer\n"
                + "  3. El proceso se puede repetir tantasa veces sea necesario\n\n"
                + "En caso de no ingresar el espacio en blanco o haber ingresado un \n"
                + "caracter invalido se notificará el error.\n\n",
                "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAyudaActionPerformed

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
    private javax.swing.JButton bSalir;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnCreditos;
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
