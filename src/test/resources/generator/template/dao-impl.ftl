<#if tableSingEnable == true>
package ${basePackage}.dao.impl.${sign};

import ${basePackage}.dao.mapper.${sign}.${modelNameUpperCamel}Mapper;
import ${basePackage}.model.${sign}.${modelNameUpperCamel};
import ${basePackage}.dao.${sign}.${modelNameUpperCamel}Dao;
<#else>
package ${basePackage}.dao.impl;

import ${basePackage}.dao.mapper.${modelNameUpperCamel}Mapper;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.dao.${modelNameUpperCamel}Dao;
</#if>
import ${basePackage}.dao.AbstractDao;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by ${author} on ${date}.
 */
@Repository
public class ${modelNameUpperCamel}DaoImpl extends AbstractDao<${modelNameUpperCamel}> implements ${modelNameUpperCamel}Dao {

    @Autowired
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

}
