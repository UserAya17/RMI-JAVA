package Objet;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;


public class ConvertisseurIpml extends UnicastRemoteObject implements IconvertisseurRemote{

	public ConvertisseurIpml() throws RemoteException
	{
		super();
	}

	public double conversion(double mt) throws RemoteException
	{

		return 11*mt;
	}

	public Date getServerDate() throws RemoteException
	{
		return new Date();
	}
}