package io.github.kahenteikou.jpki_lib.errconv;

import io.github.kahenteikou.jpkilib.interfaces.E_JPKICryptSignJNIException;
import jp.go.jpki.appli.JPKICryptSignJNIException;

public class E_JPKICryptSignJNIExceptionConverter {
    public static E_JPKICryptSignJNIException convert(int errcodea, int errcode_w, String strDetail){
        E_JPKICryptSignJNIException.JPKI_ERR errkun = E_JPKICryptSignJNIException.JPKI_ERR.JPKI_NOERR;
        E_JPKICryptSignJNIException.JPKI_ERR errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_NOERR;
        switch(errcodea){
            case JPKICryptSignJNIException.JPKI_ERR_JAVA_NOMEMORY:
                errkun= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_ERR_JAVA_NOMEMORY;
                break;
            case JPKICryptSignJNIException.JPKI_ERR_NOMEMORY:
                errkun= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_ERR_NOMEMORY;
                break;
            case JPKICryptSignJNIException.JPKI_ERR_PARAM:
                errkun= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_ERR_PARAM;
                break;
            case JPKICryptSignJNIException.JPKI_ERR_UNKNOWN:
                errkun= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_ERR_UNKNOWN;
                break;
            case JPKICryptSignJNIException.JPKI_ERR_WINDOWS:
                errkun= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_ERR_WINDOWS;
                break;
            default:
                break;
        }
        switch(errcode_w){
            case JPKICryptSignJNIException.JPKI_WIN_CANCELLED_BY_USER:
                errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_WIN_CANCELLED_BY_USER;
                break;
            case JPKICryptSignJNIException.JPKI_WIN_CHV_BLOCKED:
                errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_WIN_CHV_BLOCKED;
                break;
            case JPKICryptSignJNIException.JPKI_WIN_ERR_BAD_HASH:
                errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_WIN_ERR_BAD_HASH;
                break;
            case JPKICryptSignJNIException.JPKI_WIN_ERR_BAD_HASH_STATE:
                errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_WIN_ERR_BAD_HASH_STATE;
                break;
            case JPKICryptSignJNIException.JPKI_WIN_ERR_BAD_KEY:
                errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_WIN_ERR_BAD_KEY;
                break;
            case JPKICryptSignJNIException.JPKI_WIN_ERR_BAD_UID:
                errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_WIN_ERR_BAD_UID;
                break;
            case JPKICryptSignJNIException.JPKI_WIN_ERR_BAD_VER:
                errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_WIN_ERR_BAD_VER;
                break;
            case JPKICryptSignJNIException.JPKI_WIN_ERR_NO_MEMORY:
                errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_WIN_ERR_NO_MEMORY;
                break;
            case JPKICryptSignJNIException.JPKI_WIN_NOT_READY:
                errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_WIN_NOT_READY;
                break;
            case JPKICryptSignJNIException.JPKI_WIN_UNKNOWN_CARD:
                errkunw= E_JPKICryptSignJNIException.JPKI_ERR.JPKI_WIN_UNKNOWN_CARD;
                break;
        }
        return new E_JPKICryptSignJNIException(errkun,errkunw,strDetail);
    }
}
