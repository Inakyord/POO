/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Persona.Cliente.Cliente;
import Persona.Administrador.Administrador;
import Casino.Casino;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

/**
 * La clase ManejoArchivos cuenta con métodos que sirvan de auxiliares para buscar, escribir y leer los archivos de tipo 
 * objeto de nuestras clases Cliente, Administrador y Casino. Implementa Serializable para poder guardar los archivos.
 * @author Equipo 2
 */
public class ManejoArchivos implements Serializable{
    
    public File archivo = null;
    private FileOutputStream flujoFuera = null;
    private ObjectOutputStream flujoFueraObjeto = null;
    private FileInputStream flujoDentro = null;
    private ObjectInputStream flujoDentroObjeto = null;
    
    /**
     * El método buscarUsuario sirve para buscar en la base de usuarios el archivo del registro de un usuario a través
     * de su nombre.
     * @param usuario el apodo del usuario buscado.
     * @return booleano para indicar si el archivo del usuario existe.
     */
    public boolean buscarUsuario(String usuario){
        archivo = new File("BaseDatos/Clientes/"+usuario);
        return archivo.exists();
    }
    
    /**
     * Este método regresa una instancia Cliente del usuario con dicho apodo o null si no existe.
     * @param apodo el nombre del archivo del cliente.
     * @return la instancia del usuario de tipo Cliente que corresponde al archivo del parámetro.
     */
    public Cliente cargarUsuario(String apodo){
        Cliente cliente = null;
        if(buscarUsuario(apodo)){
            try{
                flujoDentro = new FileInputStream(archivo);
                flujoDentroObjeto = new ObjectInputStream(flujoDentro);
                cliente = (Cliente) flujoDentroObjeto.readObject();
            }catch(FileNotFoundException e){
                return cliente;
            }catch(IOException e){
                e.printStackTrace();
                return cliente;
            }catch(ClassNotFoundException e){
                return null;
            }finally{
                try{
                    if (flujoDentro != null){
                        flujoDentro.close();
                        flujoDentro = null;
                    }
                    if (flujoDentroObjeto != null){
                        flujoDentroObjeto.close();
                        flujoDentroObjeto.close();
                    }   
                }catch(IOException e){
                }finally{
                    archivo = null;
                }
            }
        }
        return cliente;
    }
    
