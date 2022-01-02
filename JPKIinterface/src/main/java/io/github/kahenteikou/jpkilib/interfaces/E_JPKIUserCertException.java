package io.github.kahenteikou.jpkilib.interfaces;

public class E_JPKIUserCertException extends Exception{
    public enum JPKI_errcode_UserCert{
        JPKI_CVS_FALSE_CL_CREATE_REQUEST(-5),
        JPKI_CVS_FALSE_CL_CVSURL(-13),
        JPKI_CVS_FALSE_CL_GETCERT(-14),
        JPKI_CVS_FALSE_CL_HTTP(-6),
        JPKI_CVS_FALSE_SV_ANALYZE(-12),
        JPKI_CVS_FALSE_SV_CERT_VERYFY(-11),
        JPKI_CVS_FALSE_SV_DECODE(-7),
        JPKI_CVS_FALSE_SV_NONCE(-10),
        JPKI_CVS_FALSE_SV_SIGN_VERIFY_SIGNATURE(-9),
        JPKI_USER_FALSE_DECODE_CERT(-104),
        JPKI_USER_FALSE_ICCARD_NOT_READY(-106),
        JPKI_USER_FALSE_SHOW_VIEWER(-105);
        private final int valuekun;
        private JPKI_errcode_UserCert(int i){
            valuekun=i;
        }
        public int getInt(){
            return valuekun;
        }
    }
    private JPKI_errcode_UserCert errcode=JPKI_errcode_UserCert.JPKI_USER_FALSE_SHOW_VIEWER;
    public E_JPKIUserCertException(JPKI_errcode_UserCert err){
        errcode=err;
    }
    public E_JPKIUserCertException(int err){
        for(JPKI_errcode_UserCert e:JPKI_errcode_UserCert.values()){
            if(e.getInt()==err){
                errcode=e;
            }
        }
    }
}
