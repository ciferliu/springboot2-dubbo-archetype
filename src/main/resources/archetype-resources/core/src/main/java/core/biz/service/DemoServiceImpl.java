#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.biz.service;

import org.apache.dubbo.config.annotation.DubboService;

import ${package}.api.service.DemoService;

@DubboService(filter = {"-exception"})
public class DemoServiceImpl implements DemoService {

    public String testAOP() {
        throw new RuntimeException("unexcepted exception form service");
    }
}
