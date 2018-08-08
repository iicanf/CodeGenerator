<#if tableSingEnable == true>
package ${basePackage}.service.${sign};

import ${basePackage}.model.${sign}.${modelNameUpperCamel};
<#else>
package ${basePackage}.service;

import ${basePackage}.model.${modelNameUpperCamel};
</#if>
import ${basePackage}.service.Service;

/**
 *
 * Created by ${author} on ${date}.
 */
public interface ${modelNameUpperCamel}Service extends Service<${modelNameUpperCamel}> {

}
