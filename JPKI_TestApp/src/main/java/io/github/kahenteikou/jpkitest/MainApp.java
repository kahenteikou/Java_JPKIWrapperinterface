package io.github.kahenteikou.jpkitest;
import io.github.kahenteikou.jpkilib.core.JPKICryptAuth_E;
import io.github.kahenteikou.jpkilib.core.JPKICryptSign_E;
import io.github.kahenteikou.jpkilib.interfaces.E_JPKICryptAuthJNIException;
import io.github.kahenteikou.jpkilib.interfaces.E_JPKICryptSignJNIException;

import java.net.MalformedURLException;

public class MainApp {
    public static void main(String[] args){
        if(args.length > 1){
            System.out.println(args[0]);
            int selectvalue=Integer.parseInt(args[0]);
            switch (selectvalue){
                case 0:

                    try {
                        JPKICryptSign_E jpkikun=new JPKICryptSign_E(args[1]);
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
                    }catch (E_JPKICryptSignJNIException e){
                        e.printStackTrace();
                    }
                    break;
                case 1:
                    try{
                        JPKICryptAuth_E jpki22=new JPKICryptAuth_E(args[1]);
                        long hProvider=jpki22.cryptAcquireContext(0);
                        try{
                            long hKey=jpki22.cryptGetUserKey(hProvider);
                            try{
                                jpki22.cryptGetCertificateValue(hKey);
                            }finally {
                                jpki22.cryptDestroyKey(hKey);
                            }
                        }finally {
                            jpki22.cryptReleaseContext(hProvider);
                        }
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (E_JPKICryptAuthJNIException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    break;
            }

        }
    }
}
