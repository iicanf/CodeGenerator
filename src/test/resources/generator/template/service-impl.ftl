<#if tableSingEnable == true>
package ${basePackage}.service.impl.${sign};

import ${basePackage}.dao.${sign}.${modelNameUpperCamel}Dao;
import ${basePackage}.model.${sign}.${modelNameUpperCamel};
import ${basePackage}.service.${sign}.${modelNameUpperCamel}Service;
<#else>
package ${basePackage}.service.impl;

import ${basePackage}.dao.${modelNameUpperCamel}Dao;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.service.${modelNameUpperCamel}Service;
</#if>

import ${basePackage}.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by ${author} on ${date}.
 */
@Service
public class ${modelNameUpperCamel}ServiceImpl extends AbstractService<${modelNameUpperCamel}> implements ${modelNameUpperCamel}Service {

    @Autowired
    private ${modelNameUpperCamel}Dao ${modelNameLowerCamel}Dao;

}
