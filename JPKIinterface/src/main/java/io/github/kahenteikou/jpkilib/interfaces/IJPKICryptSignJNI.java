package io.github.kahenteikou.jpkilib.interfaces;

public interface IJPKICryptSignJNI {
    enum JPKI_CRYPTSIGN_OPTS{
        JPKI_CALG_SHA_256,
        JPKI_CALG_SHA1,
        JPKI_VERIFYCONTEXT
    }
    long certCreateCertificateContext(byte[] certValue) throws E_JPKICryptAuthJNIException;
    void certFreeCertificateContext(long hCert) throws E_JPKICryptAuthJNIException ;
    byte[]  certGetPublicKeyInfo(long hCert) throws E_JPKICryptAuthJNIException;
    long cryptAcquireContext(int flag) throws E_JPKICryptAuthJNIException;
    long cryptCreateHash(long hProv) throws E_JPKICryptAuthJNIException;
    long cryptCreateHash(long hProv, int algid) throws E_JPKICryptAuthJNIException;
    void 	cryptDestroyHash(long hHash) throws E_JPKICryptAuthJNIException;
    void 	cryptDestroyKey(long hKey) throws E_JPKICryptAuthJNIException;
    byte[] 	cryptGetCertificateValue(long hKey) throws E_JPKICryptAuthJNIException;
    byte[] 	cryptGetHashValue(long hHash) throws E_JPKICryptAuthJNIException;
    byte[] 	cryptGetRootCertificateValue(long hProv) throws E_JPKICryptAuthJNIException;
    long 	cryptGetUserKey(long hProv) throws E_JPKICryptAuthJNIException;
    void 	cryptHashData(long hHash, byte[] data) throws E_JPKICryptAuthJNIException;
    long 	cryptImportPublicKey(long hProv, byte[] publicKeyInfo) throws E_JPKICryptAuthJNIException;
    void 	cryptReleaseContext(long hProv) throws E_JPKICryptAuthJNIException;
    void 	cryptSetHashValue(long hHash, byte[] data) throws E_JPKICryptAuthJNIException;
    byte[] 	cryptSignHash(long hHash) throws E_JPKICryptAuthJNIException;
    boolean 	cryptVerifySignature(long hHash, byte[] signature, long hPubKey) throws E_JPKICryptAuthJNIException;

}