    /**
     * Este método guarda en un archivo a la instancia pasada.
     * @param cliente la instancia a guardar/escribir en archivo.
     * @return booleano indicando si se logró o no hacer el archivo.
     */
    public boolean guardarUsuario(Cliente cliente){
        archivo = new File("BaseDatos/Clientes/"+cliente.getApodo());
        try{
            flujoFuera = new FileOutputStream(archivo);
            flujoFueraObjeto = new ObjectOutputStream(flujoFuera);
            flujoFueraObjeto.writeObject(cliente);
        }catch(FileNotFoundException e){
            return false;
        }catch(IOException e){
            return false;
        }finally{
            try{
               if (flujoFuera != null){
                   flujoFuera.close();
                   flujoFuera = null;
               }
               if (flujoFueraObjeto != null){
                   flujoFueraObjeto.close();
                   flujoFueraObjeto.close();
               }   
            }catch(IOException e){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Este método sobreescribe un archivo del registro de usuarios
     * @param cliente la instancia con la que se va a sobreescribir.
     * @return booleano indicando si se logró.
     */
    public boolean editarUsuario(Cliente cliente){
        archivo = new File("BaseDatos/Clientes/"+cliente.getApodo());
        archivo.delete();
        archivo = new File("BaseDatos/Clientes/"+cliente.getApodo());
        try{
            archivo.createNewFile();
            flujoFuera = new FileOutputStream(archivo);
            flujoFueraObjeto = new ObjectOutputStream(flujoFuera);
            flujoFueraObjeto.writeObject(cliente);
        }catch(FileNotFoundException e){
            return false;
        }catch(IOException e){
            return false;
        }finally{
            try{
               if (flujoFuera != null){
                   flujoFuera.close();
                   flujoFuera = null;
               }
               if (flujoFueraObjeto != null){
                   flujoFueraObjeto.close();
                   flujoFueraObjeto.close();
               }   
            }catch(IOException e){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Este método borra el archivo de la instancia de cliente pasada.
     * @param cliente la instancia del cliente al que se borrará el registro.
     * @return booleano indicando si se borró el archivo.
     */
    public boolean borrarUsuario(Cliente cliente){
        archivo = new File("BaseDatos/Clientes/"+cliente.getApodo());
        archivo.delete();
        return true;
    }
    
    /**
     * El método buscarUsuario sirve para buscar en la base de usuarios el archivo del registro de un usuario a través
     * de su nombre.
     * @param admin el apodo del usuario buscado.
     * @return booleano para indicar si el archivo del usuario existe.
     */
    public boolean buscarAdmin(String admin){
        archivo = new File("BaseDatos/Administradores/"+admin);
        return archivo.exists();
    }
    
    /**
     * Este método regresa una instancia Administrador del admin con dicho apodo o null si no existe.
     * @param apodo el nombre del archivo del admin.
     * @return la instancia del usuario de tipo Administrador que corresponde al archivo del parámetro.
     */
    public Administrador cargarAdmin(String apodo){
        Administrador admin = null;
        if(buscarAdmin(apodo)){
            try{
                flujoDentro = new FileInputStream(archivo);
                flujoDentroObjeto = new ObjectInputStream(flujoDentro);
                admin = (Administrador)flujoDentroObjeto.readObject();
            }catch(FileNotFoundException e){
                return admin;
            }catch(IOException e){
                return admin;
            }catch(ClassNotFoundException e){
                return null;
            }finally{
                try{
                    if (flujoDentro != null){
                        flujoDentro.close();
                        flujoDentro = null;
                    }
                    if (flujoDentroObjeto != null){
                        flujoDentroObjeto.close();
                        flujoDentroObjeto.close();
                    }   
                }catch(IOException e){
                }finally{
                    archivo = null;
                }
            }
        }
        return admin;
    }
    
    /**
     * Este método guarda en un archivo a la instancia pasada.
     * @param admin la instancia a guardar/escribir en archivo.
     * @return booleano indicando si se logró o no hacer el archivo.
     */
    public boolean guardarAdmin(Administrador admin){
        archivo = new File("BaseDatos/Administradores/"+admin.getApodo());
        try{
            flujoFuera = new FileOutputStream(archivo);
            flujoFueraObjeto = new ObjectOutputStream(flujoFuera);
            flujoFueraObjeto.writeObject(admin);
        }catch(FileNotFoundException e){
            return false;
        }catch(IOException e){
            return false;
        }finally{
            try{
               if (flujoFuera != null){
                   flujoFuera.close();
                   flujoFuera = null;
               }
               if (flujoFueraObjeto != null){
                   flujoFueraObjeto.close();
                   flujoFueraObjeto.close();
               }   
            }catch(IOException e){
                return false;
            }
        }
        return true;
    }
    
    /**
     * Este método regresa una instancia Casino del casino con dicho nombre o null si no existe.
     * @param nombre el nombre del archivo del casino.
     * @return la instancia del usuario de tipo Casino que corresponde al archivo del parámetro.
     */
    public Casino cargarCasino(String nombre){
        Casino casino = null;
        
        try{
            flujoDentro = new FileInputStream("BaseDatos/Casino/"+nombre);
            flujoDentroObjeto = new ObjectInputStream(flujoDentro);
            casino = (Casino)flujoDentroObjeto.readObject();
        }catch(FileNotFoundException e){
            return casino;
        }catch(IOException e){
            return casino;
        }catch(ClassNotFoundException e){
            return null;
        }finally{
            try{
                if (flujoDentro != null){
                    flujoDentro.close();
                    flujoDentro = null;
                }
                if (flujoDentroObjeto != null){
                    flujoDentroObjeto.close();
                    flujoDentroObjeto.close();
                }   
            }catch(IOException e){
            }
        }
        return casino;
    }
    
    /**
     * Este método guarda en un archivo a la instancia pasada.
     * @param casino la instancia a guardar/escribir en archivo.
     * @return booleano indicando si se logró o no hacer el archivo.
     */
    public boolean guardarCasino(Casino casino){
        archivo = new File("BaseDatos/Casino/"+casino.getNombre());
        try{
            archivo.createNewFile();
            flujoFuera = new FileOutputStream(archivo);
            flujoFueraObjeto = new ObjectOutputStream(flujoFuera);
            flujoFueraObjeto.writeObject(casino);
        }catch(FileNotFoundException e){
            return false;
        }catch(IOException e){
            return false;
        }finally{
            try{
               if (flujoFuera != null){
                   flujoFuera.close();
                   flujoFuera = null;
               }
               if (flujoFueraObjeto != null){
                   flujoFueraObjeto.close();
                   flujoFueraObjeto.close();
               }   
            }catch(IOException e){
            }
        }
        return true;
    }
    
}
