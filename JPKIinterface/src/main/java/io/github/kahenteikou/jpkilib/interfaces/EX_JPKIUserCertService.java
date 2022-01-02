package io.github.kahenteikou.jpkilib.interfaces;

public abstract class EX_JPKIUserCertService {
    public EX_JPKIUserCertService(byte[] certData) {

    }
    public EX_JPKIUserCertService(){

    }
    public abstract IJPKIConfirmResult confirm() throws E_JPKIUserCertException;
    public abstract E_JPKIUserCertBasicData  	getBasicData()throws E_JPKIUserCertException;
    public abstract E_JPKICardType getCardType()throws E_JPKIUserCertException;
    public abstract void showCertViewer()throws E_JPKIUserCertException;
    public abstract E_JPKIUserCertCertStatus verifyCert()throws E_JPKIUserCertException;
}
