<#if tableSingEnable == true>
package ${basePackage}.dao.${sign};

import ${basePackage}.model.${sign}.${modelNameUpperCamel};
<#else>
package ${basePackage}.dao;

import ${basePackage}.model.${modelNameUpperCamel};
</#if>
import ${basePackage}.dao.Dao;

/**
 *
 * Created by ${author} on ${date}.
 */
public interface ${modelNameUpperCamel}Dao extends Dao<${modelNameUpperCamel}> {

}
