/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.p03;

import com.mycompany.p03.MyList.Node;
import java.awt.GridLayout;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ConoMaster
 */
public class InterfazGrafica extends javax.swing.JFrame {

    MyList lista = new MyList();
    MyList listaFiltrada = new MyList();
    String fechaFiltrada;
    //Ahora en el boton aplicar, tengo que clonar la lista que esta alli (aux) a esta
    
    
    //PARA EL FILTRO, CREAR UNA SEGUNDA LISTA Y PASARLE LOS DATOS DE LA PRIMERA LISTA CON UN METODO QUE CLONE
    //Y LUEGO BORRAR LOS ELEMENTOS QUE NO TENGAN LA FECHA FILTRADA PARA LUEGO PODER INTERACTUAR CON ESA LISTA.
    
    //creacion de controladores
    boolean controladorModificar = false;
    boolean controladorCrear = false;
    boolean controladorFiltro = false;
    //ArrayList<Empleado> empleadosFiltrados = new ArrayList();
    Empleado aux;
        
    public InterfazGrafica() {
        initComponents();
        
        lista.add(new Empleado( "Pablo", 1, 2, 1997, "Gomez", "3248234N"));
        lista.add(new Empleado("jose", 1, 7, 1996, "Martinez", "3248234N"));
        lista.add(new Empleado("luis", 1, 9, 1997, "Rodolfin", "3248234N"));
        lista.add(new Empleado("Davilito", 1, 8, 1996, "Martinez", "32323232A"));
        lista.add(new Empleado( "Rodolfo", 1, 7, 2000, "Gomez", "3248234N"));
        lista.add(new Empleado("Luis Miguel", 1, 10, 1996, "Martinez", "3248234N"));
        
        
        mostrarDatosPrimero(0);
        activarDesactivarEdicion(false);
        
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCrear = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numeroField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        apellidoField = new javax.swing.JTextField();
        dniField = new javax.swing.JTextField();
        fechaDia = new javax.swing.JTextField();
        fechaMes = new javax.swing.JTextField();
        fechaAnio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botonAplicar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        filtroField = new javax.swing.JTextField();
        botonBorrarFiltro = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        botonAtras = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCrear.setText("Crear");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonBorrar.setText("Eliminar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCrear)
                .addGap(136, 136, 136)
                .addComponent(botonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonBorrar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrear)
                    .addComponent(botonModificar)
                    .addComponent(botonBorrar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel1.setText("Numero :");

        jLabel2.setText("Nombre :");

        jLabel3.setText("Apellidos :");

        jLabel4.setText("DNI :");

        jLabel5.setText("Fecha Ingreso:");

        numeroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroFieldActionPerformed(evt);
            }
        });

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Dia");

        jLabel7.setText("Mes");

        jLabel8.setText("Año");

