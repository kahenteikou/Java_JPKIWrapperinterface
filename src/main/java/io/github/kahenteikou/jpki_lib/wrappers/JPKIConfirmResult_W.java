package io.github.kahenteikou.jpki_lib.wrappers;

import io.github.kahenteikou.jpkilib.interfaces.IJPKIConfirmResult;
import jp.go.jpki.appli.JPKIConfirmResult;

public class JPKIConfirmResult_W implements IJPKIConfirmResult {
    private JPKIConfirmResult confresult;
    public JPKIConfirmResult_W(JPKIConfirmResult reskun){
        confresult=reskun;
    }
    @Override
    public ConfirmEnum getCode() {
        return IJPKIConfirmResult.toConfirmEnum(confresult.getCode());
    }

    @Override
    public Exception getException() {
        return confresult.getException();
    }

    @Override
    public String getMessage() {
        return confresult.getMessage();
    }
}
