package fr.hoc.dap.Boutons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Data {

    public static String getData(final String desiredUrl) throws Exception {

        URL url = null;
        BufferedReader reader = null;
        StringBuilder stringBuilder;

        try {

            url = new URL(desiredUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            connection.setReadTimeout(15 * 1000);
            connection.connect();

            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            stringBuilder = new StringBuilder();

            String line = null;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line + "\n");
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            //TODO lbpmg by Djer |Log4J| Une petite LOG en erreur ? 
            throw e;
        } finally {

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ioe) {
                  //TODO lbpmg by Djer |Log4J| Une petite LOG en erreur ? 
                    ioe.printStackTrace();
                }
            }
        }
    }
}
