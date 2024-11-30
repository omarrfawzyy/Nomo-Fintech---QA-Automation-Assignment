package MobileActions.GenericMethods;

import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.FileWriter;

public class JsonFileMethods {
    public static String getValueFromJson(String fileName, String key) {
        try {
            JSONObject jsonObject = (JSONObject) new JSONParser().parse(new FileReader(fileName));
            return (String) jsonObject.get(key);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeStringToJsonFileGeneric(String str, String filename, String key) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(key, str);

        try (FileWriter file = new FileWriter(filename)) {
            file.write(jsonObject.toJSONString());
            System.out.println("Successfully written string to file...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void modifyWritingStringToJsonFileGeneric(String str, String filename, String key) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode nodes = mapper.readValue(new File(filename),ObjectNode.class);
        nodes.put(key, str);
        mapper.writer().writeValue(new File(filename), nodes);

    }

}
