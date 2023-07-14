/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import JFrames.*;
import JPanels.*;
import ActionListeners.Deteccion;
import Persona.Cliente.Cliente;
import Persona.Administrador.Administrador;
import Casino.Casino;
import carreracaballos.FraCarrera;
import tragamonedas.Tragaperras;
import paradise_cartas_v3.blackjack.BJGUI.ParadiseBJ;
import paradise_cartas_v3.poker.PokerGUI.ParadisePoker;

/**
 *
 * @author InakyO
 */
public class CasinoTheParadise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaración de objetos Usuario, Admin y Casino
        Cliente jugador = null;
        Administrador admin;
        Casino casino;
        
        // Declaración auxiliar manejo de archivos.
        ManejoArchivos archivos = new ManejoArchivos();
        
        // Inicialización datos del casino.
        casino = archivos.cargarCasino("Paradise");
        
        // Declaración ActionListeners utilizados.
        Deteccion detector = new Deteccion();
        
        // Declaración todos los JFrames utilizados.
        CuadroPrincipal cuadroPrincipal = new CuadroPrincipal(detector);
        FraCarrera caballos;
        Tragaperras tragamonedas;
        ParadiseBJ blackjack;
        ParadisePoker poker;
        
        
        // Declaración todos los JPanels utilizados.
        PanelCarga carga = new PanelCarga();
        PanelBienvenida bienvenida = new PanelBienvenida(detector);
        PanelInicio inicio = new PanelInicio(detector);
        PanelRegistro registro = new PanelRegistro(detector);
        PanelInicioSesion inicioSesion = new PanelInicioSesion(detector);
        PanelInicioSesionAdmin inicioAdmin = new PanelInicioSesionAdmin(detector);
        PanelMenuJugador menuJugador = new PanelMenuJugador(detector);
        PanelJuegosCompletos juegosCompletos = new PanelJuegosCompletos(detector);
        PanelJuegosLimitados juegosLimitados = new PanelJuegosLimitados(detector);
        PanelMenuAdmin menuAdmin = new PanelMenuAdmin(detector);
        PanelBuscarJugador buscarJugador = new PanelBuscarJugador(detector);
        PanelMenuEdicionJugador menuEdicionJugador = new PanelMenuEdicionJugador(detector);
        PanelEdicionJugador edicionJugador = new PanelEdicionJugador(detector);
        PanelContabilidad contabilidad = new PanelContabilidad(detector, casino);
        PanelInfoJugador infoJugador = new PanelInfoJugador(detector);
        PanelComprarFichas comprarFichas = new PanelComprarFichas(detector);
        PanelRegistroAdmin registroAdmin = new PanelRegistroAdmin(detector);
        
        
        // Declaración variables para navegación de switch.
        int opcionInicio;
        int opcionRegistro;
        int opcionInicioSesion;
        int opcionMenuJugador;
        int opcionInicioAdmin;
        int opcionMenuAdmin;
        int opcionEditarJugador;
        int opcionInfoJugador;
        int opcionEdicionJugador;
        int opcionMenuJuegos;
        int opcionDatosJugador;
        int opcionEstadisticas;
        int opcionRegistroAdmin;
        int opcionComprarFichas;
        
        //Variables auxiliares
        int i;
        
        
        // Inicialización datos del casino.
        casino = archivos.cargarCasino("Paradise");
        
        
        // A partir de aquí se inicia el flujo del programa.
        cuadroPrincipal.cambiarPanel(carga);
        
        for(i=0; i<13; i++){
            carga.actualizar(i%4);
            cuadroPrincipal.repaint();
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                //Algo pasa ...
            }
        }
        
        cuadroPrincipal.cambiarPanel(bienvenida);
        esperarBoton(detector);
        
        do{
            cuadroPrincipal.cambiarPanel(inicio);
            opcionInicio = esperarBoton(detector);
            switch(opcionInicio){
                //Registrarse
                case 1:
                    do{
                        cuadroPrincipal.cambiarPanel(registro);
                        opcionRegistro = esperarBoton(detector);
                        switch(opcionRegistro){
                            //Aceptar
                            case 1:
                                opcionRegistro = 0;
                                break;
                            //Cancelar
                            case 2:
                                opcionRegistro = 0;
                                break;
                        }
                    }while(opcionRegistro != 0);
                    break;
                //Iniciar Sesión
                case 2:
                    do{
                        cuadroPrincipal.cambiarPanel(inicioSesion);
                        opcionInicioSesion = esperarBoton(detector);
                        switch(opcionInicioSesion){
                            // Ingreso exitoso.
                            case 1:
                                jugador = inicioSesion.getUsuario();
                                menuJugador.actualizar(jugador);
                                do{
                                    cuadroPrincipal.cambiarPanel(menuJugador);
                                    opcionMenuJugador = esperarBoton(detector);
                                    switch(opcionMenuJugador){
                                        //Jugar
                                        case 1:
                                            do{
                                                if(jugador.getRango().compareTo("Diamante")==0 || jugador.getRango().compareTo("Oro")==0)
                                                    cuadroPrincipal.cambiarPanel(juegosCompletos);
                                                else
                                                    cuadroPrincipal.cambiarPanel(juegosLimitados);
                                                opcionMenuJuegos = esperarBoton(detector);
                                                switch(opcionMenuJuegos){
                                                    // Caballos
                                                    case 1:
                                                        detector.setBoton(false);
                                                        cuadroPrincipal.esconder();
                                                        caballos = new FraCarrera();
                                                        caballos.setJugador(jugador);
                                                        caballos.setDetector(detector);
                                                        caballos.setCasino(casino);
                                                        esperarBoton(detector);
                                                        detector.setBoton(false);
                                                        caballos.dispose();
                                                        cuadroPrincipal.desplegar();
                                                        break;
                                                    // 21
                                                    case 2:
                                                        detector.setBoton(false);
                                                        cuadroPrincipal.esconder();
                                                        blackjack = new ParadiseBJ();
                                                        blackjack.setJugador(jugador);
                                                        blackjack.setDetector(detector);
                                                        blackjack.setCasino(casino);
                                                        esperarBoton(detector);
                                                        detector.setBoton(false);
                                                        blackjack.dispose();
                                                        cuadroPrincipal.desplegar();
                                                        break;
                                                    // Poker
                                                    case 3:
                                                        detector.setBoton(false);
                                                        cuadroPrincipal.esconder();
                                                        poker = new ParadisePoker();
                                                        poker.setJugador(jugador);
                                                        poker.setDetector(detector);
                                                        poker.setCasino(casino);
                                                        esperarBoton(detector);
                                                        detector.setBoton(false);
                                                        poker.dispose();
                                                        cuadroPrincipal.desplegar();
                                                        break;
                                                    // Maquinitas
                                                    case 4:
                                                        detector.setBoton(false);
                                                        cuadroPrincipal.esconder();
                                                        tragamonedas = new Tragaperras();
                                                        tragamonedas.setJugador(jugador);
                                                        tragamonedas.setDetector(detector);
                                                        tragamonedas.setCasino(casino);
                                                        esperarBoton(detector);
                                                        tragamonedas.dispose();
                                                        detector.setBoton(false);
                                                        cuadroPrincipal.desplegar();
                                                        break;
                                                    // Regresar
                                                    case 5:
                                                        opcionMenuJuegos = 0;
                                                        break;
                                                }
                                            }while(opcionMenuJuegos != 0);
                                            
                                            break;
                                        //Ver datos
                                        case 2:
                                            do{
                                                infoJugador.actualizar(jugador);
                                                cuadroPrincipal.cambiarPanel(infoJugador);
                                                opcionDatosJugador = esperarBoton(detector);
                                                // Regresar
                                                if(opcionDatosJugador == 1)
                                                    opcionDatosJugador = 0;
                                            }while(opcionDatosJugador != 0);
                                            break;
                                        //Cerrar sesion
                                        case 3:
                                            opcionMenuJugador=0;
                                            opcionInicioSesion=0;
                                            archivos.guardarUsuario(jugador);
                                            jugador = null;
                                            break;
                                        //ComprarFichas
                                        case 4:
                                            do{
                                                cuadroPrincipal.cambiarPanel(comprarFichas);
                                                opcionComprarFichas = esperarBoton(detector);
                                                switch(opcionComprarFichas){
                                                    //200
                                                    case 1:
                                                        jugador.fichas+=200;
                                                        opcionComprarFichas=0;
                                                        break;
                                                    //500
                                                    case 2:
                                                        jugador.fichas+=500;
                                                        opcionComprarFichas=0;
                                                        break;
                                                    //1000
                                                    case 3:
                                                        jugador.fichas+=1000;
                                                        opcionComprarFichas=0;
                                                        break;
                                                    //Regresar
                                                    case 4:
                                                        opcionComprarFichas=0;
                                                        break;
                                                }
                                            }while(opcionComprarFichas != 0);
                                            break;
                                    }
                                }while(opcionMenuJugador != 0);
                                break;
                            // Inicio de admin.
                            case 2:
                                do{
                                    cuadroPrincipal.cambiarPanel(inicioAdmin);
                                    opcionInicioAdmin = esperarBoton(detector);
                                    switch(opcionInicioAdmin){
                                        // Ingreso exitoso admin
                                        case 1:
                                            admin = inicioAdmin.getAdmin();
                                            do{
                                                cuadroPrincipal.cambiarPanel(menuAdmin);
                                                opcionMenuAdmin = esperarBoton(detector);
                                                switch(opcionMenuAdmin){
                                                    // Editar Jugador
                                                    case 1:
                                                        do{
                                                            cuadroPrincipal.cambiarPanel(buscarJugador);
                                                            opcionEditarJugador = esperarBoton(detector);
                                                            switch(opcionEditarJugador){
                                                                //Buscar jugador exitoso
                                                                case 1:
                                                                    jugador = buscarJugador.getJugador();
                                                                    do{
                                                                        menuEdicionJugador.setJugador(jugador);
                                                                        cuadroPrincipal.cambiarPanel(menuEdicionJugador);
                                                                        opcionInfoJugador = esperarBoton(detector);
                                                                        switch(opcionInfoJugador){
                                                                            //Editar Jugador
                                                                            case 1:
                                                                                edicionJugador.setJugador(jugador);
                                                                                do{
                                                                                    cuadroPrincipal.cambiarPanel(edicionJugador);
                                                                                    opcionEdicionJugador = esperarBoton(detector);
                                                                                    switch(opcionEdicionJugador){
                                                                                        // Hacer Cambios
                                                                                        case 1:
                                                                                            opcionEdicionJugador = 0;
                                                                                            break;
                                                                                        // Regresar
                                                                                        case 2:
                                                                                            opcionEdicionJugador = 0;
                                                                                            break;
                                                                                    }
                                                                                }while(opcionEdicionJugador != 0);
                                                                                break;
                                                                            //Borrar Jugador
                                                                            case 2:
                                                                                opcionInfoJugador = 0;
                                                                                opcionEditarJugador = 0;
                                                                                jugador = null;
                                                                                break;
                                                                            // Regresar
                                                                            case 3:
                                                                                opcionInfoJugador = 0;
                                                                                opcionEditarJugador = 0;
                                                                                jugador = null;
                                                                                break;
                                                                        }
                                                                    }while(opcionInfoJugador != 0);
                                                                    break;
                                                                //Regresar
                                                                case 2:
                                                                    opcionEditarJugador = 0;
                                                                    break;
                                                            }
                                                        }while(opcionEditarJugador != 0);
                                                        break;
                                                    // Estadísticas Casino
                                                    case 2:
                                                        do{
                                                            contabilidad.actualizar();
                                                            cuadroPrincipal.cambiarPanel(contabilidad);
                                                            opcionEstadisticas = esperarBoton(detector);
                                                            switch(opcionEstadisticas){
                                                                case 1:
                                                                    opcionEstadisticas = 0;
                                                                    break;
                                                            }
                                                        }while(opcionEstadisticas != 0);
                                                        break;
                                                    // Cerrar Sesión
                                                    case 3:
                                                        opcionMenuAdmin = 0;
                                                        opcionInicioAdmin = 0;
                                                        admin = null;
                                                        break;
                                                }
                                            }while(opcionMenuAdmin != 0);
                                            break;
                                        // Regresar
                                        case 2:
                                            opcionInicioAdmin = 0;
                                            break;
                                        // Registrarse
                                        case 3:
                                            do{
                                                cuadroPrincipal.cambiarPanel(registroAdmin);
                                                opcionRegistroAdmin = esperarBoton(detector);
                                                switch(opcionRegistroAdmin){
                                                    //Registro exitoso
                                                    case 1:
                                                        opcionRegistroAdmin = 0;
                                                        break;
                                                    //Regresar
                                                    case 2:
                                                        opcionRegistroAdmin = 0;
                                                        break;
                                                }
                                            }while(opcionRegistroAdmin != 0);
                                            break;
                                    }
                                }while(opcionInicioAdmin!=0);
                                break;
                            // Regresar
                            case 3:
                                opcionInicioSesion = 0;
                                break;
                        }
                    }while (opcionInicioSesion != 0);
                    break;
                //Salir
                case 3:
                    opcionInicio=0;
                    break;
            }
        }while(opcionInicio!=0);
        
        cuadroPrincipal.dispose();
        
        archivos.guardarCasino(casino);
        if(jugador!=null)
            archivos.guardarUsuario(jugador);
            
        
        System.out.println("Adios");
        
    }
    
    
    public static int esperarBoton(Deteccion detector){
        int opcion;
        
        while(detector.getBoton()!=true){
            try{
                Thread.sleep(30);
            }catch(InterruptedException ex){}
        }
        try{
            Thread.sleep(30);
        }catch(InterruptedException ex){}
        
        opcion = detector.getOpcion();

        return opcion;
    }
    
}
