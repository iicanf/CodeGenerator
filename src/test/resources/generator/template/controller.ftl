<#if tableSingEnable == true>
package ${basePackage}.controller.${sign};

import ${basePackage}.model.${sign}.${modelNameUpperCamel};
import ${basePackage}.service.${sign}.${modelNameUpperCamel}Service;
<#else>
package ${basePackage}.controller;

import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.service.${modelNameUpperCamel}Service;
</#if>

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * Created by ${author} on ${date}.
 */
@RestController
@RequestMapping("/${baseRequestMapping}/")
public class ${modelNameUpperCamel}Controller {

    @Autowired
    ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

    @PostMapping("add")
    public String add(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        ${modelNameLowerCamel}Service.save(${modelNameLowerCamel});
        return "";
    }

    @PostMapping("delete")
    public String delete(@RequestParam Integer id) {
	    ${modelNameLowerCamel}Service.deleteById(id);
	    return "";
    }

    @PostMapping("update")
    public String update(${modelNameUpperCamel} ${modelNameLowerCamel}) {
	    ${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
	    return "";
    }

    @PostMapping("detail")
    public String detail(@RequestParam Integer id) {
        ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.findById(id);
        return ${modelNameLowerCamel}.toString();
    }

    @PostMapping("list")
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
