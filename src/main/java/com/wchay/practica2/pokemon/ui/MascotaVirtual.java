/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wchay.practica2.pokemon.ui;

import com.wchay.practica2.pokemon.backend.jugador.Jugador;
import com.wchay.practica2.pokemon.pokemons.Pokemon;
import com.wchay.practica2.pokemon.tienda.Tienda;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonwil
 */
public class MascotaVirtual extends javax.swing.JFrame {
//    private JPanel mascotasPanel[];
    private JLabel[] labelTodasLasMascotas;
    private Pokemon[] pokemonTodasLasMascotas;
    private int contador=0;
    private Tienda tienda;
    private Jugador jugador1;
    private Jugador jugadorEnemigo;
    private int mascotaSeleccionada;
    private int monedasDisponibles;
    private Thread[] mascotasVivas;
    

    /**
     * Creates new form MascotaVirtual
     */
    public MascotaVirtual() {
        jugador1 = new Jugador();
        jugadorEnemigo = new Jugador();
        mascotasVivas = new Thread[11];
        tienda = new Tienda();
//        mascotasPanel = new JPanel[11];
        labelTodasLasMascotas = new JLabel[11];
//        pokemonTodasLasMascotas = new Pokemon[11];
        pokemonTodasLasMascotas = tienda.getPokemonsA_BAtalla();
        
        initComponents();
        inicializarJuego();
        inicializarTienda();
        
        

//                imagenInicioJuego();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJugar = new javax.swing.JPanel();
        jlabelTextoJugar = new javax.swing.JLabel();
        panelFondoGeneral = new javax.swing.JPanel();
        jLabelMonedaDisponibles = new javax.swing.JLabel();
        panelEstadoMascota = new javax.swing.JPanel();
        botonSalirEstadoMascota = new javax.swing.JButton();
        panelDentroEstadoMascota = new javax.swing.JPanel();
        labelDentroEstadoMascotaNombre = new javax.swing.JLabel();
        botonCurar = new javax.swing.JButton();
        botonDarunPaseo1 = new javax.swing.JButton();
        botonDarComida1 = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        panelMisMascotas = new javax.swing.JPanel();
        jinternalFramePreguntas = new javax.swing.JInternalFrame();
        botonCancelar = new javax.swing.JButton();
        jlabelTextoComprarMascota = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        jlabelTextoMisMascotas = new javax.swing.JLabel();
        panelTienda = new javax.swing.JPanel();
        botonComprarRestarurante1 = new javax.swing.JButton();
        botonComprarFarmacia = new javax.swing.JButton();
        botonComprarPokemons = new javax.swing.JButton();
        jScrollTodasMascotas = new javax.swing.JScrollPane();
        panelTodasLasMascotas = new javax.swing.JPanel();
        jlabelComienzoJuego = new javax.swing.JLabel();
        jlabelFondoInicio = new javax.swing.JLabel();
        menuBarra = new javax.swing.JMenuBar();
        menuJuego = new javax.swing.JMenu();
        menuVerMascotas = new javax.swing.JMenuItem();
        menuTienda = new javax.swing.JMenuItem();
        acercaDe = new javax.swing.JMenu();
        ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mascota Virtual Pokemon");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelJugar.setBackground(new java.awt.Color(0, 0, 0));
        panelJugar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelJugarMouseClicked(evt);
            }
        });

        jlabelTextoJugar.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jlabelTextoJugar.setForeground(new java.awt.Color(255, 255, 255));
        jlabelTextoJugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelTextoJugar.setText("JUGAR");
        jlabelTextoJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelJugarLayout = new javax.swing.GroupLayout(panelJugar);
        panelJugar.setLayout(panelJugarLayout);
        panelJugarLayout.setHorizontalGroup(
            panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabelTextoJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelJugarLayout.setVerticalGroup(
            panelJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlabelTextoJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(panelJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 280, 70));

        panelFondoGeneral.setBackground(new java.awt.Color(255, 255, 255));
        panelFondoGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMonedaDisponibles.setBackground(new java.awt.Color(0, 204, 204));
        jLabelMonedaDisponibles.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelMonedaDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        panelFondoGeneral.add(jLabelMonedaDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 200, 40));

        panelEstadoMascota.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 0), 1, true));

        botonSalirEstadoMascota.setText("X");
        botonSalirEstadoMascota.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));
        botonSalirEstadoMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirEstadoMascotaActionPerformed(evt);
            }
        });

        panelDentroEstadoMascota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));

        labelDentroEstadoMascotaNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        javax.swing.GroupLayout panelDentroEstadoMascotaLayout = new javax.swing.GroupLayout(panelDentroEstadoMascota);
        panelDentroEstadoMascota.setLayout(panelDentroEstadoMascotaLayout);
        panelDentroEstadoMascotaLayout.setHorizontalGroup(
            panelDentroEstadoMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDentroEstadoMascotaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelDentroEstadoMascotaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        panelDentroEstadoMascotaLayout.setVerticalGroup(
            panelDentroEstadoMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDentroEstadoMascotaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelDentroEstadoMascotaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(385, Short.MAX_VALUE))
        );

        botonCurar.setText("Curar");
        botonCurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCurarActionPerformed(evt);
            }
        });

        botonDarunPaseo1.setText("Salir a  Pasear");
        botonDarunPaseo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDarunPaseo1ActionPerformed(evt);
            }
        });

        botonDarComida1.setText("Alimentar");

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstadoMascotaLayout = new javax.swing.GroupLayout(panelEstadoMascota);
        panelEstadoMascota.setLayout(panelEstadoMascotaLayout);
        panelEstadoMascotaLayout.setHorizontalGroup(
            panelEstadoMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelEstadoMascotaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panelEstadoMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstadoMascotaLayout.createSequentialGroup()
                        .addComponent(panelDentroEstadoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEstadoMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonDarunPaseo1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelEstadoMascotaLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(panelEstadoMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEstadoMascotaLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(botonDarComida1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonCurar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(472, 472, 472))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoMascotaLayout.createSequentialGroup()
                        .addComponent(botonSalirEstadoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelEstadoMascotaLayout.setVerticalGroup(
            panelEstadoMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoMascotaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(botonDarunPaseo1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEstadoMascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonSalirEstadoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(botonDarComida1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(botonCurar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelEstadoMascotaLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(panelDentroEstadoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelFondoGeneral.add(panelEstadoMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 84, 1280, 530));

        panelMisMascotas.setBackground(new java.awt.Color(204, 204, 255));
        panelMisMascotas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 3, true));
        panelMisMascotas.setLayout(new java.awt.GridLayout(0, 5));
        panelFondoGeneral.add(panelMisMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1300, 550));

        jinternalFramePreguntas.setClosable(true);
        jinternalFramePreguntas.setVisible(true);

        botonCancelar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        jlabelTextoComprarMascota.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        botonAceptar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jinternalFramePreguntasLayout = new javax.swing.GroupLayout(jinternalFramePreguntas.getContentPane());
        jinternalFramePreguntas.getContentPane().setLayout(jinternalFramePreguntasLayout);
        jinternalFramePreguntasLayout.setHorizontalGroup(
            jinternalFramePreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jinternalFramePreguntasLayout.createSequentialGroup()
                .addGroup(jinternalFramePreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jinternalFramePreguntasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlabelTextoComprarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jinternalFramePreguntasLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jinternalFramePreguntasLayout.setVerticalGroup(
            jinternalFramePreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jinternalFramePreguntasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlabelTextoComprarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jinternalFramePreguntasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        panelFondoGeneral.add(jinternalFramePreguntas, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 510, 220));

        jlabelTextoMisMascotas.setBackground(new java.awt.Color(0, 102, 204));
        jlabelTextoMisMascotas.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlabelTextoMisMascotas.setForeground(new java.awt.Color(0, 0, 51));
        jlabelTextoMisMascotas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelTextoMisMascotas.setText("MIS MASCOTAS");
        panelFondoGeneral.add(jlabelTextoMisMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 6, 400, 50));

        panelTienda.setBackground(new java.awt.Color(51, 153, 255));
        panelTienda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botonComprarRestarurante1.setBackground(new java.awt.Color(102, 204, 255));
        botonComprarRestarurante1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        botonComprarRestarurante1.setForeground(new java.awt.Color(102, 0, 0));
        botonComprarRestarurante1.setText("RESTAURANTE");
        botonComprarRestarurante1.setBorder(null);
        botonComprarRestarurante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarRestarurante1ActionPerformed(evt);
            }
        });

        botonComprarFarmacia.setBackground(new java.awt.Color(102, 204, 255));
        botonComprarFarmacia.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        botonComprarFarmacia.setForeground(new java.awt.Color(102, 0, 51));
        botonComprarFarmacia.setText("FARMACIA");
        botonComprarFarmacia.setBorder(null);
        botonComprarFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarFarmaciaActionPerformed(evt);
            }
        });

        botonComprarPokemons.setBackground(new java.awt.Color(51, 204, 255));
        botonComprarPokemons.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        botonComprarPokemons.setForeground(new java.awt.Color(102, 0, 0));
        botonComprarPokemons.setText("POKEMONS");
        botonComprarPokemons.setBorder(null);
        botonComprarPokemons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarPokemonsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTiendaLayout = new javax.swing.GroupLayout(panelTienda);
        panelTienda.setLayout(panelTiendaLayout);
        panelTiendaLayout.setHorizontalGroup(
            panelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiendaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonComprarPokemons, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(botonComprarRestarurante1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(botonComprarFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTiendaLayout.setVerticalGroup(
            panelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiendaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonComprarPokemons, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonComprarRestarurante1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonComprarFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelFondoGeneral.add(panelTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 780, 100));

        panelTodasLasMascotas.setLayout(new java.awt.GridLayout(0, 5, 3, 3));
        jScrollTodasMascotas.setViewportView(panelTodasLasMascotas);

        panelFondoGeneral.add(jScrollTodasMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 1150, 380));

        jlabelComienzoJuego.setToolTipText("");
        panelFondoGeneral.add(jlabelComienzoJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 760));

        getContentPane().add(panelFondoGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 760));

        jlabelFondoInicio.setBackground(new java.awt.Color(0, 0, 51));
        jlabelFondoInicio.setForeground(new java.awt.Color(0, 0, 51));
        jlabelFondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wchay/practica2/pokemon/imagenesPokemon/153.jpg"))); // NOI18N
        jlabelFondoInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlabelFondoInicioMousePressed(evt);
            }
        });
        getContentPane().add(jlabelFondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 760));

        menuBarra.setBorder(null);
        menuBarra.setForeground(new java.awt.Color(255, 255, 255));

        menuJuego.setText("Juego");

        menuVerMascotas.setText("Mis Mascotas");
        menuVerMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerMascotasActionPerformed(evt);
            }
        });
        menuJuego.add(menuVerMascotas);

        menuTienda.setText("Tienda ");
        menuTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTiendaActionPerformed(evt);
            }
        });
        menuJuego.add(menuTienda);

        menuBarra.add(menuJuego);

        acercaDe.setText("Acerca de");
        acercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                acercaDeMousePressed(evt);
            }
        });
        menuBarra.add(acercaDe);

        ayuda.setText("Ayuda");
        menuBarra.add(ayuda);

        setJMenuBar(menuBarra);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acercaDeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaDeMousePressed
        JOptionPane.showMessageDialog(null, "       Wilson Jonatan Chay Santizo\nEstudiante de Ing Sistemas\n Curo: Ipc1 SeccionA");
    }//GEN-LAST:event_acercaDeMousePressed

    private void jlabelFondoInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelFondoInicioMousePressed
        
        
    }//GEN-LAST:event_jlabelFondoInicioMousePressed

    public void inicializarJuego() {
        monedasDisponibles = jugador1.getMonedasInciales();
        Random random = new Random();
        crearPaneles();
        panelEstadoMascota.setVisible(false);
        mascotaSeleccionada=random.nextInt(10)+1;
//        sssssss
        menuJuego.setEnabled(false);
        setIconos(null, jlabelComienzoJuego, "155");
        panelFondoGeneral.setVisible(false);
        jlabelComienzoJuego.setVisible(false);
        panelMisMascotas.setVisible(false);
        jlabelTextoMisMascotas.setVisible(false);
        panelTienda.setVisible(false);
        jScrollTodasMascotas.setVisible(false);
        jinternalFramePreguntas.setVisible(false);
                
        
        
    }
    
    public void crearPaneles(){
//        for (int i = 1; i < 11; i++){
//            mascotasPanel[i] = new JPanel();
//            mascotasPanel[i].setLayout(new java.awt.BorderLayout());
//            mascotasPanel[i].setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 0, 102), 3, true));
//            mascotasPanel[i].setBackground(Color.BLUE);
//            panelMisMascotas.add(mascotasPanel[i]);
//            
//        }
    }
    
    public void setIconos(JButton boton, JLabel label, String numeroImagen){
        ImageIcon image = new ImageIcon(getClass().getResource("/com/wchay/practica2/pokemon/imagenesPokemon/"+numeroImagen+".png"));
        if(boton!=null){
            ImageIcon icono = new ImageIcon(image.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
            boton.setIcon(icono);
        }
        if(label!=null){
            ImageIcon icono = new ImageIcon(image.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
            label.setIcon(icono);            
        }
        
        
    }
    private void menuTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTiendaActionPerformed
        panelEstadoMascota.setVisible(false);
        panelMisMascotas.setVisible(false);
        jlabelTextoMisMascotas.setVisible(false);
        panelTienda.setVisible(true);
        
    }//GEN-LAST:event_menuTiendaActionPerformed

    private void menuVerMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerMascotasActionPerformed
//        int numero = jugador1.getMascotasCompradas();
//        for (int i = 1; i < mascotasPanel.length; i++){
//            mascotasPanel[i].setVisible(true);
//        }
        panelEstadoMascota.setVisible(false);
        panelTienda.setVisible(false);
        panelMisMascotas.setVisible(true);
        jlabelTextoMisMascotas.setVisible(true);
        jScrollTodasMascotas.setVisible(false);
        

    }//GEN-LAST:event_menuVerMascotasActionPerformed
    public void inicializarMascatasJugador(){
        
    }
    private void panelJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelJugarMouseClicked
        comprarMascota();
        monedasDisponibles = jugador1.getMonedasInciales();
        jLabelMonedaDisponibles.setText(String.format("Monedas Disponibles: %d",monedasDisponibles));
        menuJuego.setEnabled(true);
        
        jlabelFondoInicio.setVisible(false);
        panelJugar.setVisible(false);
        jlabelTextoJugar.setVisible(false);
        
        jlabelComienzoJuego.setVisible(true);
        panelFondoGeneral.setVisible(true);
        panelMisMascotas.setVisible(true);
        jlabelTextoMisMascotas.setVisible(true);
        JOptionPane.showMessageDialog(panelFondoGeneral, "              Bonus de Inicio!!!\n100 Monedas y tu Primera Mascota Pokemon es Gratis ");
        
        
    }//GEN-LAST:event_panelJugarMouseClicked

    private void botonComprarPokemonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarPokemonsActionPerformed
        jScrollTodasMascotas.setVisible(true);

    }//GEN-LAST:event_botonComprarPokemonsActionPerformed

    
    public void inicializarTienda() {
        for (int i = 1; i < pokemonTodasLasMascotas.length; i++){
            Pokemon pokemon = pokemonTodasLasMascotas[i];
            int posicion = i;
                String infoPokemon = pokemon.getInfoMascota();
            labelTodasLasMascotas[i] = new JLabel();
            labelTodasLasMascotas[i].setSize(500, 500);
            labelTodasLasMascotas[i].setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
            
            labelTodasLasMascotas[i].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seleccionarMascota_a_comprar(posicion, evt);
            }
            });
            ImageIcon iconoMisMascotas = pokemon.getImagenPokemon();
            labelTodasLasMascotas[i].setIcon(iconoMisMascotas);
            labelTodasLasMascotas[i].setText(infoPokemon);
            panelTodasLasMascotas.add(labelTodasLasMascotas[i]);
            
        }
    }

    
    public void seleccionarMascota_a_comprar(int i, java.awt.event.MouseEvent evt){
        mascotaSeleccionada = i;
        String nombre= pokemonTodasLasMascotas[mascotaSeleccionada].getInfoMascota();
            jlabelTextoComprarMascota.setText("Seguro que quieres comprar al Pokemon: "+nombre);
            doLayout();
//        if(){
            jinternalFramePreguntas.setClosable(true);
            jinternalFramePreguntas.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
            jinternalFramePreguntas.setVisible(true);
//        }
        
        
        
    }
    
    private void botonComprarFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarFarmaciaActionPerformed
        jScrollTodasMascotas.setVisible(false);
        
    }//GEN-LAST:event_botonComprarFarmaciaActionPerformed

    private void botonComprarRestarurante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarRestarurante1ActionPerformed
        jScrollTodasMascotas.setVisible(false);
    }//GEN-LAST:event_botonComprarRestarurante1ActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        jinternalFramePreguntas.setVisible(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if(jugador1.getMonedasInciales()>=50){
            comprarMascota();
            monedasDisponibles = jugador1.getMonedasInciales();
            jLabelMonedaDisponibles.setText(String.format("Monedas Disponibles: %d",monedasDisponibles));
            JOptionPane.showMessageDialog(null, "           Tienes una Mascota Nueva!!!\n(haz click en el menu juego y luego click a  Mis mascotas)");
        }else{
            JOptionPane.showMessageDialog(null, "No tiene Suficientes Monedas Para Comprar esta Mascota");
        }
        
        
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonSalirEstadoMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirEstadoMascotaActionPerformed
        panelEstadoMascota.setVisible(false);
        
    }//GEN-LAST:event_botonSalirEstadoMascotaActionPerformed

    private void botonCurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCurarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCurarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonDarunPaseo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDarunPaseo1ActionPerformed
        BatallaMemoriasUI  batalla = new BatallaMemoriasUI();
        batalla.setVisible(true);
    }//GEN-LAST:event_botonDarunPaseo1ActionPerformed
    
    public void comprarMascota(){
                                                            //Nace una Mascota
               
        jugador1.setMascotasCompradas();
        Pokemon pokomen=pokemonTodasLasMascotas[mascotaSeleccionada];
        mascotasVivas[jugador1.getMascotasCompradas()] = new Thread(pokomen);
        mascotasVivas[jugador1.getMascotasCompradas()].start();
        
        jugador1.comprarMascotas(pokomen, mascotaSeleccionada);
        String nombreMascota = pokemonTodasLasMascotas[mascotaSeleccionada].getNombre();
        ImageIcon icono = new ImageIcon();
        icono =pokomen.getImagenPokemon();
        pokomen.setIcon(icono);
        pokomen.setText(nombreMascota);
        panelMisMascotas.add(pokemonTodasLasMascotas[mascotaSeleccionada]);
        pokemonTodasLasMascotas[mascotaSeleccionada].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadoMascotas(pokomen);
//                posicion, evt
            }
            });
        
        jinternalFramePreguntas.setVisible(false);
        
    }
    
    public void estadoMascotas(Pokemon pokemon){
//        for (int i = 1; i < mascotasPanel.length; i++){
//            mascotasPanel[i].setVisible(false);
//        }

        panelMisMascotas.setVisible(false);
        String infoMascota=pokemon.getInfoMascota();
        labelDentroEstadoMascotaNombre.setText("    "+infoMascota);
        panelDentroEstadoMascota.add(pokemon);
        
        panelEstadoMascota.setVisible(true);
        
    }
    
  
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu acercaDe;
    private javax.swing.JMenu ayuda;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonComprarFarmacia;
    private javax.swing.JButton botonComprarPokemons;
    private javax.swing.JButton botonComprarRestarurante1;
    private javax.swing.JButton botonCurar;
    private javax.swing.JButton botonDarComida1;
    private javax.swing.JButton botonDarunPaseo1;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonSalirEstadoMascota;
    private javax.swing.JLabel jLabelMonedaDisponibles;
    private javax.swing.JScrollPane jScrollTodasMascotas;
    private javax.swing.JInternalFrame jinternalFramePreguntas;
    private javax.swing.JLabel jlabelComienzoJuego;
    private javax.swing.JLabel jlabelFondoInicio;
    private javax.swing.JLabel jlabelTextoComprarMascota;
    private javax.swing.JLabel jlabelTextoJugar;
    private javax.swing.JLabel jlabelTextoMisMascotas;
    private javax.swing.JLabel labelDentroEstadoMascotaNombre;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuJuego;
    private javax.swing.JMenuItem menuTienda;
    private javax.swing.JMenuItem menuVerMascotas;
    private javax.swing.JPanel panelDentroEstadoMascota;
    private javax.swing.JPanel panelEstadoMascota;
    private javax.swing.JPanel panelFondoGeneral;
    private javax.swing.JPanel panelJugar;
    private javax.swing.JPanel panelMisMascotas;
    private javax.swing.JPanel panelTienda;
    private javax.swing.JPanel panelTodasLasMascotas;
    // End of variables declaration//GEN-END:variables


}
