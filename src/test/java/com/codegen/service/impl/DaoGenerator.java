package com.codegen.service.impl;

import com.codegen.service.CodeGenerator;
import com.codegen.service.CodeGeneratorConfig;
import com.codegen.service.CodeGeneratorManager;
import com.codegen.util.StringUtils;
import freemarker.template.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Service层 代码生成器
 * Created by zhh on 2017/09/20.
 */
public class DaoGenerator extends CodeGeneratorManager implements CodeGenerator {

    @Override
    public void genCode(String tableName, String modelName, String sign) {
        Configuration cfg = getFreemarkerConfiguration();
        String customMapping = CodeGeneratorConfig.TABLE_SIGN_ENABLE ? "/" + sign + "/" : "/";
        String modelNameUpperCamel = StringUtils.isNullOrEmpty(modelName) ? tableNameConvertUpperCamel(tableName) : modelName;

        Map<String, Object> data = getDataMapInit(modelName, sign, modelNameUpperCamel);
        try {
            // 创建 Service 接口
            File daoFile = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_DAO + customMapping
                    + modelNameUpperCamel + "Dao.java");
            // 查看父级目录是否存在, 不存在则创建
            if (!daoFile.getParentFile().exists()) {
                daoFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("dao.ftl").process(data, new FileWriter(daoFile));
            logger.info(modelNameUpperCamel + "Dao.java 生成成功!");

            // 创建 Service 接口的实现类
            File daoImplFile = new File(PROJECT_PATH + JAVA_PATH + PACKAGE_PATH_DAO_IMPL + customMapping
                    + modelNameUpperCamel + "DaoImpl.java");
            // 查看父级目录是否存在, 不存在则创建
            if (!daoImplFile.getParentFile().exists()) {
                daoImplFile.getParentFile().mkdirs();
            }
            cfg.getTemplate("dao-impl.ftl").process(data, new FileWriter(daoImplFile));
            logger.info(modelNameUpperCamel + "DaoImpl.java 生成成功!");
        } catch (Exception e) {
            throw new RuntimeException("Service 生成失败!", e);
        }
    }

    /**
     * 预置页面所需数据
     *
     * @param tableName           表名
     * @param modelName           自定义实体类名, 为null则默认将表名下划线转成大驼峰形式
     * @param sign                区分字段, 规定如表 gen_test_demo, 则 test 即为区分字段
     * @param modelNameUpperCamel 首字为大写的实体类名
     * @return
     */
    private Map<String, Object> getDataMapInit(String modelName, String sign, String modelNameUpperCamel) {
        Map<String, Object> data = new HashMap<>();
        data.put("date", DATE);
        data.put("author", AUTHOR);
        data.put("sign", sign);
        data.put("modelNameUpperCamel", modelNameUpperCamel);
        data.put("modelNameLowerCamel", StringUtils.toLowerCaseFirstOne(modelNameUpperCamel));
        data.put("basePackage", BASE_PACKAGE);
        data.put("tableSingEnable",CodeGeneratorConfig.TABLE_SIGN_ENABLE);

        return data;
    }
}
