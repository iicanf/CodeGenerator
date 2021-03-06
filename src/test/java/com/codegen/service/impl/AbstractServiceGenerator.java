package com.codegen.service.impl;

import com.codegen.service.CodeGenerator;
import com.codegen.service.CodeGeneratorConfig;
import com.codegen.service.CodeGeneratorManager;
import com.codegen.util.StringUtils;
import com.google.common.base.CaseFormat;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Controller层 代码生成器
 * Created by zhh on 2017/09/20.
 */
public class AbstractServiceGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genCode(String tableName, String modelName, String sign) {
        Configuration cfg = getFreemarkerConfiguration();

        Map<String, Object> data = getDataMapInit();
        try {
            File controllerFile = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_SERVICE + "/AbstractService.java");
            if (!controllerFile.getParentFile().exists()) {
                controllerFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("abstractService.ftl").process(data, new FileWriter(controllerFile));
            logger.info("AbstractService.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("AbstractService 生成失败!", e);
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
