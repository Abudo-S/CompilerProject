/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import project3.scanner;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import project3.chars;
import project3.preprocessing;
import project3.scanner;

import java.io.*;
import java.util.List;
/**
 *
 * @author Dell
 */
public class dashboard extends javax.swing.JFrame implements KeyListener{

    /**
     * Creates new form dashboard
     */
    public Set<String> keywords=new HashSet<>();
   // public List<String>messages=new ArrayList<String>();
    public ArrayList<Integer> error_lines;
    AutoComplete auto ;
    Pattern pt=Pattern.compile("([a-zA-Z]([a-zA-Z]|[1-9])*)");
    Matcher m;  
    Output out;
    public dashboard() {       
        initComponents();  
        this.error_lines=new ArrayList<>();
        out=new Output();
    }
   /* @Override
      public void paint( Graphics g){
          try{
              g.setColor(Color.RED);
              for (Integer error_line : this.error_lines) {
                   g.drawString("Error->", 10,error_line*2);
              }
          }catch(Exception e){
              System.out.println(e+" paint");
          }
      }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        editor = new javax.swing.JTextArea();
        scan = new javax.swing.JButton();
        parse = new javax.swing.JButton();
        compile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Errors = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(50, 63, 65));
        setResizable(false);

        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        editor.setBackground(new java.awt.Color(51, 51, 51));
        editor.setColumns(20);
        editor.setForeground(new java.awt.Color(250, 250, 250));
        editor.setRows(5);
        editor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editorKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(editor);

        scan.setText("Scan");
        scan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanActionPerformed(evt);
            }
        });

        parse.setText("Parse");
        parse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parseActionPerformed(evt);
            }
        });

        compile.setText("Compile");

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));

        Errors.setEditable(false);
        Errors.setBackground(new java.awt.Color(51, 51, 51));
        Errors.setColumns(20);
        Errors.setForeground(new java.awt.Color(255, 0, 0));
        Errors.setRows(5);
        jScrollPane2.setViewportView(Errors);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(compile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(parse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(browse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(browse)
                .addGap(100, 100, 100)
                .addComponent(scan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(parse)
                .addGap(99, 99, 99)
                .addComponent(compile)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanActionPerformed
        // TODO add your handling code here:
        //We need to fill the ArrayList first------------------
       
    	this.editor.setEditable(false);
    	char[] c = new char[this.editor.getText().toCharArray().length];
    	c = this.editor.getText().toCharArray();
    	preprocessing pre=new preprocessing(c);
    	String[] st = pre.Processing(this);
        this.out.add_to_output(st);
    	out.setVisible(true);
        this.error_marker();
    }//GEN-LAST:event_scanActionPerformed

    private void editorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editorKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_editorKeyTyped

    private void editorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editorKeyPressed
        // TODO add your handling code here:
        //System.out.println(evt.getKeyCode());
        if(evt.getKeyCode()==17){ //Ctrl KeyCode
            m=pt.matcher(editor.getText());
            while (m.find( )) {
               String keyword= m.group(0);
              if(!keyword.equals("Ipok")&&!keyword.equals("Sipok")&&!keyword.equals("Ipokf")&&!keyword.equals("Sipokf")&&!keyword.equals("Craf")&&!keyword.equals("Valueless")&&!keyword.equals("Sequence")&&!keyword.equals("Rational")&&!keyword.equals("Type"))
               keywords.add(keyword);   
            }
            if(auto!=null){
                auto.setVisible(false);
            }
            auto=new AutoComplete(this);
            auto.setVisible(true);
        }
    }//GEN-LAST:event_editorKeyPressed

    private void parseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parseActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
    	JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text/java files", "txt","java");
		chooser.setFileFilter(filter);
		int returnValue = chooser.showOpenDialog(null);
		try{
			if (returnValue == JFileChooser.APPROVE_OPTION) {
    			FileReader fr = new FileReader(chooser.getSelectedFile());
    			Scanner sc = new Scanner(chooser.getSelectedFile());
    			if (sc != null) {
    				char[] code = new char[sc.nextLine().length()+1]; 
    				fr.read(code);
    				code[code.length - 1] = '.';
    				preprocessing pre = new preprocessing(code);
    				String[] st = pre.Processing(this);
    				this.out.add_to_output(st);
    		    	out.setVisible(true);

				}
    		}
		}catch(FileNotFoundException ex){
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//GEN-LAST:event_browseActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }
    
    public void append_to_editor(String str){
        this.editor.append(" "+str);
    }
    
    public void error_marker(){
       for(Integer i:this.error_lines){
           for(int j=1;j<i;j++){
               this.Errors.append("\n");
           }
           this.Errors.append("E");
       }
    }
    
    public void set_error_lines(int[] x){
        for(int i=0;i<x.length;i++){
            if(x[i]==0){
                break;
            }
            this.error_lines.add(x[i]);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Errors;
    private javax.swing.JButton browse;
    private javax.swing.JButton compile;
    private javax.swing.JTextArea editor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton parse;
    private javax.swing.JButton scan;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
