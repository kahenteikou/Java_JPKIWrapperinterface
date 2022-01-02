package io.github.kahenteikou.jpkilib.interfaces;

public class E_JPKIUserCertException extends Exception{
    public enum JPKI_errcode_UserCert{
        JPKI_NOERR,
        JPKI_CVS_FALSE_CL_CREATE_REQUEST,
        JPKI_CVS_FALSE_CL_CVSURL,
        JPKI_CVS_FALSE_CL_GETCERT,
        JPKI_CVS_FALSE_CL_HTTP,
        JPKI_CVS_FALSE_SV_ANALYZE,
        JPKI_CVS_FALSE_SV_CERT_VERYFY,
        JPKI_CVS_FALSE_SV_DECODE,
        JPKI_CVS_FALSE_SV_NONCE,
        JPKI_CVS_FALSE_SV_SIGN_VERIFY_SIGNATURE,
        JPKI_USER_FALSE_DECODE_CERT,
        JPKI_USER_FALSE_ICCARD_NOT_READY,
        JPKI_USER_FALSE_SHOW_VIEWER
    }
    private JPKI_errcode_UserCert errcode=JPKI_errcode_UserCert.JPKI_NOERR;
    public E_JPKIUserCertException(JPKI_errcode_UserCert err){
        errcode=err;
    }
}
