package io.github.kahenteikou.jpkilib.interfaces;

public class E_JPKICryptSignJNIException extends Exception{
    public enum JPKI_ERR{
        JPKI_NOERR,
        JPKI_ERR_JAVA_NOMEMORY,
        JPKI_ERR_NOMEMORY,
        JPKI_ERR_PARAM,
        JPKI_ERR_UNKNOWN,
        JPKI_ERR_WINDOWS,
        JPKI_WIN_CANCELLED_BY_USER,
        JPKI_WIN_CHV_BLOCKED,
        JPKI_WIN_ERR_BAD_HASH,
        JPKI_WIN_ERR_BAD_HASH_STATE,
        JPKI_WIN_ERR_BAD_KEY,
        JPKI_WIN_ERR_BAD_UID,
        JPKI_WIN_ERR_BAD_VER,
        JPKI_WIN_ERR_NO_MEMORY,
        JPKI_WIN_NOT_READY,
        JPKI_WIN_UNKNOWN_CARD
    }
    private static JPKI_ERR errcode = JPKI_ERR.JPKI_NOERR;
    private static JPKI_ERR werrcode = JPKI_ERR.JPKI_NOERR;

    public E_JPKICryptSignJNIException() {
    }

    public E_JPKICryptSignJNIException(JPKI_ERR errcodea, JPKI_ERR errcode_w, String strDetail) {
        super(strDetail);
        errcode = errcodea;
        werrcode = errcode_w;
    }

    public JPKI_ERR getErrCode() {
        return errcode;
    }
    public JPKI_ERR getWinErrCode() {
        return werrcode;
    }
}
