/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Afif Bahtiar
 */
public class Data {
    
    public static String namaPetugas, userId;
    
    public static void setNamaPetugas(String namaPetugas){
        Data.namaPetugas = namaPetugas;
    }
    
    public static String getNamaPetugas(){
        return namaPetugas;
    }
    
    public static void setUserId(String userId){
        Data.userId = userId;
    }
    
    public static String getUserId(){
        return userId;
    }
    
}
