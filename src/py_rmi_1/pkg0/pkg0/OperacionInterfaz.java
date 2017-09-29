/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py_rmi_1.pkg0.pkg0;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import modell.Muser;

/**
 *
 * @author DIGETI
 */
public interface OperacionInterfaz extends Remote {
    public ArrayList<Muser> Lista() throws RemoteException;
}
