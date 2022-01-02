package io.github.kahenteikou.jpkitest;
import io.github.kahenteikou.jpkilib.core.JPKICryptSign_E;
import io.github.kahenteikou.jpkilib.interfaces.E_JPKICryptAuthJNIException;

import java.net.MalformedURLException;

public class MainApp {
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println(args[0]);
            try {
                JPKICryptSign_E jpkikun=new JPKICryptSign_E(args[0]);
                long hProvider=jpkikun.cryptAcquireContext(0);
                try{
                    long hKey = jpkikun.cryptGetUserKey(hProvider);
                    try {
                        jpkikun.cryptGetCertificateValue(hKey);
                    } finally {
                        jpkikun.cryptDestroyKey(hKey);
                    }
                }finally {
                    jpkikun.cryptReleaseContext(hProvider);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }catch (E_JPKICryptAuthJNIException e){
                e.printStackTrace();
            }

        }
    }
}
