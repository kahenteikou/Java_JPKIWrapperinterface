package io.github.kahenteikou.jpkilib.interfaces;

public interface IJPKIConfirmResult {
    public enum ConfirmEnum{
        JPKI_CLIENT_EXPIRED_ERROR(708),
        JPKI_CLIENT_FALSE_DECODE_CERT(705),
        JPKI_CLIENT_HTTP_NOT_ACCESS 	(707),
        JPKI_CLIENT_ICCARD_BLOCKED 	(703),
        JPKI_CLIENT_ICCARD_NOT_READY 	(704),
        JPKI_CLIENT_LOGIN_CANCEL 	(700),
        JPKI_CLIENT_NOMEMORY 	(701),
        JPKI_CLIENT_NOT_YET_VALID 	(709),
        JPKI_CLIENT_ONLINE_TIME 	(706),
        JPKI_CLIENT_UNEXPECTED_ERR 	(702),
        JPKI_CONFIRM_OK 	(200),
        JPKI_SERVER_APPLY_ERROR 	(601),
        JPKI_SERVER_APPLYED_ERROR 	(608),
        JPKI_SERVER_CERT_UNMATCH_ERROR 	(622),
        JPKI_SERVER_DATA_ERROR 	(603),
        JPKI_SERVER_DB_ERROR (609),
        JPKI_SERVER_EXPIRED_ERROR (602),
        JPKI_SERVER_HOLD_ERROR (613),
        JPKI_SERVER_ISSUER_ERROR(604),
        JPKI_SERVER_JAM_ERROR 	(611),
        JPKI_SERVER_OCSP_ERROR 	(606),
        JPKI_SERVER_OTHER_ERROR 	(612),
        JPKI_SERVER_REVOKED_ERROR 	(607),
        JPKI_SERVER_VALIDITY_ERROR 	(605),
        JPKI_SERVER_VERIFY_ERROR 	(600);
        private final int valuekun;
        private ConfirmEnum(int valuekun222){
            this.valuekun=valuekun222;
        }
        public int getInt(){
            return valuekun;
        }
    }
    public static ConfirmEnum toConfirmEnum(int valueun){
        for(ConfirmEnum ekun:ConfirmEnum.values()){
            if(ekun.getInt() == valueun){
                return ekun;
            }
        }
        return null;
    }
    public ConfirmEnum getCode();
    public Exception getException();
    public String getMessage();
}
