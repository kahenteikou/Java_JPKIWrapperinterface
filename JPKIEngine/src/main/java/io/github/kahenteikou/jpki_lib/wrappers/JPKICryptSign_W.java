package io.github.kahenteikou.jpki_lib.wrappers;

import io.github.kahenteikou.jpki_lib.errconv.E_JPKICryptSignJNIExceptionConverter;
import io.github.kahenteikou.jpkilib.interfaces.E_JPKICryptSignJNIException;
import jp.go.jpki.appli.JPKICryptSignJNI;
import jp.go.jpki.appli.JPKICryptSignJNIException;

public class JPKICryptSign_W implements io.github.kahenteikou.jpkilib.interfaces.IJPKICryptSignJNI{
    private JPKICryptSignJNI jpkisigncryptkun;
    public JPKICryptSign_W(){
        jpkisigncryptkun=new JPKICryptSignJNI();
    }
    @Override
    public long certCreateCertificateContext(byte[] certValue) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.certCreateCertificateContext(certValue);
        } catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void certFreeCertificateContext(long hCert) throws E_JPKICryptSignJNIException {
        try{
            jpkisigncryptkun.certFreeCertificateContext(hCert);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public byte[] certGetPublicKeyInfo(long hCert) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.certGetPublicKeyInfo(hCert);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public long cryptAcquireContext(int flag) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.cryptAcquireContext(flag);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public long cryptCreateHash(long hProv) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.cryptCreateHash(hProv);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public long cryptCreateHash(long hProv, int algid) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.cryptCreateHash(hProv,algid);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void cryptDestroyHash(long hHash) throws E_JPKICryptSignJNIException {
        try {
            jpkisigncryptkun.cryptDestroyHash(hHash);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void cryptDestroyKey(long hKey) throws E_JPKICryptSignJNIException {
        try{
            jpkisigncryptkun.cryptDestroyKey(hKey);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public byte[] cryptGetCertificateValue(long hKey) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.cryptGetCertificateValue(hKey);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public byte[] cryptGetHashValue(long hHash) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.cryptGetHashValue(hHash);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public byte[] cryptGetRootCertificateValue(long hProv) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.cryptGetRootCertificateValue(hProv);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public long cryptGetUserKey(long hProv) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.cryptGetUserKey(hProv);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void cryptHashData(long hHash, byte[] data) throws E_JPKICryptSignJNIException {
        try{
            jpkisigncryptkun.cryptHashData(hHash,data);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public long cryptImportPublicKey(long hProv, byte[] publicKeyInfo) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.cryptImportPublicKey(hProv,publicKeyInfo);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void cryptReleaseContext(long hProv) throws E_JPKICryptSignJNIException {
        try{
            jpkisigncryptkun.cryptReleaseContext(hProv);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void cryptSetHashValue(long hHash, byte[] data) throws E_JPKICryptSignJNIException {
        try{
            jpkisigncryptkun.cryptSetHashValue(hHash,data);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public byte[] cryptSignHash(long hHash) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.cryptSignHash(hHash);
        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public boolean cryptVerifySignature(long hHash, byte[] signature, long hPubKey) throws E_JPKICryptSignJNIException {
        try{
            return jpkisigncryptkun.cryptVerifySignature(hHash,signature,hPubKey);

        }catch (JPKICryptSignJNIException e) {
            throw E_JPKICryptSignJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }
}