        botonAplicar.setText("Aplicar");
        botonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAplicarActionPerformed(evt);
            }
        });

        jLabel9.setText("Filtro");

        filtroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroFieldActionPerformed(evt);
            }
        });

        botonBorrarFiltro.setText("Borrar Filtro");
        botonBorrarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dniField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(apellidoField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7))
                            .addComponent(fechaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaAnio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(22, 22, 22)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(filtroField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAplicar))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(botonBorrarFiltro)
                                .addGap(16, 16, 16))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(numeroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apellidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAplicar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dniField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrarFiltro))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)))
        );

        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAtras)
                    .addComponent(botonSiguiente))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        
        controladorCrear = true;
        vaciarDatos();
        botonModificar.setEnabled(false);
        botonBorrar.setEnabled(false);
        botonAplicar.setEnabled(false);
        botonBorrarFiltro.setEnabled(false);
        botonAtras.setEnabled(true);
        botonSiguiente.setEnabled(true);
        numeroField.setEnabled(false);
        filtroField.setEnabled(false);
        activarDesactivarEdicion(controladorCrear);
        
    }//GEN-LAST:event_botonCrearActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        
        //Si no se ha pulsado el boton crear se hace esto
        if(controladorModificar == false && controladorCrear == false){
            botonSiguiente.setEnabled(true);
             aux=(Empleado)lista.getActualNode().getMain();
            
            lista.previousNode();
            if(lista.isLast()){
                botonAtras.setEnabled(false);
                mostrarDatos(0);
                
            }
                
                
                mostrarDatos(0);
                 
        }else if (controladorModificar == true){
            controladorModificar = false;
            botonCrear.setEnabled(true);
            botonBorrar.setEnabled(true);
            
            mostrarDatos(0);
            numeroField.setEnabled(true);
            
            //UTILIZO ESTE CONTROLADOR PARA DESACTIVAR EL BOTON DE ATRAS CUANDO ES EL PRIMERO Y EL DE SIGUIENTE CUANDO ES EL ULTIMO
            if(lista.isLast()){
                botonAtras.setEnabled(false);
            }else if(lista.isFirst()){
                botonSiguiente.setEnabled(false);
            }
            
        }else if(controladorCrear == true){
            controladorCrear = false;
            botonModificar.setEnabled(true);
            botonBorrar.setEnabled(true);
            botonAplicar.setEnabled(true);
            botonBorrarFiltro.setEnabled(true);
            numeroField.setEnabled(true);
            filtroField.setEnabled(true);
            activarDesactivarEdicion(controladorCrear);
            
            mostrarDatos(0);
            numeroField.setEnabled(true);
        }
        
        
        else{
            
        }
        
        
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void numeroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroFieldActionPerformed
        
    }//GEN-LAST:event_numeroFieldActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        
        //aux = (Empleado)lista.getActualNode().getMain();
        if(controladorModificar == false && controladorCrear == false){
            if(controladorFiltro == false){
                
        //siempre que pulse el boton siguiente vuelve a activar el boton atras
        //asi nunca hay bugs
        
                botonAtras.setEnabled(true);
                lista.nextNode();

                mostrarDatos(0); 
                if(lista.isFirst()){
            //muestro los datos del ultimo empleado y luego desactivo el boton

                botonSiguiente.setEnabled(false);
                mostrarDatos(0);
                }

            }else{
                /*//EXTRAER LOS EMPLEADOS FILTRADOS DEL ARRAYLIST DE EMPLEADOS
                //desactivar todos los botones menos siguiente y atras
                botonCrear.setEnabled(false);
                botonModificar.setEnabled(false);
                botonBorrar.setEnabled(false);
                
                
                //desactivamos la edicion de texto por si se habia activado anteriormente
                activarDesactivarEdicion(controladorFiltro);
                
                //Mostramos el primer elemento de la lista
                listaFiltrada.nextNode();
                mostrarDatos(2);
                */
                
                //comenzamos en el primer empleado cuando pulsamos en aplicar y ahora aqui buscamos el empleado que tenga la misma fecha
                
                aux = (Empleado)lista.getActualNode().getMain();
                while(!aux.getFechaAlta().toString().equalsIgnoreCase(fechaFiltrada)){                                        
                    if(!aux.getFechaAlta().toString().equalsIgnoreCase(fechaFiltrada)){
                        botonSiguiente.setEnabled(false);                    
                    }
                    lista.nextNode();
                }
                mostrarDatos(0);
                
                    
            }
        }else if(controladorModificar == true)
        {
            
            
            if(nombreField.getText().isBlank() 
                    || apellidoField.getText().isBlank()
                    || dniField.getText().isBlank()){
                //muestra popup de error
                JOptionPane.showMessageDialog(null, "Error, debe rellenar todos los datos para modificar con exito");
                mostrarDatosPrimero(0);
                controladorModificar = false;
            }else
            {
                //En la opcion modificar, funciona solo si modificas todos los datos
                aux.setNombre(nombreField.getText());
                aux.setApellidos(apellidoField.getText());
                aux.setDni(dniField.getText());
                lista.getActualNode().setMain(aux);
                mostrarDatos(0);
            }
            controladorModificar = false;
            
            
            botonCrear.setEnabled(true);
            botonBorrar.setEnabled(true);
            numeroField.setEnabled(true);
            filtroField.setEnabled(true);
            botonAplicar.setEnabled(true);
            botonBorrarFiltro.setEnabled(true);
            
        }else if(controladorCrear == true){
            //desactivamos la edicion de texto
            activarDesactivarEdicion(controladorCrear);
            //cambiamos el controlador a false
            controladorCrear = false;
            
            
            if(nombreField.getText().isBlank() || apellidoField.getText().isBlank() || dniField.getText().isBlank() 
                    || fechaDia.getText().isBlank()
                    || fechaMes.getText().isBlank()
                    || fechaAnio.getText().isBlank())
            {
                JOptionPane.showMessageDialog(this, "Faltan datos, saliendo...");
                mostrarDatos(0);
                
            }else{
                int dia = Integer.parseInt(fechaDia.getText());
                int mes = Integer.parseInt(fechaMes.getText());
                int anio = Integer.parseInt(fechaAnio.getText());
                if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 1900 || anio > 2023){
                JOptionPane.showMessageDialog(this, "La fecha introducida es incorrecta, por favor, introduzca la fecha");
                mostrarDatos(0);
                }else{
                    lista.add(new Empleado(
                        nombreField.getText(),
                        dia,
                        mes,
                        anio,
                       apellidoField.getText(),
                        dniField.getText()));
                        mostrarDatosPrimero(0);
                }
            }
            

            botonAplicar.setEnabled(true);
            botonBorrarFiltro.setEnabled(true);
            botonCrear.setEnabled(true);
            botonBorrar.setEnabled(true);
            botonModificar.setEnabled(true);
            numeroField.setEnabled(true);
            filtroField.setEnabled(true);
            
        }
        
       
        
 
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        // TODO add your handling code here:
        controladorModificar = true;
        numeroField.setEnabled(false);
        botonCrear.setEnabled(false);
        botonBorrar.setEnabled(false);
        botonAplicar.setEnabled(false);
        botonBorrarFiltro.setEnabled(false);
        numeroField.setEnabled(false);
        filtroField.setEnabled(false);
        activarDesactivarEdicion(controladorModificar);
        
        //lo activo porque si el empleado es el primero o el ultimo estan desactivados
            botonAtras.setEnabled(true);
            botonSiguiente.setEnabled(true);
        
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        
        
        //creacion de un jframe
        JFrame panelCompleto = new JFrame();
        panelCompleto.setSize(300,150);
        //Creacion de JPanel
        JPanel panel = new JPanel();
        JPanel texto = new JPanel();
        JPanel botones = new JPanel();
        
        
        //Creacion de botones y label
        JButton buttonYes = new JButton("Si");
        JButton buttonNo = new JButton("No");
        JLabel label = new JLabel("¿Está seguro que desea eliminar a este usuario?");
        label.setBounds(10,20,200,30);
        


        
        texto.add(label);
        botones.add(buttonYes);
        botones.add(buttonNo);
        panel.add(texto);
        panel.add(botones);
        
        panelCompleto.add(panel);
        
        panelCompleto.pack();
        panelCompleto.setVisible(true);

        buttonYes.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                lista.removeElement(); 
                mostrarDatosPrimero(0);
                botonSiguiente.setEnabled(true);
                JOptionPane.showMessageDialog(panelCompleto, "Usuario eliminado con exito");
                panelCompleto.setVisible(false);
            }
        });
        
        buttonNo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCompleto.setVisible(false);
            }
        });// TODO add your handling code here:
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAplicarActionPerformed

        
        //boolean encontrado = false;
        if(filtroField.getText().isBlank()){
            controladorFiltro = false;
        }else{
            controladorFiltro = true;
            fechaFiltrada = filtroField.getText();
            
            boolean existeFecha = false;
            Empleado filtrado = (Empleado)lista.getLastNode().getMain();
                while(!filtrado.getFechaAlta().toString().equalsIgnoreCase(fechaFiltrada)){
                    lista.nextNode();
                    filtrado = (Empleado)lista.getActualNode().getMain();
                    
                }
            
                numeroField.setText("" + lista.getActualNode().getIndex());
                nombreField.setText(filtrado.getNombre());
                apellidoField.setText(filtrado.getApellidos());
                dniField.setText(filtrado.getDni());
                fechaDia.setText(""+filtrado.getFechaAlta().getDia());
                fechaMes.setText(""+filtrado.getFechaAlta().getMes());
                fechaAnio.setText(""+filtrado.getFechaAlta().getAnio());
                botonSiguiente.setEnabled(false);
                botonAtras.setEnabled(false);
                botonAplicar.setEnabled(false);
            
            
            
            
        }

    }//GEN-LAST:event_botonAplicarActionPerformed

    private void filtroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroFieldActionPerformed

        
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroFieldActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void botonBorrarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarFiltroActionPerformed
    
        botonAplicar.setEnabled(true);
        filtroField.setText("");
        controladorFiltro = false;
        botonSiguiente.setEnabled(true);
        botonAtras.setEnabled(true);
        mostrarDatos(0);
        if(lista.isLast()){
            botonAtras.setEnabled(false);
        }else if(lista.isFirst()){
           botonSiguiente.setEnabled(false);
        }
        
    }//GEN-LAST:event_botonBorrarFiltroActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }
    
    public void vaciarDatos(){
        numeroField.setText("");
        nombreField.setText("");
        apellidoField.setText("");
        dniField.setText("");
        fechaDia.setText("");
        fechaMes.setText("");
        fechaAnio.setText("");
    }
    
    public void mostrarDatos(int eleccion){
        
        if(eleccion == 0){
            aux = (Empleado)lista.getActualNode().getMain();
            numeroField.setText("" + lista.getActualNode().getIndex());
            nombreField.setText(aux.getNombre());
            apellidoField.setText(aux.getApellidos());
            dniField.setText(aux.getDni());
            fechaDia.setText(""+aux.getFechaAlta().getDia());
            fechaMes.setText(""+aux.getFechaAlta().getMes());
            fechaAnio.setText(""+aux.getFechaAlta().getAnio());
        }else{
            aux = (Empleado)listaFiltrada.getActualNode().getMain();
            numeroField.setText("" + listaFiltrada.getActualNode().getIndex());
            nombreField.setText(aux.getNombre());
            apellidoField.setText(aux.getApellidos());
            dniField.setText(aux.getDni());
            fechaDia.setText(""+aux.getFechaAlta().getDia());
            fechaMes.setText(""+aux.getFechaAlta().getMes());
            fechaAnio.setText(""+aux.getFechaAlta().getAnio());
        }
            
            
    }
    
    public void mostrarDatosPrimero(int eleccion){
        if(eleccion == 0){
            botonAtras.setEnabled(false);
            aux = (Empleado)lista.getLastNode().getMain();
            numeroField.setText("" + lista.getLastNode().getIndex());
            nombreField.setText(aux.getNombre());
            apellidoField.setText(aux.getApellidos());
            dniField.setText(aux.getDni());
            fechaDia.setText(""+aux.getFechaAlta().getDia());
            fechaMes.setText(""+aux.getFechaAlta().getMes());
            fechaAnio.setText(""+aux.getFechaAlta().getAnio());
            botonAtras.setEnabled(false);    
        }else{
            aux = (Empleado)listaFiltrada.getLastNode().getMain();
            numeroField.setText("" + listaFiltrada.getLastNode().getIndex());
            nombreField.setText(aux.getNombre());
            apellidoField.setText(aux.getApellidos());
            dniField.setText(aux.getDni());
            fechaDia.setText(""+aux.getFechaAlta().getDia());
            fechaMes.setText(""+aux.getFechaAlta().getMes());
            fechaAnio.setText(""+aux.getFechaAlta().getAnio());
            botonAtras.setEnabled(false);
        }
        
    }

    
    //Metodo para controlar si la caja de texto se edita o no dependiendo de si
    //El controlador de creacion o modificacion esta activado o desactivado
    public void activarDesactivarEdicion(boolean controlador){
        numeroField.setEditable(controlador);
        nombreField.setEditable(controlador);
        apellidoField.setEditable(controlador);
        dniField.setEditable(controlador);
        fechaDia.setEditable(controlador);
        fechaMes.setEditable(controlador);
        fechaAnio.setEditable(controlador);
    }
    
    public MyList filtrarLista(String fechaFiltrada){
        
        MyList l = new MyList();
    
        Empleado aux = (Empleado)lista.getFirstNode().getMain();
        for(int i = 0; i < lista.getContador(); i++){
            if(aux.getFechaAlta().toString().equalsIgnoreCase(fechaFiltrada)){
                l.add(aux);
            }
            lista.nextNode();
            aux = (Empleado)lista.getActualNode().getMain();
        }
        
        return l;
    }
    
    public void eliminarFiltro(String fecha){
        
        Empleado aux = (Empleado)listaFiltrada.getLastNode().getMain();
        while(!listaFiltrada.isFirst()){
            if(!aux.getFechaAlta().toString().equalsIgnoreCase(fecha)){
                listaFiltrada.removeElement();
            }
            lista.nextNode();
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoField;
    private javax.swing.JButton botonAplicar;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBorrarFiltro;
    private javax.swing.JButton botonCrear;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField dniField;
    private javax.swing.JTextField fechaAnio;
    private javax.swing.JTextField fechaDia;
    private javax.swing.JTextField fechaMes;
    private javax.swing.JTextField filtroField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField numeroField;
    // End of variables declaration//GEN-END:variables
}
