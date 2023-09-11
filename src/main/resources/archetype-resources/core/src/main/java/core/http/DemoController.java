#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.http;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fourportun.common.api.service.IdService;
import com.fourportun.common.dto.Result;
import ${groupId}.common.exception.BizException;
import ${package}.api.service.DemoService;

@RestController
@RequestMapping("/")
@RefreshScope
public class DemoController {

//    @Value("${symbol_dollar}{test}")
//    private String nacosConfig;

    @Autowired
    private DemoService service;
    @DubboReference
    private IdService idService;

//    @GetMapping("nacos")
//    public String testNacos() {
//        return nacosConfig;
//    }

    @GetMapping("serviceaop")
    public String testServiceAOP() {
        return service.testAOP();
    }

    @GetMapping("controlleraop")
    public String testControllerAOP() {
        throw new BizException(400, "biz exception from controller");
    }
    
    @GetMapping("/snowflakeid")
    public Result<Long> snowflakeId() {
        return Result.success(idService.getSnowflakeId());
    }
}
