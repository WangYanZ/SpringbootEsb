package io.transwarp.esb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.transwarp.esb.service.DataFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Api(description = "EsbRequestController")
@RequestMapping(value = "/base")
public class EsbController {

//    @Autowired
//    private DataFormatUtil dataFormatUtil;

    @ApiOperation(value = "esbRequestUnifiedInterface",notes = "参数类型为标准xml格式")
    @RequestMapping(value = "/esb",method= RequestMethod.POST)
    public String esb(@RequestBody String xmlString){
        System.out.print(xmlString);
        return  xmlString;
    }
    @ApiOperation(value = "testValue")
    @RequestMapping(value = "/test",method= RequestMethod.POST)
    public String test(@RequestBody String xmlString){
        System.out.println(xmlString);
        String jsonString = DataFormatUtil.XmlToJson(xmlString);
        System.out.println(jsonString);
        String xmlStringNew  = DataFormatUtil.JsonToXml(jsonString);
        System.out.println(xmlStringNew);
        String descXml = DataFormatUtil.JsonToXmlReplaceBlank(jsonString);
        System.out.println(descXml);
        return jsonString;
    }
}
