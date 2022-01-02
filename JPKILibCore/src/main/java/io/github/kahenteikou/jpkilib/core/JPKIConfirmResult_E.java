package io.github.kahenteikou.jpkilib.core;

import io.github.kahenteikou.jpkilib.interfaces.IJPKIConfirmResult;
import io.github.kahenteikou.jpkilib.interfaces.IJPKICryptAuthJNI;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class JPKIConfirmResult_E implements IJPKIConfirmResult {
    private IJPKIConfirmResult target_class;
    public JPKIConfirmResult_E(String JPKIJar_Path,String ModuleJar_path) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //File file=new File(System.getenv("ProgramFiles")+"\\JPKILib\\Javalib64\\JPKICryptSignJNI.jar");

        File jpkijarfile=new File(JPKIJar_Path);
        File modulejarfile=new File(ModuleJar_path);
        URLClassLoader loader=URLClassLoader.newInstance(new URL[]{jpkijarfile.toURI().toURL(),modulejarfile.toURI().toURL()});
        Class cl=loader.loadClass("io.github.kahenteikou.jpki_lib.wrappers.JPKIConfirmResult_W");
        target_class=(IJPKIConfirmResult) cl.newInstance();
    }
    @Override
    public ConfirmEnum getCode() {
        return target_class.getCode();
    }

    @Override
    public Exception getException() {
        return target_class.getException();
    }

    @Override
    public String getMessage() {
        return target_class.getMessage();
    }
}
