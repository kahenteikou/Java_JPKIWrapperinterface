package io.github.kahenteikou.jpki_lib.wrappers;

import io.github.kahenteikou.jpkilib.interfaces.*;
import jp.go.jpki.appli.*;

public class JPKIUserCertService_W extends EX_JPKIUserCertService {
    private JPKIUserCertService service;
    public JPKIUserCertService_W(byte[] certData) {
        super(certData);
        service=new JPKIUserCertService(certData);
    }

    public JPKIUserCertService_W() {
        super();
        service=new JPKIUserCertService();
    }
    @Override
    public IJPKIConfirmResult confirm()throws E_JPKIUserCertException {
        try {
            return new JPKIConfirmResult_W(service.confirm());
        } catch (JPKIUserCertException e) {
            throw  new E_JPKIUserCertException(e.getErrorCode());
        }
    }

    @Override
    public E_JPKIUserCertBasicData getBasicData() throws E_JPKIUserCertException{
        try{
            JPKIUserCertBasicData d=service.getBasicData();
            return new E_JPKIUserCertBasicData(d.getName(),d.getDateOfBirth(),d.getGender(),d.getAddress(),d.getSubstituteCharacterOfName(),d.getSubstituteCharacterOfAddress());
        }catch (JPKIUserCertException e) {
            throw  new E_JPKIUserCertException(e.getErrorCode());
        }
    }

    @Override
    public E_JPKICardType getCardType() throws E_JPKIUserCertException{
        try{
            JPKICardType ctypekun=service.getCardType();
            return new E_JPKICardType(ctypekun.getID(),ctypekun.getTokenInfo());
        }catch (JPKIUserCertException e) {
            throw  new E_JPKIUserCertException(e.getErrorCode());
        }
    }

    @Override
    public void showCertViewer() throws E_JPKIUserCertException {
        try{
            service.showCertViewer();
        }catch (JPKIUserCertException e) {
            throw  new E_JPKIUserCertException(e.getErrorCode());
        }
    }

    @Override
    public E_JPKIUserCertCertStatus verifyCert() throws E_JPKIUserCertException {
        try{
            JPKIUserCertCertStatus statuskun=service.verifyCert();
            return new E_JPKIUserCertCertStatus(statuskun.getCertStatus(),statuskun.getCertPathStatus(),statuskun.getResponseStatus());
        }catch (JPKIUserCertException e) {
            throw  new E_JPKIUserCertException(e.getErrorCode());
        }
    }
}
