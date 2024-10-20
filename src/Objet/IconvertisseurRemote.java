package Objet;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
public interface IconvertisseurRemote extends Remote
{
	public double conversion(double mt) throws RemoteException;
	public int getServerDate()throws RemoteException;
}