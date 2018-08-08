package com.codegen.service.impl;

import com.codegen.service.CodeGenerator;
import com.codegen.service.CodeGeneratorManager;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Controller层 代码生成器
 * Created by zhh on 2017/09/20.
 */
public class DaoInterfaceGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genCode(String tableName, String modelName, String sign) {
        Configuration cfg = getFreemarkerConfiguration();

        Map<String, Object> data = getDataMapInit();
        try {
            File controllerFile = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_DAO + "/Dao.java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("dao-interface.ftl").process(data, new FileWriter(controllerFile));
            logger.info("dao-interface.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("dao-interface 生成失败!", e);
        }
    }

    /**
     * 预置页面所需数据
     **
     * @return
     */
    private Map<String, Object> getDataMapInit() {
        Map<String, Object> data = new HashMap<>();
        data.put("date", DATE);
        data.put("author", AUTHOR);
        data.put("basePackage", BASE_PACKAGE);

        return data;
    }
}
