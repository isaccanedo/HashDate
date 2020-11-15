package br.com.isaccanedo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Isac Canedo
 */

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        cifrar();

    }

    public static void cifrar() throws NoSuchAlgorithmException {
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat(("dd-MM-yyyy hh:mm:ss"));
        String dataAtual = f.format(date);

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.reset();
        md.update(dataAtual.getBytes());
        System.out.println("O Hash para a data atual  " + dataAtual + " é:");
        System.out.println(new BigInteger(1, md.digest()).toString(16));
    }

}
