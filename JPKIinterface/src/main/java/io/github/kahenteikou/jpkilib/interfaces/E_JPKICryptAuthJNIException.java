package io.github.kahenteikou.jpkilib.interfaces;

public class E_JPKICryptAuthJNIException extends Exception{
    public enum JPKI_ERR{
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
    private static int errcode = 0;
    private static int werrcode = 0;

    public E_JPKICryptAuthJNIException() {
    }

    public E_JPKICryptAuthJNIException(int errcode, int errcode_w, String strDetail) {
        super(strDetail);
        errcode = errcode;
        werrcode = errcode_w;
    }

    public int getErrCode() {
        return errcode;
    }
    public int getWinErrCode() {
        return werrcode;
    }
}
