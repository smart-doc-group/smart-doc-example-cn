package com.power.doc.utils;

import com.google.gson.Gson;
import com.power.common.util.CollectionUtil;
import io.github.smartdoc.model.ApiConfig;
import io.github.smartdoc.model.ApiDataDictionary;
import io.github.smartdoc.model.ApiErrorCodeDictionary;
import io.github.smartdoc.model.SourceCodePath;
import lombok.experimental.UtilityClass;

import java.io.*;
import java.util.List;
import java.util.Objects;

/**
 * ApiConfigUtils
 *
 * @author linwumingshi
 */
@UtilityClass
public class ApiConfigUtils {


    /**
     * Get Demo ApiConfig
     *
     * @return ApiConfig
     * @throws IOException IOException
     */
    public static ApiConfig getProjectApiConfig() throws IOException {
        // Read JSON from file
        try (Reader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(ApiConfigUtils.class.getClassLoader().getResourceAsStream("smart-doc.json"))))) {

            // get gson
            Gson gson = new Gson();

            // convert JSON to ApiConfig
            ApiConfig apiConfig = gson.fromJson(reader, ApiConfig.class);
            if (Objects.isNull(apiConfig)) {
                return null;
            }

            // set baseDir and codePath
            apiConfig.setBaseDir(System.getProperty("user.dir"));
            apiConfig.setCodePath("src/main/java");

            // set sourceCodePath
            String path = apiConfig.getBaseDir() + File.separator + apiConfig.getCodePath();
            SourceCodePath sourceCodePath = SourceCodePath.builder().setPath(path);
            apiConfig.setSourceCodePaths(sourceCodePath);

            List<ApiErrorCodeDictionary> errorCodeDictionaries = apiConfig.getErrorCodeDictionaries();
            if (CollectionUtil.isNotEmpty(errorCodeDictionaries)) {
                for (ApiErrorCodeDictionary errorCodeDictionary : errorCodeDictionaries) {
                    errorCodeDictionary.setEnumClass(Class.forName(errorCodeDictionary.getEnumClassName()));
                }
            }
            List<ApiDataDictionary> dataDictionaries = apiConfig.getDataDictionaries();
            if (CollectionUtil.isNotEmpty(dataDictionaries)) {
                for (ApiDataDictionary dataDictionary : dataDictionaries) {
                    dataDictionary.setEnumClass(Class.forName(dataDictionary.getEnumClassName()));
                }
            }
            return apiConfig;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
