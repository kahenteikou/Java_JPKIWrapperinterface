package io.github.kahenteikou.jpki_lib.wrappers;

import io.github.kahenteikou.jpki_lib.errconv.E_JPKICryptAuthJNIExceptionConverter;
import io.github.kahenteikou.jpkilib.interfaces.E_JPKICryptAuthJNIException;
import io.github.kahenteikou.jpkilib.interfaces.IJPKICryptAuthJNI;
import jp.go.jpki.appli.JPKICryptAuthJNI;
import jp.go.jpki.appli.JPKICryptAuthJNIException;

public class JPKICryptAuth_W implements IJPKICryptAuthJNI {
    private JPKICryptAuthJNI jpkikun;
    public JPKICryptAuth_W(){
        jpkikun=new JPKICryptAuthJNI();
    }
    @Override
    public long certCreateCertificateContext(byte[] certValue) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.certCreateCertificateContext(certValue);
        } catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void certFreeCertificateContext(long hCert) throws E_JPKICryptAuthJNIException {
        try{
            jpkikun.certFreeCertificateContext(hCert);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public byte[] certGetPublicKeyInfo(long hCert) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.certGetPublicKeyInfo(hCert);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public long cryptAcquireContext(int flag) throws E_JPKICryptAuthJNIException {
        try{
            return  jpkikun.cryptAcquireContext(flag);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public long cryptCreateHash(long hProv) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.cryptCreateHash(hProv);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public long cryptCreateHash(long hProv, int algid) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.cryptCreateHash(hProv,algid);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void cryptDestroyHash(long hHash) throws E_JPKICryptAuthJNIException {
        try{
            jpkikun.cryptDestroyHash(hHash);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void cryptDestroyKey(long hKey) throws E_JPKICryptAuthJNIException {
        try{
            jpkikun.cryptDestroyKey(hKey);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public byte[] cryptGetCertificateValue(long hKey) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.cryptGetCertificateValue(hKey);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public byte[] cryptGetHashValue(long hHash) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.cryptGetHashValue(hHash);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public byte[] cryptGetRootCertificateValue(long hProv) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.cryptGetRootCertificateValue(hProv);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public long cryptGetUserKey(long hProv) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.cryptGetUserKey(hProv);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void cryptHashData(long hHash, byte[] data) throws E_JPKICryptAuthJNIException {
        try{
            jpkikun.cryptHashData(hHash,data);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public long cryptImportPublicKey(long hProv, byte[] publicKeyInfo) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.cryptImportPublicKey(hProv,publicKeyInfo);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void cryptReleaseContext(long hProv) throws E_JPKICryptAuthJNIException {
        try{
            jpkikun.cryptReleaseContext(hProv);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public void cryptSetHashValue(long hHash, byte[] data) throws E_JPKICryptAuthJNIException {
        try{
            jpkikun.cryptSetHashValue(hHash,data);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public byte[] cryptSignHash(long hHash) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.cryptSignHash(hHash);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }

    @Override
    public boolean cryptVerifySignature(long hHash, byte[] signature, long hPubKey) throws E_JPKICryptAuthJNIException {
        try{
            return jpkikun.cryptVerifySignature(hHash,signature,hPubKey);
        }catch (JPKICryptAuthJNIException e) {
            throw E_JPKICryptAuthJNIExceptionConverter.convert(e.getErrorCode(),e.getWinErrorCode(),e.getMessage());
        }
    }
}
