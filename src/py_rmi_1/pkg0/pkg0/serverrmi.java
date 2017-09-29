/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py_rmi_1.pkg0.pkg0;

import controller.Cuser;
import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import modell.Muser;

/**
 *
 * @author DIGETI
 */
public class serverrmi extends UnicastRemoteObject implements OperacionInterfaz {

    private static final long serialVersionUID = 985645454554542L;
    private final int PUERTO = 3000;
    
    public serverrmi() throws RemoteException{};
    
    public static void main(String[] args) throws Exception {
        (new serverrmi()).iniciarServidor();
    }

    public void iniciarServidor(){
        try{
            String dirIP = (InetAddress.getLocalHost().toString());
            System.out.println("Escuchando en.."+dirIP+":"+PUERTO);
            Registry registry = LocateRegistry.createRegistry(PUERTO);
            registry.bind("operacionservidor1", (OperacionInterfaz)this);
        }catch(Exception e){
            e.printStackTrace();
        }
    }    

    @Override
    public ArrayList<Muser> Lista() throws RemoteException {
       return new Cuser().lista();
    }
    
}
