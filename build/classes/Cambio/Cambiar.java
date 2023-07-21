package Cambio;

import Modulos.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class  Cambiar {
public static int contador = 0;

public static void main(String[] args) {

        int velocidad = 2;
        Timer timer;
        TimerTask tarea;
        int velmil = velocidad * 1000;
    InicioSecion c = new InicioSecion();
    c.setVisible(true);
    c.setLocationRelativeTo(null);
        tarea = new TimerTask() {
            @Override
            public void run() {
                Icon icono;

               
                switch (contador) {
                    
                    case 0:
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/Imagenes/Ecuador1.png"));
                        c.IMAGEN1.setIcon(icono);
                        break;

                     case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/Imagenes/Imagen3.png"));
                        c.IMAGEN1.setIcon(icono);
                        break;

                    case 2:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/Imagenes/areas-protegidas-2.png"));
                        c.IMAGEN1.setIcon(icono);
                        break;

                }
            }

        };
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);
    }
    }

