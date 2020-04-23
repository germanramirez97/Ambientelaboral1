/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.dto;

/**
 *
 * @author Eduardo
 */
public class Administrador {

    private String usuarioadm;
    private String contraadm;
    private String nombreadm;
    private String apellidoadm;
    private int cedula;

    public String getUsuarioadm() {
        return usuarioadm;
    }

    public void setUsuarioadm(String usuarioadm) {
        this.usuarioadm = usuarioadm;
    }

    public String getContraadm() {
        return contraadm;
    }

    public void setContraadm(String contraadm) {
        this.contraadm = contraadm;
    }

    public String getNombreadm() {
        return nombreadm;
    }

    public void setNombreadm(String nombreadm) {
        this.nombreadm = nombreadm;
    }

    public String getApellidoadm() {
        return apellidoadm;
    }

    public void setApellidoadm(String apellidoadm) {
        this.apellidoadm = apellidoadm;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    } 
}
