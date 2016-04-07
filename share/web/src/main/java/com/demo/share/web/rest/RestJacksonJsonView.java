package com.demo.share.web.rest;

import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import java.util.Map;

/**
 * Created by tenmei on 16/4/7.
 */
public class RestJacksonJsonView extends MappingJacksonJsonView {
    /**
     * 重写方法,去掉json的键值对,只保留值
     */
    @Override
    protected Object filterModel(Map<String, Object> model) {
        Map<?, ?> result = (Map<?, ?>) super.filterModel(model);
        if (result.size() == 1) {
            return result.values().iterator().next();
        } else {
            return result;
        }
    }
}
