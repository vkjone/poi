package cn.lmf;

import cn.lmf.entity.DocEntity;
import cn.lmf.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ResolveJson {
    public static DocEntity resovle() {
        File jsonFile = new File("D:\\IotProjects\\poi\\src\\main\\resources\\demo.json");
        FileInputStream is = null;
        StringBuilder stringBuilder = null;
        try {
            /**
             * 文件有内容才去读文件
             */
            is = new FileInputStream(jsonFile);
            InputStreamReader streamReader = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(streamReader);
            String line;
            stringBuilder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                // stringBuilder.append(line);
                stringBuilder.append(line);
            }
            reader.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        DocEntity entity = JsonUtil.parseJson(String.valueOf(stringBuilder), new TypeReference<DocEntity>() {
        });
        return entity;
    }
}
