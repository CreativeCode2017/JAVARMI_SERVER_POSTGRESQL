/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.Serializable;

/**
 *
 * @author DIGETI
 */
public class Muser implements Serializable {
   String iduser, name_user, key, state;

    public Muser(String iduser, String name_user, String key, String state) {
        this.iduser = iduser;
        this.name_user = name_user;
        this.key = key;
        this.state = state;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getstate() {
        return state;
    }

    public void setstate(String state) {
        this.state = state;
    }
   
}
