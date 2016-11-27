package com.networknt.eventuate.cdcservice;

import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

/**
 * Created by stevehu on 2016-11-22.
 */
public class CdcService implements HandlerProvider {

    public HttpHandler getHandler() {
        return Handlers.path()
                .addPrefixPath("/", new HttpHandler() {
                            public void handleRequest(HttpServerExchange exchange) {
                                exchange.getResponseSender().send("OK!");
                            }
                        }
                );
    }
}
