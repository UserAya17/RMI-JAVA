package Serveur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import Objet.ConvertisseurIpml;
public class Serveur {
public static void main(String[] args) {

	try {

		// démarrer l’annuaire
		LocateRegistry.createRegistry(8094);
		// Créer l’objet distant
		ConvertisseurIpml od=new ConvertisseurIpml();
		// Publier sa référence dans l’annuaire
		Naming.rebind("rmi://localhost:8094/aya",od);

	} catch (Exception e) {
		e.printStackTrace();

	}
}}