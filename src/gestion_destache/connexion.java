/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_destache;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
class connexion {
    
    
    
     String urlpilote = "com.mysql.jdbc.Driver" ;//chemin pour charger le pilote
   String urlbdd="jdbc:mysql://localhost:3306/gestion_tache";//chemin pour charger la BDD
   Connection conn;
    
    public connexion(){
        //chargement de notre pilote
    try{
   Class.forName(urlpilote);
   System.out.println("chargement de pilote avec succes");
    }
     catch(ClassNotFoundException ex){
    System.out.println(ex);
     }
    //Connexion à la base de donnée
    try{
   conn=DriverManager.getConnection(urlbdd,"root","");
   System.out.println("Connexion à la base de données reussie");
    }
     catch(SQLException ex){
     System.out.println(ex);
     }
     
    }
    Connection obtenirconnexion(){
    
    return conn;
    }
    
}

    

