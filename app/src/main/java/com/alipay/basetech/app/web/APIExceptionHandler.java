/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package com.alipay.basetech.app.web;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.alipay.basetech.app.model.APIResult;

/**
 * 
 * @author midang
 * @version $Id: APIExceptionHandler.java, v 0.1 2014年12月18日 下午3:35:10 midang Exp $
 */
public abstract class APIExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(APIExceptionHandler.class);

    @ExceptionHandler({ Throwable.class })
    protected APIResult exception(Throwable e) {

        String messageId = String.format("APIException[id=%d]", System.currentTimeMillis());
        logger.error(messageId, e);

        String errorMessageSummary = StringUtils.isBlank(e.getMessage()) ? e.getClass()
            .getSimpleName() : e.getMessage();

        return new APIResult(false, String.format("%s: %s", messageId, errorMessageSummary));
    }
}
