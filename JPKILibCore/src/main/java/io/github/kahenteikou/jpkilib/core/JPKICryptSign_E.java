package io.github.kahenteikou.jpkilib.core;

import io.github.kahenteikou.jpkilib.interfaces.E_JPKICryptAuthJNIException;
import io.github.kahenteikou.jpkilib.interfaces.IJPKICryptSignJNI;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class JPKICryptSign_E implements IJPKICryptSignJNI {
    private IJPKICryptSignJNI target_class;
    public JPKICryptSign_E(String JPKIJar_Path,String ModuleJar_path) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //File file=new File(System.getenv("ProgramFiles")+"\\JPKILib\\Javalib64\\JPKICryptSignJNI.jar");

        File jpkijarfile=new File(JPKIJar_Path);
        File modulejarfile=new File(ModuleJar_path);
        URLClassLoader loader=URLClassLoader.newInstance(new URL[]{jpkijarfile.toURI().toURL(),modulejarfile.toURI().toURL()});
        Class cl=loader.loadClass("io.github.kahenteikou.jpki_lib.wrappers.JPKICryptSign_W");
        target_class=(IJPKICryptSignJNI) cl.newInstance();
    }
    public JPKICryptSign_E(String ModuleJar_Path)throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        this(System.getenv("ProgramFiles")+"\\JPKILib\\Javalib64\\JPKICryptSignJNI.jar",ModuleJar_Path);
    }
    @Override
    public long certCreateCertificateContext(byte[] certValue) throws E_JPKICryptAuthJNIException {
        return target_class.certCreateCertificateContext(certValue);
    }

    @Override
    public void certFreeCertificateContext(long hCert) throws E_JPKICryptAuthJNIException {
        target_class.certFreeCertificateContext(hCert);
    }

    @Override
    public byte[] certGetPublicKeyInfo(long hCert) throws E_JPKICryptAuthJNIException {
        return target_class.certGetPublicKeyInfo(hCert);
    }

    @Override
    public long cryptAcquireContext(int flag) throws E_JPKICryptAuthJNIException {
        return target_class.cryptAcquireContext(flag);
    }

    @Override
    public long cryptCreateHash(long hProv) throws E_JPKICryptAuthJNIException {
        return target_class.cryptCreateHash(hProv);
    }

    @Override
    public long cryptCreateHash(long hProv, int algid) throws E_JPKICryptAuthJNIException {
        return target_class.cryptCreateHash(hProv,algid);
    }

    @Override
    public void cryptDestroyHash(long hHash) throws E_JPKICryptAuthJNIException {
        target_class.cryptDestroyHash(hHash);
    }

    @Override
    public void cryptDestroyKey(long hKey) throws E_JPKICryptAuthJNIException {
        target_class.cryptDestroyKey(hKey);
    }

    @Override
    public byte[] cryptGetCertificateValue(long hKey) throws E_JPKICryptAuthJNIException {
        return target_class.cryptGetCertificateValue(hKey);
    }

    @Override
    public byte[] cryptGetHashValue(long hHash) throws E_JPKICryptAuthJNIException {
        return target_class.cryptGetHashValue(hHash);
    }

    @Override
    public byte[] cryptGetRootCertificateValue(long hProv) throws E_JPKICryptAuthJNIException {
        return target_class.cryptGetRootCertificateValue(hProv);
    }

    @Override
    public long cryptGetUserKey(long hProv) throws E_JPKICryptAuthJNIException {
        return target_class.cryptGetUserKey(hProv);
    }

    @Override
    public void cryptHashData(long hHash, byte[] data) throws E_JPKICryptAuthJNIException {
        target_class.cryptHashData(hHash,data);
    }

    @Override
    public long cryptImportPublicKey(long hProv, byte[] publicKeyInfo) throws E_JPKICryptAuthJNIException {
        return target_class.cryptImportPublicKey(hProv,publicKeyInfo);
    }

    @Override
    public void cryptReleaseContext(long hProv) throws E_JPKICryptAuthJNIException {
        target_class.cryptReleaseContext(hProv);
    }

    @Override
    public void cryptSetHashValue(long hHash, byte[] data) throws E_JPKICryptAuthJNIException {
        target_class.cryptSetHashValue(hHash,data);
    }

    @Override
    public byte[] cryptSignHash(long hHash) throws E_JPKICryptAuthJNIException {
        return target_class.cryptSignHash(hHash);
    }

    @Override
    public boolean cryptVerifySignature(long hHash, byte[] signature, long hPubKey) throws E_JPKICryptAuthJNIException {
        return target_class.cryptVerifySignature(hHash,signature,hPubKey);
    }
}
