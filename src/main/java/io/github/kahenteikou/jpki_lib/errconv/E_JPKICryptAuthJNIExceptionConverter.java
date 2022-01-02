package io.github.kahenteikou.jpki_lib.errconv;

import io.github.kahenteikou.jpkilib.interfaces.E_JPKICryptAuthJNIException;
import jp.go.jpki.appli.JPKICryptAuthJNIException;

public class E_JPKICryptAuthJNIExceptionConverter {
    public static E_JPKICryptAuthJNIException convert(int errcodea, int errcode_w, String strDetail){
        E_JPKICryptAuthJNIException.JPKI_ERR errkun = E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_NOERR;
        E_JPKICryptAuthJNIException.JPKI_ERR errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_NOERR;
        switch(errcodea){
            case JPKICryptAuthJNIException.JPKI_ERR_JAVA_NOMEMORY:
                errkun= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_ERR_JAVA_NOMEMORY;
                break;
            case JPKICryptAuthJNIException.JPKI_ERR_NOMEMORY:
                errkun= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_ERR_NOMEMORY;
                break;
            case JPKICryptAuthJNIException.JPKI_ERR_PARAM:
                errkun= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_ERR_PARAM;
                break;
            case JPKICryptAuthJNIException.JPKI_ERR_UNKNOWN:
                errkun= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_ERR_UNKNOWN;
                break;
            case JPKICryptAuthJNIException.JPKI_ERR_WINDOWS:
                errkun= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_ERR_WINDOWS;
                break;
            default:
                break;
        }
        switch(errcode_w){
            case JPKICryptAuthJNIException.JPKI_WIN_CANCELLED_BY_USER:
                errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_WIN_CANCELLED_BY_USER;
                break;
            case JPKICryptAuthJNIException.JPKI_WIN_CHV_BLOCKED:
                errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_WIN_CHV_BLOCKED;
                break;
            case JPKICryptAuthJNIException.JPKI_WIN_ERR_BAD_HASH:
                errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_WIN_ERR_BAD_HASH;
                break;
            case JPKICryptAuthJNIException.JPKI_WIN_ERR_BAD_HASH_STATE:
                errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_WIN_ERR_BAD_HASH_STATE;
                break;
            case JPKICryptAuthJNIException.JPKI_WIN_ERR_BAD_KEY:
                errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_WIN_ERR_BAD_KEY;
                break;
            case JPKICryptAuthJNIException.JPKI_WIN_ERR_BAD_UID:
                errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_WIN_ERR_BAD_UID;
                break;
            case JPKICryptAuthJNIException.JPKI_WIN_ERR_BAD_VER:
                errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_WIN_ERR_BAD_VER;
                break;
            case JPKICryptAuthJNIException.JPKI_WIN_ERR_NO_MEMORY:
                errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_WIN_ERR_NO_MEMORY;
                break;
            case JPKICryptAuthJNIException.JPKI_WIN_NOT_READY:
                errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_WIN_NOT_READY;
                break;
            case JPKICryptAuthJNIException.JPKI_WIN_UNKNOWN_CARD:
                errkunw= E_JPKICryptAuthJNIException.JPKI_ERR.JPKI_WIN_UNKNOWN_CARD;
                break;
        }
        return new E_JPKICryptAuthJNIException(errkun,errkunw,strDetail);
    }
}
