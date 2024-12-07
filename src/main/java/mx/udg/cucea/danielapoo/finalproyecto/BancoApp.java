/**
 * Programación Orientada a Objetos
 * Proyecto Final
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 14/11/2024
 **/

package mx.udg.cucea.danielapoo.finalproyecto;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BancoApp extends JFrame implements ActionListener{
    private int numCuenta = 218516977;
    private String nombre,apellido, correo, monto;
    private double saldoInicial, saldo, interes, saldoInteres, limiteCredito = 4000;
    private JLabel labelHola, label1, label2, labelRegistro, labelNombre, labelApellido, labelCorreo, labelSalInicial, labelBanco, 
                    labelSaldoD, labelSaldo, labelCuenta, labelNCuenta, labelCrTitulo, labelCredito, labelInTitulo, labelInteres, 
                    labelSalInteres, labelSalAhorro;
    private JButton btnRegistro, btnDepositar, btnRetirar, btnInteres, btnCredito, btnConsultar;
    private JTextField textNombre, textApellido, textCorreo, textSalInicial;
    private JFrame ventanaApp;
    ImageIcon iconoDeposito = new ImageIcon("imagenes/deposito.png");
    ImageIcon iconoRetiro = new ImageIcon("imagenes/retiroo.png");
    ImageIcon iconoInteres = new ImageIcon("imagenes/interes.png");
    
    public BancoApp() {
        setTitle("Registrio a BancoAPP");
        setMinimumSize(new Dimension(350, 600));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel0 = new JPanel();
        panel0.setLayout(null);
        getContentPane().add(panel0);
        
        labelBanco = new JLabel("   BancoApp");
        labelBanco.setOpaque(true);
        labelBanco.setBackground(new java.awt.Color(220, 220, 220));
        labelBanco.setFont(new java.awt.Font("sansserif", 2, 10));
        labelBanco.setBounds(1, 5, 400, 30);
        panel0.add(labelBanco);
        
        labelHola = new JLabel(" ¡Bienvenido, Usuario!");
        labelHola.setOpaque(true);
        labelHola.setBackground(new java.awt.Color(220, 220, 220));
        labelHola.setFont(new java.awt.Font("Malgun Gothic", 1, 18));
        labelHola.setBounds(1, 30, 400, 23);
        panel0.add(labelHola);
        
        label1 = new JLabel("");
        label1.setOpaque(true);
        label1.setBackground(new java.awt.Color(220, 220, 220));
        label1.setBounds(1, 40, 400, 30);
        panel0.add(label1);
        
        labelRegistro = new JLabel("Registro de usuario");
        labelRegistro.setFont(new java.awt.Font("sansserief", 1, 13));
        labelRegistro.setHorizontalAlignment(SwingConstants.CENTER);
        labelRegistro.setOpaque(true);
        labelRegistro.setBackground(Color.white);
        labelRegistro.setBounds(70, 100, 190, 23);
        panel0.add(labelRegistro);
        
        label2 = new JLabel("");
        label2.setOpaque(true);
        label2.setBackground(Color.white);
        label2.setBounds(70, 121, 190, 30);
        panel0.add(label2);
        
        labelNombre = new JLabel("Nombre");
        labelNombre.setFont(new java.awt.Font("sansserief", 2, 12));
        labelNombre.setHorizontalAlignment(SwingConstants.CENTER);
        labelNombre.setBounds(70, 145, 190, 23);
        labelNombre.setOpaque(true);
        labelNombre.setBackground(Color.white);
        panel0.add(labelNombre);
        
        textNombre = new JTextField();
        textNombre.setBounds(80, 168, 169, 23);
        textNombre.setHorizontalAlignment(SwingConstants.CENTER);
        panel0.add(textNombre);
        
        label2 = new JLabel("");
        label2.setOpaque(true);
        label2.setBackground(Color.white);
        label2.setBounds(70, 190, 190, 20);
        panel0.add(label2);
        
        labelApellido = new JLabel("Apellidos");
        labelApellido.setFont(new java.awt.Font("sansserief", 2, 12));
        labelApellido.setHorizontalAlignment(SwingConstants.CENTER);
        labelApellido.setBounds(70, 210, 190, 23);
        labelApellido.setOpaque(true);
        labelApellido.setBackground(Color.white);
        panel0.add(labelApellido);
        
        textApellido = new JTextField();
        textApellido.setBounds(80, 234, 169, 23);
        textApellido.setHorizontalAlignment(SwingConstants.CENTER);
        panel0.add(textApellido);
        
        label2 = new JLabel("");
        label2.setOpaque(true);
        label2.setBackground(Color.white);
        label2.setBounds(70, 257, 190, 20);
        panel0.add(label2);
        
        labelCorreo = new JLabel("Correo");
        labelCorreo.setFont(new java.awt.Font("sansserief", 2, 12));
        labelCorreo.setHorizontalAlignment(SwingConstants.CENTER);
        labelCorreo.setBounds(70, 277, 190, 23);
        labelCorreo.setOpaque(true);
        labelCorreo.setBackground(Color.white);
        panel0.add(labelCorreo);
        
        textCorreo = new JTextField();
        textCorreo.setBounds(80, 300, 169, 23);
        textCorreo.setHorizontalAlignment(SwingConstants.CENTER);
        panel0.add(textCorreo);
        
        label2 = new JLabel("");
        label2.setOpaque(true);
        label2.setBackground(Color.white);
        label2.setBounds(70, 323, 190, 20);
        panel0.add(label2);
        
        labelSalInicial = new JLabel("Saldo inicial");
        labelSalInicial.setFont(new java.awt.Font("sansserief", 2, 12));
        labelSalInicial.setHorizontalAlignment(SwingConstants.CENTER);
        labelSalInicial.setBounds(70, 343, 190, 23);
        labelSalInicial.setOpaque(true);
        labelSalInicial.setBackground(Color.white);
        panel0.add(labelSalInicial);
        
        textSalInicial = new JTextField();
        textSalInicial.setBounds(80, 367, 169, 23);
        textSalInicial.setHorizontalAlignment(SwingConstants.CENTER);
        panel0.add(textSalInicial);
        
        label2 = new JLabel("");
        label2.setOpaque(true);
        label2.setBackground(Color.white);
        label2.setBounds(70, 390, 190, 50);
        panel0.add(label2);
        
        btnRegistro = new JButton("Registrarse");
        btnRegistro.setHorizontalAlignment(SwingConstants.CENTER);
        btnRegistro.setBounds(50, 470, 230, 30);
        btnRegistro.setBackground(new java.awt.Color(225, 225, 242));
        btnRegistro.setForeground(new java.awt.Color(153, 153, 153));
        btnRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel0.add(btnRegistro);
        
        label2 = new JLabel("");
        label2.setOpaque(true);
        label2.setBackground(Color.white);
        label2.setBounds(70, 100, 10, 340);
        panel0.add(label2);
        
        label2 = new JLabel("");
        label2.setOpaque(true);
        label2.setBackground(Color.white);
        label2.setBounds(250, 100, 10, 340);
        panel0.add(label2);
        
        ActionListener oyenteDeAccion1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                nombre = textNombre.getText();
                apellido = textApellido.getText();
                correo = textCorreo.getText();
                saldoInicial = Double.parseDouble(textSalInicial.getText());
                
                ventanaApp = new JFrame("Banco APP");
                ventanaApp.setMinimumSize(new Dimension(350, 720));
                ventanaApp.setLocationRelativeTo(null);
                ventanaApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                /*setTitle("Banco APP");
                setMinimumSize(new Dimension(350, 720));
                setLocationRelativeTo(null);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        
                JPanel panel1 = new JPanel();
                panel1.setLayout(null);
                getContentPane().add(panel1);
        
                labelHola = new JLabel(" ¡Bienvenido, " + nombre + "!");
                labelHola.setOpaque(true);
                labelHola.setBackground(new java.awt.Color(220, 220, 220));
                labelHola.setFont(new java.awt.Font("Malgun Gothic", 1, 18));
                labelHola.setBounds(1, 30, 400, 23);
                panel1.add(labelHola);
        
                labelBanco = new JLabel("   BancoApp");
                labelBanco.setOpaque(true);
                labelBanco.setBackground(new java.awt.Color(220, 220, 220));
                labelBanco.setFont(new java.awt.Font("sansserif", 2, 10));
                labelBanco.setBounds(1, 5, 400, 30);
                panel1.add(labelBanco);
        
                label1 = new JLabel("");
                label1.setOpaque(true);
                label1.setBackground(new java.awt.Color(220, 220, 220));
                label1.setBounds(1, 40, 400, 30);
                panel1.add(label1);
        
                labelSaldoD = new JLabel("  Saldo disponible");
                labelSaldoD.setFont(new java.awt.Font("sansserief", 2, 13));
                labelSaldoD.setOpaque(true);
                labelSaldoD.setBackground(Color.white);
                labelSaldoD.setBounds(70, 100, 190, 23);
                panel1.add(labelSaldoD);
        
                labelSaldo = new JLabel("$" + saldoInicial);
                labelSaldo.setHorizontalAlignment(SwingConstants.CENTER);
                labelSaldo.setOpaque(true);
                labelSaldo.setFont(new java.awt.Font("sansserief", 1, 30));
                labelSaldo.setForeground(new java.awt.Color(153, 153, 153));
                labelSaldo.setBackground(Color.white);
                labelSaldo.setBounds(70, 121, 190, 60);
                panel1.add(labelSaldo);
        
                labelCuenta = new JLabel("" + numCuenta);
                labelCuenta.setHorizontalAlignment(SwingConstants.CENTER);
                labelCuenta.setFont(new java.awt.Font("sansserief", 4, 12));
                labelCuenta.setOpaque(true);
                labelCuenta.setBackground(Color.white);
                labelCuenta.setBounds(70, 179, 190, 23);
                panel1.add(labelCuenta);
        
                labelNCuenta = new JLabel("Numero de cuenta");
                labelNCuenta.setOpaque(true);
                labelNCuenta.setBackground(Color.white);
                labelNCuenta.setHorizontalAlignment(SwingConstants.CENTER);
                labelNCuenta.setFont(new java.awt.Font("sansserief", 3, 12));
                labelNCuenta.setBounds(70, 200, 190, 23);
                panel1.add(labelNCuenta);
        
                labelInTitulo = new JLabel("  Interés");
                labelInTitulo.setFont(new java.awt.Font("sansserief", 2, 13));
                labelInTitulo.setOpaque(true);
                labelInTitulo.setBackground(Color.white);
                labelInTitulo.setBounds(70, 240, 190, 23);
                panel1.add(labelInTitulo);
        
                labelInteres = new JLabel("$" + interes);
                labelInteres.setHorizontalAlignment(SwingConstants.CENTER);
                labelInteres.setOpaque(true);
                labelInteres.setFont(new java.awt.Font("sansserief", 1, 30));
                labelInteres.setForeground(new java.awt.Color(153, 153, 153));
                labelInteres.setBackground(Color.white);
                labelInteres.setBounds(70, 260, 190, 60);
                panel1.add(labelInteres);
        
                labelSalInteres = new JLabel("$" + saldoInteres);
                labelSalInteres.setHorizontalAlignment(SwingConstants.CENTER);
                labelSalInteres.setFont(new java.awt.Font("sansserief", 4, 12));
                labelSalInteres.setOpaque(true);
                labelSalInteres.setBackground(Color.white);
                labelSalInteres.setBounds(70, 320, 190, 23);
                panel1.add(labelSalInteres);
        
                labelSalAhorro = new JLabel("Saldo con interés");
                labelSalAhorro.setOpaque(true);
                labelSalAhorro.setBackground(Color.white);
                labelSalAhorro.setHorizontalAlignment(SwingConstants.CENTER);
                labelSalAhorro.setFont(new java.awt.Font("sansserief", 3, 12));
                labelSalAhorro.setBounds(70, 342, 190, 23);
                panel1.add(labelSalAhorro);
        
                labelCrTitulo = new JLabel("  Linea de credito");
                labelCrTitulo.setFont(new java.awt.Font("sansserief", 2, 13));
                labelCrTitulo.setOpaque(true);
                labelCrTitulo.setBackground(Color.white);
                labelCrTitulo.setBounds(70, 383, 190, 23);
                panel1.add(labelCrTitulo);
        
                labelCredito = new JLabel("$" + limiteCredito);
                labelCredito.setHorizontalAlignment(SwingConstants.CENTER);
                labelCredito.setOpaque(true);
                labelCredito.setFont(new java.awt.Font("sansserief", 1, 30));
                labelCredito.setForeground(new java.awt.Color(153, 153, 153));
                labelCredito.setBackground(Color.white);
                labelCredito.setBounds(70, 405, 190, 60);
                panel1.add(labelCredito);
        
        
                btnDepositar = new JButton("Depositar");
                btnDepositar.setBounds(40, 485, 110, 30);
                btnDepositar.setBackground(new java.awt.Color(225, 225, 242));
                btnDepositar.setForeground(new java.awt.Color(153, 153, 153));
                btnDepositar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                btnDepositar.addActionListener(this);
                panel1.add(btnDepositar);
        
                btnRetirar = new JButton("Retirar");
                btnRetirar.setBounds(186, 485, 110, 30);
                btnRetirar.setBackground(new java.awt.Color(225, 225, 242));
                btnRetirar.setForeground(new java.awt.Color(153, 153, 153));
                btnRetirar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                btnRetirar.addActionListener(this);
                panel1.add(btnRetirar);
        
                btnInteres = new JButton("Calcular interés");
                btnInteres.setBounds(40, 530, 110, 30);
                btnInteres.setBackground(new java.awt.Color(225, 225, 242));
                btnInteres.setForeground(new java.awt.Color(153, 153, 153));
                btnInteres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                btnInteres.addActionListener(this);
                panel1.add(btnInteres);
        
                btnCredito = new JButton("Usar crédito");
                btnCredito.setBounds(186, 530, 110, 30);
                btnCredito.setBackground(new java.awt.Color(225, 225, 242));
                btnCredito.setForeground(new java.awt.Color(153, 153, 153));
                btnCredito.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                btnCredito.addActionListener(this);
                panel1.add(btnCredito);
        
                btnConsultar = new JButton("Datos de cuenta");
                btnConsultar.setHorizontalAlignment(SwingConstants.CENTER);
                btnConsultar.setBounds(40, 573, 257, 30);
                btnConsultar.setBackground(new java.awt.Color(225, 225, 242));
                btnConsultar.setForeground(new java.awt.Color(153, 153, 153));
                btnConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                btnConsultar.addActionListener(this);
                panel1.add(btnConsultar);
                
                ventanaApp.add(panel1);
                ventanaApp.setVisible(true);

                btnDepositar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        double cantidad = 0;
                        ImageIcon icono = medidas(iconoDeposito);
                        monto = (String) JOptionPane.showInputDialog(null, "Inserta cantidad a depositar", "Monto", JOptionPane.QUESTION_MESSAGE, icono, null, "");
                        cantidad = Double.parseDouble(monto);
                        if(cantidad > 0){
                            saldo = saldo + cantidad;
                            JOptionPane.showMessageDialog(null , "Deposito éxitoso", "Estatus de operación", 1);
                            labelSaldo.setText(String.valueOf("$" + saldo));
                        }else{
                            JOptionPane.showMessageDialog(null , "La cantidad a depositar debe ser superior a $0.00 pesos", "Estatus de operación", 2);
                        }
                    }
                });
                
                btnRetirar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                     
                    }
                });
                
                btnInteres.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                    }
                });
                
                btnConsultar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                    }
                });
            }
        };
        btnRegistro.addActionListener(oyenteDeAccion1);
        setVisible(true);
  }

    public ImageIcon medidas(ImageIcon icon){
        Image ajuste = icon.getImage();
        Image iconoMedida = ajuste.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        return new ImageIcon(iconoMedida);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
