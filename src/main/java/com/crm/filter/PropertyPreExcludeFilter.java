package com.crm.filter;

import com.alibaba.fastjson2.filter.SimplePropertyPreFilter;

/**
 * @description:
 * @author: yushang
 * @create: 2025-11-09 08:25
 **/
public class PropertyPreExcludeFilter extends SimplePropertyPreFilter {
    public PropertyPreExcludeFilter addExcludes(String... filters) {
        for (String filter : filters) {
            this.getExcludes().add(filter);
        }
        return this;
    }
}
