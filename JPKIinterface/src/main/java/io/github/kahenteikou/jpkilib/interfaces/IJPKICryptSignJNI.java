package io.github.kahenteikou.jpkilib.interfaces;

public interface IJPKICryptSignJNI {
    enum JPKI_CRYPTSIGN_OPTS{
        JPKI_CALG_SHA_256,
        JPKI_CALG_SHA1,
        JPKI_VERIFYCONTEXT
    }
    long certCreateCertificateContext(byte[] certValue) throws E_JPKICryptSignJNIException;
    void certFreeCertificateContext(long hCert) throws E_JPKICryptSignJNIException;
    byte[]  certGetPublicKeyInfo(long hCert) throws E_JPKICryptSignJNIException;
    long cryptAcquireContext(int flag) throws E_JPKICryptSignJNIException;
    long cryptCreateHash(long hProv) throws E_JPKICryptSignJNIException;
    long cryptCreateHash(long hProv, int algid) throws E_JPKICryptSignJNIException;
    void 	cryptDestroyHash(long hHash) throws E_JPKICryptSignJNIException;
    void 	cryptDestroyKey(long hKey) throws E_JPKICryptSignJNIException;
    byte[] 	cryptGetCertificateValue(long hKey) throws E_JPKICryptSignJNIException;
    byte[] 	cryptGetHashValue(long hHash) throws E_JPKICryptSignJNIException;
    byte[] 	cryptGetRootCertificateValue(long hProv) throws E_JPKICryptSignJNIException;
    long 	cryptGetUserKey(long hProv) throws E_JPKICryptSignJNIException;
    void 	cryptHashData(long hHash, byte[] data) throws E_JPKICryptSignJNIException;
    long 	cryptImportPublicKey(long hProv, byte[] publicKeyInfo) throws E_JPKICryptSignJNIException;
    void 	cryptReleaseContext(long hProv) throws E_JPKICryptSignJNIException;
    void 	cryptSetHashValue(long hHash, byte[] data) throws E_JPKICryptSignJNIException;
    byte[] 	cryptSignHash(long hHash) throws E_JPKICryptSignJNIException;
    boolean 	cryptVerifySignature(long hHash, byte[] signature, long hPubKey) throws E_JPKICryptSignJNIException;

}
