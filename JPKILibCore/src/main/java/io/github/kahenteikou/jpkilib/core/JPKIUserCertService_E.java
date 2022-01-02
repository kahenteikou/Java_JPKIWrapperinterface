package io.github.kahenteikou.jpkilib.core;

import io.github.kahenteikou.jpkilib.interfaces.*;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class JPKIUserCertService_E{
    private static Constructor<?> yobidasiconstructor=null;
    private static Class yobidasicls=null;
    public static void Load_Lib(String JPKIJar_Path,String ModuleJar_path) throws ClassNotFoundException, MalformedURLException, NoSuchMethodException {
        File jpkijarfile=new File(JPKIJar_Path);
        File modulejarfile=new File(ModuleJar_path);
        URLClassLoader loader=URLClassLoader.newInstance(new URL[]{jpkijarfile.toURI().toURL(),modulejarfile.toURI().toURL()});
        yobidasicls=loader.loadClass("io.github.kahenteikou.jpki_lib.wrappers.JPKIUserCertService_W");
        yobidasiconstructor=yobidasicls.getConstructor(byte[].class);

    }
    public static void Load_Lib(String ModuleJar_path) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException {
        Load_Lib(System.getenv("ProgramFiles")+"\\JPKILib\\Javalib64\\JPKIUserCertService.jar",ModuleJar_path);
    }
    private EX_JPKIUserCertService target_class;
    public JPKIUserCertService_E(byte[] data) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        target_class=(EX_JPKIUserCertService) yobidasiconstructor.newInstance(data);
    }
    public JPKIUserCertService_E() throws InstantiationException, IllegalAccessException {
        target_class=(EX_JPKIUserCertService)yobidasicls.newInstance();
    }
    public IJPKIConfirmResult confirm() throws E_JPKIUserCertException{
        return target_class.confirm();
    }
    public E_JPKIUserCertBasicData  	getBasicData()throws E_JPKIUserCertException{
        return target_class.getBasicData();
    }
    public E_JPKICardType getCardType()throws E_JPKIUserCertException{
        return target_class.getCardType();
    }
    public void showCertViewer() throws E_JPKIUserCertException {
        target_class.showCertViewer();
    }
    public E_JPKIUserCertCertStatus verifyCert() throws E_JPKIUserCertException {
        return target_class.verifyCert();
    }

}