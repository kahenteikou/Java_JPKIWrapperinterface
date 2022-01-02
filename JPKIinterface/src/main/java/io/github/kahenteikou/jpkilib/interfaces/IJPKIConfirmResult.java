package io.github.kahenteikou.jpkilib.interfaces;

public interface IJPKIConfirmResult {
    public static final int JPKI_CONFIRM_OK = 200;
    public static final int JPKI_SERVER_VERIFY_ERROR = 600;
    public static final int JPKI_SERVER_APPLY_ERROR = 601;
    public static final int JPKI_SERVER_EXPIRED_ERROR = 602;
    public static final int JPKI_SERVER_DATA_ERROR = 603;
    public static final int JPKI_SERVER_ISSUER_ERROR = 604;
    public static final int JPKI_SERVER_VALIDITY_ERROR = 605;
    public static final int JPKI_SERVER_OCSP_ERROR = 606;
    public static final int JPKI_SERVER_REVOKED_ERROR = 607;
    public static final int JPKI_SERVER_APPLYED_ERROR = 608;
    public static final int JPKI_SERVER_DB_ERROR = 609;
    public static final int JPKI_SERVER_JAM_ERROR = 611;
    public static final int JPKI_SERVER_OTHER_ERROR = 612;
    public static final int JPKI_SERVER_HOLD_ERROR = 613;
    public static final int JPKI_SERVER_CERT_UNMATCH_ERROR = 622;
    public static final int JPKI_CLIENT_LOGIN_CANCEL = 700;
    public static final int JPKI_CLIENT_NOMEMORY = 701;
    public static final int JPKI_CLIENT_UNEXPECTED_ERR = 702;
    public static final int JPKI_CLIENT_ICCARD_BLOCKED = 703;
    public static final int JPKI_CLIENT_ICCARD_NOT_READY = 704;
    public static final int JPKI_CLIENT_FALSE_DECODE_CERT = 705;
    public static final int JPKI_CLIENT_ONLINE_TIME = 706;
    public static final int JPKI_CLIENT_HTTP_NOT_ACCESS = 707;
    public static final int JPKI_CLIENT_EXPIRED_ERROR = 708;
    public static final int JPKI_CLIENT_NOT_YET_VALID = 709;
    public int getCode();
    public Exception getException();
    public String getMessage();
}
