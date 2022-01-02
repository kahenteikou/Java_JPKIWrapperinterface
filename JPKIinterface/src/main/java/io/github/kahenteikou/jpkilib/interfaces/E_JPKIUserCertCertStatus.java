package io.github.kahenteikou.jpkilib.interfaces;


public class E_JPKIUserCertCertStatus {
    public enum CertStatus{
        JPKI_CVS_OK(0),
        JPKI_CVS_NG(-1),
        JPKI_CVS_RESSTATUS_NG(-8);
        private final int valuekun;
        private CertStatus(final int valuekun){
            this.valuekun=valuekun;
        }
        public int getInt(){
            return valuekun;
        }
    }
    public enum  PathStatus{
        JPKI_CVS_CERTSTATUS_OF_OCSP_RESPONSE_IS_UNKNOWN(206),
        JPKI_CVS_CONSTRAINTS_ERROR (205),
        JPKI_CVS_GOOD 	(0),
        JPKI_CVS_INTERNAL_PATH_CONSTRUCTION_ERROR 	(101),
        JPKI_CVS_ONE_OR_MORE_CERTIFICATES_ARE_REVOKED( 	203),
        JPKI_CVS_POLICY_MAPPING_ERROR 	(204),
        JPKI_CVS_REJECTED_A_REQUEST 	(901),
        JPKI_CVS_REJECTED_BY_ALGORITHM_CA 	(302),
        JPKI_CVS_REJECTED_BY_ALGORITHM_EE 	(301),
        JPKI_CVS_SIGNATURE_VERIFICATION_FAILURE 	(202),
        JPKI_CVS_VALIDATION_TIMEOUT 	(902);
        private final int valuekun;
        private PathStatus(final int valuekun22){
            this.valuekun=valuekun22;
        }
        public int getInt(){
            return valuekun;
        }
    }
    public enum ResponseStatus{
        JPKI_CVS_RESSTATUS_INTERNALERROR(2),
        JPKI_CVS_RESSTATUS_MALFORMEDREQUEST(1),
        JPKI_CVS_RESSTATUS_SIGREQUIRED(5),
        JPKI_CVS_RESSTATUS_SUCCESSFUL(0),
        JPKI_CVS_RESSTATUS_TRYLATER(3),
        JPKI_CVS_RESSTATUS_UNAUTHORIZED(6);
        private final int valuekun;
        private ResponseStatus(final int valuekun22){
            this.valuekun=valuekun22;
        }
        public int getInt(){
            return valuekun;
        }

    }
    public static CertStatus TocertStatus(int i){
        for(CertStatus c:CertStatus.values()){
            if(c.getInt()==i) return c;
        }
        return null;
    }
    public static PathStatus ToPathStatus(int i){
        for(PathStatus c:PathStatus.values()){
            if(c.getInt()==i) return c;
        }
        return null;
    }
    public static ResponseStatus ToResponseStatus(int i){
        for(ResponseStatus c:ResponseStatus.values()){
            if(c.getInt()==i) return c;
        }
        return null;
    }
    private CertStatus certStatus=CertStatus.JPKI_CVS_OK;
    private PathStatus certpathstatus=PathStatus.JPKI_CVS_GOOD;
    private ResponseStatus responsestatus=ResponseStatus.JPKI_CVS_RESSTATUS_SUCCESSFUL;
    public E_JPKIUserCertCertStatus(CertStatus certkun,PathStatus certPathkun,ResponseStatus responsekun){
        this.certStatus=certkun;
        this.certpathstatus=certPathkun;
        this.responsestatus=responsekun;
    }
    public E_JPKIUserCertCertStatus(int certkun,int pathkun,int respkun){
        this(TocertStatus(certkun),ToPathStatus(pathkun),ToResponseStatus(respkun));
    }
    public CertStatus  	getCertStatus(){
        return certStatus;
    }
    public PathStatus  	getCertPathStatus(){
        return certpathstatus;
    }
    public ResponseStatus getResponseStatus(){
        return responsestatus;
    }


}
