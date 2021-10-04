/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TM_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Maquina_Turing extends javax.swing.JFrame {
    boolean lleno = false;
  JFileChooser seleccionar = new JFileChooser(); //Elegiar el archivo
      File archivo; 
       FileInputStream entrada;                        //Declaracion de la variable entrada de tipo FileInputStream
       FileOutputStream salida;     //Declaracion de la variable salida de tipo FileOutputStream
       public String lector;//Variable usada para leer el archivo
       int text_pos=0;
       public String alfabeto[];
       String cinta[];
       int estados;
       int finales[];
       String transiciones[][];
       String vacio[];
       String cadena[];
    /**
     * Creates new form Maquina_Turing
     */
    public Maquina_Turing() {
        initComponents();
        this.setTitle("Maquina de Turing");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_alfabeto = new javax.swing.JTextField();
        txt_estados = new javax.swing.JTextField();
        txt_cinta = new javax.swing.JTextField();
        txt_vacio = new javax.swing.JTextField();
        txt_finales = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_transiciones = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_final = new javax.swing.JTextField();
        txt_resultado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_movimiento = new javax.swing.JTextArea();
        btn_verificar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_Abrir = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_cadena = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_errores = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Alfabeto (Σ): ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Estados (Q):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Simbolos de la Cinta (Γ):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Simbolo Vacio (β):");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Estados Finales (F):");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Transiciones: ");

        txt_transiciones.setColumns(20);
        txt_transiciones.setRows(5);
        jScrollPane1.setViewportView(txt_transiciones);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Estado_Termino:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Aceptacion/Rechazo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Movimiento:");

        txt_movimiento.setColumns(20);
        txt_movimiento.setRows(5);
        jScrollPane2.setViewportView(txt_movimiento);

        btn_verificar.setText("Verificar");
        btn_verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verificarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");

        btn_Abrir.setText("Abrir");
        btn_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AbrirActionPerformed(evt);
            }
        });

        btn_guardar.setText("Guardar");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Cadena:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Errores:");

        txt_errores.setColumns(20);
        txt_errores.setRows(5);
        jScrollPane3.setViewportView(txt_errores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(70, 70, 70)
                                .addComponent(txt_estados, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_cinta, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(txt_alfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Abrir)
                                    .addComponent(btn_guardar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_finales, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel7)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_final, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cadena, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(42, 42, 42)
                        .addComponent(txt_vacio, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btn_verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_alfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_estados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_cinta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_vacio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btn_Abrir)
                        .addGap(40, 40, 40)
                        .addComponent(btn_guardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_finales, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_cadena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_final, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(89, 89, 89))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         private boolean Lleno(){//Verifica si hay informacio en el txt_field desde alfabeto hasta cadena
        if(txt_alfabeto.getText().isEmpty()||txt_estados.getText().isEmpty()||txt_finales.getText().isEmpty()||txt_transiciones.getText().isEmpty()||txt_cadena.getText().isEmpty()||txt_cinta.getText().isEmpty()||txt_vacio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debe llenar los campos faltantes","ERROR",JOptionPane.ERROR_MESSAGE); //Si esra vacio marcara este mensaje
            lleno = false;
        }else{
            lleno=true; //En caso contrario no pasa nada
        }
        return lleno;//Retorna un booleano
    }
    private void btn_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AbrirActionPerformed
              try {
         this.CargarArchivo();
     } catch (IOException ex) {
         Logger.getLogger(Maquina_Turing.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_btn_AbrirActionPerformed
   private boolean Se_Repite(String array[]){
        boolean se_repite=false;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                 if(array[i].equals(array[j])){
                     se_repite=true;
                 }
            }
        }
     return se_repite;   
   }
   
   private void Ingresar_Vacio(){
       vacio = txt_vacio.getText().split("");
   }
    
    private void btn_verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verificarActionPerformed
        if(this.Lleno()==false){//Verifica si hay informacio en el txt_field desde alfabeto hasta cadena
            
        }else{//En caso contrario ejecutara estos metodos
            this.Ingresar_Alfabeto(txt_alfabeto.getText().split(","));//Ingresa como parametro lo escrito en el txt_alfabeto y lo separa por comas
            this.IngresarEstado();//Ingresa los estados que tendra la maquina
            this.Ingresar_Cinta(txt_cinta.getText().split(","));//Ingresa como parametro lo escrito en el txt_cinta y lo separa por comas
            this.Ingresar_Vacio();//Ingresa el simbolo de vacio
            this.Ingresar_EstadosFinales(txt_finales.getText().split(","));//Ingresa como parametro lo escrito en el txt_finales y lo separa por comas
            this.Transiciones();//Ingresa las transiciones en txt_transiciones
        }
    }//GEN-LAST:event_btn_verificarActionPerformed
    private void Ingresar_Cadena(){
        String temporal[] = txt_cadena.getText().split("");
        String temporal2[] = txt_vacio.getText().split("");
        int pos=0;
       // cadena = new String[txt_cadena.getText().split("").length+2];
        
        
        if(this.Comparar_Cadena_Alfabeto(temporal)==true){
               txt_errores.append("Hay valores de la cadena que no pertencen al alfabeto"+System.getProperty("line.separator"));
        }else{
            cadena = new String[temporal.length+2];
             for(int i=0;i<temporal.length+2;i++){
                 if(i==0 || i==cadena.length-1){
                     cadena[i] = temporal2[0];
                 }
                 else{
                     cadena[i]= temporal[pos];
                     pos++;
                 }
              
             }
             
        
           
            this.RecorrerTransiciones();
           
        }
    }
    
 private void MostrarCadena(){
        for (String cadena1 : cadena) {
            System.out.println(cadena1);
        }
 }
    
    private void RecorrerTransiciones(){
        int pos_fila=0;
        int pos_col=0;
        int pos_cinta=0;
        int pos_cadena=1;
        String status = "d";
        String comparar = null;
        boolean aceptacion = false;
        
        while(status.equals("d")||status.equals("i")){
           
          while(true){
               comparar= cinta[pos_cinta];
              if(cadena[pos_cadena].equals(comparar)){
                  //JOptionPane.showMessageDialog(null,"Es igual "+cadena[pos_cadena]+" a "+comparar);
                  break;
              }else{
                            //JOptionPane.showMessageDialog(null,"Es diferente "+cadena[pos_cadena]+" a "+comparar);
                pos_cinta++;   
              }
              //status ="s";
          }
            pos_col=pos_cinta;
            pos_cinta=0;
            txt_movimiento.append("Letra leida: "+cadena[pos_cadena]+
                    "\nEstado Actual: q"+pos_fila);
            
              cadena[pos_cadena]=String.valueOf(transiciones[pos_fila][pos_col].charAt(3));
         
              status = String.valueOf(transiciones[pos_fila][pos_col].charAt(5));
            
              pos_fila = Integer.parseInt(String.valueOf(transiciones[pos_fila][pos_col].charAt(1)));
          
              
              txt_movimiento.append("\nCambio Valor a: "+cadena[pos_cadena]+
                      "\nMe muevo hacia la : "+status+
                      "\nTransiciono a q:"+pos_fila+"\n"+System.getProperty("line.separator"));
              
              if(status.equals("d")){
                  pos_cadena++;
              }else if(status.equals("i")){
                  pos_cadena--;
              }
 
           
        }
        
     //this.MostrarCadena();
    }
   
    
    
 
    
    
    public boolean Comparar_Cadena_Alfabeto(String array[]){
        boolean existe=false;
        int pos=0;
        int errores=0;
        for(int i=0;i<array.length;i++){
            
            while(pos!=alfabeto.length){
                if(array[i].equals(alfabeto[pos])){
                    errores=0;
                    break;
                }else{
                    pos++;
                    errores++;
                }
                
                
            }
            if(errores==alfabeto.length){
                existe = true;
                break;
            }
            
            pos=0;
        }
        return existe;
    }
    
    
    private void Transiciones(){
        try{
            int pos=0;
            transiciones = new String[estados][cinta.length];
            int i=0,j=0;
            String temporal [] = txt_transiciones.getText().split("\n|}+,");
           
         for(i=0;i<estados;i++){
             for(j=0;j<cinta.length;j++){
                 transiciones[i][j] = temporal[pos];
                 pos++;
                // JOptionPane.showMessageDialog(null, transiciones[i][j]);
             }
         }
            this.Ingresar_Cadena();
        }catch(java.lang.ArrayIndexOutOfBoundsException ex){
             txt_errores.append("El tamaño de la matriz esta incorrecta. Verifique"+System.getProperty("line.separator"));
        
        }
    }
    
    public void Ingresar_EstadosFinales(String states_final[]){
      if(this.Se_Repite(states_final)==true){
            txt_errores.append("Se repite estados finales"+System.getProperty("line.separator"));
        }else if(states_final.length>=estados){
             txt_errores.append("Esta mal escrito los estados finales"+System.getProperty("line.separator"));
        }
        else{
             finales = new int[states_final.length];
        for(int i=0;i<finales.length;i++){
              //estado_finales[i] = Integer.parseInt(states_final[i]);
              //finales[i] = Integer.parseInt(states_final[i]);
              
              if(finales[i]>=estados || finales[i]<0){
                  txt_errores.append("Esta mal escrito los estados finales"+System.getProperty("line.separator"));
                  break;
              }
              //JOptionPane.showMessageDialog(null, estado_finales[i]);
        }
        }
        
    }
    private boolean Comparar_Cinta_Alfabeto(String array[]){
         boolean se_repite=false;
         int index=0;
         int contador=0;
         for(int i=0;i<array.length;i++){
             while(index!=alfabeto.length){
                 if(array[i].equals(alfabeto[index])){
                     contador++;
                     break;
                 }else{
                     index++;
                 }
             }
         }
         
         if(contador!=alfabeto.length){
             se_repite=true;
         }
         return se_repite;
    }
    private void Ingresar_Alfabeto(String alfa[]){
          if(this.Se_Repite(alfa)==true){
             txt_errores.append("Se repite el alfabeto"+System.getProperty("line.separator"));
             
         }else{
             alfabeto = alfa;
           
         }
    }
    private void IngresarEstado(){
        try{
              estados = Integer.parseInt(txt_estados.getText());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Debe ser un  numero");
        }
      
    }
    private void Ingresar_Cinta(String cint[]){
        if(this.Se_Repite(cint)==true){
             txt_errores.append("Se repite la cinta"+System.getProperty("line.separator"));
       
             if(this.Comparar_Cinta_Alfabeto(cint)==true){
          
                  txt_errores.append("Falta agregar valores de alfabeto a la cinta"+System.getProperty("line.separator"));
             
            }
        
             
        } 
        else{
            cinta=cint;
        }
    }
    
      private void CargarArchivo() throws IOException{
         if(seleccionar.showDialog(null,"Abrir")==JFileChooser.APPROVE_OPTION){
             archivo =seleccionar.getSelectedFile(); //Escoger archivo
             
          if(archivo.canRead()){
              if(archivo.getName().endsWith("txt")){
                  String documento = this.AbrirArchivo(archivo);
                  try{
                       FileReader f = new FileReader(archivo);
                  BufferedReader br = new BufferedReader(f);
                  
                  
                  
                      while((lector=br.readLine())!=null) {//Segguira leyendo siemore y cuando haya letras en cada linea
                          text_pos++;
                          
                          if(text_pos==1){
                              txt_alfabeto.setText(lector);//Acomodar la 1ra linea en el caja de texto de alfabeto
                          } if(text_pos==2){
                              txt_estados.setText(lector);//Acomodar la 2da linea en el caja de texto de estados
                          }if(text_pos==3){
                              txt_cinta.setText(lector);//Acomodar la 3ra linea en el caja de texto de estados finales
                          }if(text_pos==4){//Acomodar la 4ta linea en el caja de texto de transicion
                              txt_vacio.setText(lector+"\n");
                          }if(text_pos==5){
                               txt_finales.setText(lector+"\n");
                          }if(text_pos>5){
                              txt_transiciones.append(lector+"\n");
                          }
                          
                      }
                  }catch(FileNotFoundException ex){
                      
                  }
              }else{
                  JOptionPane.showMessageDialog(null,"Archivo no Compatible","ERROR",JOptionPane.ERROR);  
              }
          }
         }
    }
      
          private String AbrirArchivo(File archivo){
        String documento="";                        //Declaracion de la variable documento de tipo String, la cual esta vacia
        try{                                        //Inicia el try/catch
            entrada = new FileInputStream(archivo); //Se asigna a la variable entrada una nueva funcion con el que recibira el parametro archivo
            int ascci;                              //Se declara la variable ascci de tipo entero
            while((ascci=entrada.read())!=-1){      //Inicia el while, con la condicion de que si la variable ascci equivale a la entrada con la funcion "read la cual se compara si es diferente/igual a menos 1"
                char caracter = (char)ascci;        //Se declara la variable caracter de tipo "char" la cual se le pasa el valor de la variable ascci
            documento+=caracter;                    //Se concatena la variable documento de tipo string a la variable caracter de tipo char
            }                                       //Finaliza el try
       
        }catch (Exception ex){                      //Comienza el catch con la excepcion "ex"
        }                                           //Finaliza el catch
        return documento;                           //Retorna la variable documento de tipo String
    }
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
            java.util.logging.Logger.getLogger(Maquina_Turing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maquina_Turing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maquina_Turing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maquina_Turing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maquina_Turing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Abrir;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txt_alfabeto;
    private javax.swing.JTextField txt_cadena;
    private javax.swing.JTextField txt_cinta;
    private javax.swing.JTextArea txt_errores;
    private javax.swing.JTextField txt_estados;
    private javax.swing.JTextField txt_final;
    private javax.swing.JTextField txt_finales;
    private javax.swing.JTextArea txt_movimiento;
    private javax.swing.JTextField txt_resultado;
    private javax.swing.JTextArea txt_transiciones;
    private javax.swing.JTextField txt_vacio;
    // End of variables declaration//GEN-END:variables
}
