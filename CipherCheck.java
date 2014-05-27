import java.security.*;
import javax.crypto.Cipher;

class CipherCheck{
        static String [] algorithmes = {"AES/CBC/PKCS5Padding",
		"AES/CBC/NoPadding",
		"AES/ECB/NoPadding",
		"AES/ECB/PKCS5Padding",
		"DES/CBC/NoPadding",
		"DES/CBC/PKCS5Padding",
		"DES/ECB/NoPadding",
		"DES/ECB/PKCS5Padding",
		"DESede/CBC/NoPadding",
		"DESede/CBC/PKCS5Padding",
		"DESede/ECB/NoPadding",
		"DESede/ECB/PKCS5Padding",
		"RSA/ECB/PKCS1Padding",
		"RSA/ECB/OAEPWithSHA-1AndMGF1Padding",
		"RSA/ECB/OAEPWithSHA-256AndMGF1Padding"};
        public static void  main(String args[]){
                for(String algo : algorithmes){
                        try{
                                Cipher cipher = Cipher.getInstance(algo);
                                System.out.println("The max Key Len allowed for : " + algo +" is : " + cipher.getMaxAllowedKeyLength(algo));
                                System.out.println("The provider for : " + algo + " is: " + cipher.getProvider().toString());
                        }catch(Exception e){}
                }
        }
}
