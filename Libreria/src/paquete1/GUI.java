/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        lib = new Library();
        panelOptiosTableBooks = new MouseAdapter() {
            // Sobreescribimos el método mouseClicked para detectar el clic del usuario
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tableBooks.rowAtPoint(e.getPoint()); // Obtenemos la fila donde se hizo clic
                int columna = tableBooks.columnAtPoint(e.getPoint()); // Obtenemos la columna donde se hizo clic
                if (fila > -1 && columna > -1) { // Verificamos que se haya hecho clic dentro de la tabla
                    //Object valor = tableBooks.getValueAt(fila, columna); // Obtenemos el valor de la celda donde se hizo clic
                    if (columna == 8) {
                        int respuesta = JOptionPane.showConfirmDialog(
                                null, "¿Está seguro que desea guardar?",
                                "Confirmación", JOptionPane.YES_NO_OPTION);
                        if (respuesta == JOptionPane.YES_OPTION) {
                            Object[] filaSeleccionada = new Object[tableBooks.getColumnCount()];
                            //Object ID = tableBooks.getValueAt(fila, 0);
                            for (int i = 0; i < tableBooks.getColumnCount(); i++) {
                                filaSeleccionada[i] = tableBooks.getValueAt(fila, i);
                            }
                            UpdateInfo(filaSeleccionada);
                        }
                    }
                }
            }
        };
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMateria = new javax.swing.JTextField();
        txtNcopias = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtAuthor = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        btnAddBook = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblcategoria = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLibroEstudiante = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        btnSearchBooks = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        txtCedula = new javax.swing.JTextField();
        txtNameEst = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBuscarEst = new javax.swing.JButton();
        txtSurname = new javax.swing.JTextField();
        btnAddBook1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEstBooks = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBookCod = new javax.swing.JTextField();
        btnReserve = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableBooks1 = new javax.swing.JTable();
        btnSearchBooks1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAddBook.setText("Añadir");
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Autor");

        jLabel4.setText("Editorial");

        jLabel5.setText("Materia");

        jLabel6.setText("Número de copias");

        lblcategoria.setText("Categoría");

        jLabel7.setText("Año de publicación");

        txtLibroEstudiante.setColumns(20);
        txtLibroEstudiante.setRows(5);
        txtLibroEstudiante.setEnabled(false);
        jScrollPane2.setViewportView(txtLibroEstudiante);

        jLabel8.setText("Estudiantes con el libro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnAddBook)
                .addContainerGap(580, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblcategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtAuthor)
                            .addComponent(txtEditorial)
                            .addComponent(txtMateria)
                            .addComponent(txtNcopias)
                            .addComponent(txtCategory)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btnAddBook))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNcopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcategoria))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Busqueda/Añdir", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setText("Categoria");
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 98, -1));

        jRadioButton2.setText("Nombre");
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 98, -1));

        tableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Autor", "Categoria", "Editoria", "Año", "Número de copias", "Materia", "Acción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBooks);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1020, 440));

        btnSearchBooks.setText("Buscar");
        btnSearchBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBooksActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearchBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jTabbedPane2.addTab("Inventario", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Libros", jPanel1);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 23, 170, -1));
        jPanel5.add(txtNameEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 196, -1));

        jLabel9.setText("Cédula");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 26, 50, -1));

        btnBuscarEst.setText("Buscar");
        btnBuscarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 23, -1, -1));
        jPanel5.add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 196, -1));

        btnAddBook1.setText("Añadir");
        btnAddBook1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBook1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnAddBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 23, -1, -1));

        jLabel10.setText("Nombre");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 84, 84, -1));

        jLabel11.setText("Apellido");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 136, 84, -1));

        txtEstBooks.setColumns(20);
        txtEstBooks.setRows(5);
        txtEstBooks.setEnabled(false);
        jScrollPane3.setViewportView(txtEstBooks);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 112, 358, 343));

        jLabel16.setText("Libros reservados");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 84, 148, -1));

        jLabel12.setText("Cod Libro");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 192, 84, -1));
        jPanel5.add(txtBookCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 196, -1));

        btnReserve.setText("Reservar");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });
        jPanel5.add(btnReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        btnReturn.setText("Devolver");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel5.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jTabbedPane3.addTab("Busqueda/Añdir", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton3.setText("Categoria");
        jPanel6.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 98, -1));

        jRadioButton4.setText("Nombre");
        jPanel6.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 98, -1));

        tableBooks1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Autor", "Categoria", "Editoria", "Año", "Número de copias", "Materia", "Acción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableBooks1);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1020, 440));

        btnSearchBooks1.setText("Buscar");
        btnSearchBooks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBooks1ActionPerformed(evt);
            }
        });
        jPanel6.add(btnSearchBooks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jTabbedPane3.addTab("Inventario", jPanel6);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane1.addTab("Estudiante", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Book searchBook = lib.SearchBook(txtID.getText());
        if (searchBook != null) {
            txtName.setText(searchBook.getName());
            txtAuthor.setText(searchBook.getAuthor());
            txtCategory.setText(searchBook.getCategory());
            txtEditorial.setText(searchBook.getEditorial());
            txtMateria.setText(searchBook.getMateria());
            txtNcopias.setText(searchBook.getNcopy() + "");
            txtYear.setText(searchBook.getYear_edition() + "");

            ArrayList<Student> studentByBook = lib.SearchStudentsByBooks(txtID.getText());
            String c = "";
            if (studentByBook != null) {
                for (Student studentBook : studentByBook) {
                    if (studentBook != null) {
                        c += studentBook.stringData();
                    }
                }
            }
            txtLibroEstudiante.setText(c);
        } else
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSearchBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBooksActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tableBooks.getModel();
        tableBooks.removeMouseListener(panelOptiosTableBooks);
//        model.setRowCount(0);
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Book book : lib.getBooks()) {
            if (book != null) {
                Object[] fila = {
                    book.getCode(), book.getName(), book.getAuthor(), book.getCategory(),
                    book.getEditorial(), book.getYear_edition(), book.getNcopy(), book.getMateria(), "Guardar"
                };
                model.addRow(fila);

            }
        }
        tableBooks.addMouseListener(panelOptiosTableBooks);
    }//GEN-LAST:event_btnSearchBooksActionPerformed

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        // TODO add your handling code here:
        String ID = txtID.getText();
        if (lib.getIndexBook(ID) == -1) {
            String name = txtName.getText();
            String author = txtAuthor.getText();
            String category = txtCategory.getText();
            String editorial = txtEditorial.getText();
            int year = Integer.parseInt(txtYear.getText());
            int ncopy = Integer.parseInt(txtNcopias.getText());
            String materia = txtMateria.getText();
            Book new_book = new Book(category, ID, name, author, editorial, materia, year, ncopy);
            lib.Insert(new_book);
            JOptionPane.showMessageDialog(null, "Libro añadido correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Libro ya existente");
        }
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void btnBuscarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstActionPerformed
        // TODO add your handling code here:
        try {
            estudent = lib.SearchStudent(txtCedula.getText());
            txtNameEst.setText(estudent.getName());
            txtSurname.setText(estudent.getSurname());
            
            String s = "";
            for (int i = 0; i < estudent.getBooks_student().size(); i++) {
                if(estudent.getBooks_student().get(i) != null)
                    s+="[\n"+estudent.getBooks_student().get(i).toString()+"\n]\n";
            }   
            txtEstBooks.setText(s);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
            txtNameEst.setText("");
            txtSurname.setText("");
            txtEstBooks.setText("");
        }
        
        
    }//GEN-LAST:event_btnBuscarEstActionPerformed

    private void btnAddBook1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBook1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddBook1ActionPerformed

    private void btnSearchBooks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBooks1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchBooks1ActionPerformed

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        // TODO add your handling code here:
        try {
            Book auxBook = lib.SearchBook(txtBookCod.getText());
            if(lib.Reserve(estudent, auxBook))
                JOptionPane.showMessageDialog(null, "Libro reservado");
            else
                JOptionPane.showMessageDialog(null, "Libro no reservado");
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR");
        }
    }//GEN-LAST:event_btnReserveActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        try {
            Book b = lib.SearchBook(txtBookCod.getText());
            if(estudent.ReturnBook(b) == true)
                JOptionPane.showMessageDialog(null, "Libro devuelto");
            else
                JOptionPane.showMessageDialog(null, "ERROR");
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }//GEN-LAST:event_btnReturnActionPerformed
    private void UpdateInfo(Object[] fila) {
        try {
            String ID = fila[0].toString();
            String name = fila[1].toString();
            String author = fila[2].toString();
            String category = fila[3].toString();
            String editorial = fila[4].toString();
            int year = Integer.parseInt(fila[5].toString());
            int ncopy = Integer.parseInt(fila[6].toString());
            String materia = fila[7].toString();

            Book b = new Book(category, ID, name, author, editorial, materia, year, ncopy);
            lib.ModifyBook(ID, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI().setVisible(true);
//            }
//        });
//    }
    //Mis atributos
    private Library lib;
    private MouseAdapter panelOptiosTableBooks;
    private Student estudent;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddBook1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarEst;
    private javax.swing.JButton btnReserve;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearchBooks;
    private javax.swing.JButton btnSearchBooks1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JTable tableBooks;
    private javax.swing.JTable tableBooks1;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookCod;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextArea txtEstBooks;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtLibroEstudiante;
    private javax.swing.JTextField txtMateria;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNameEst;
    private javax.swing.JTextField txtNcopias;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
