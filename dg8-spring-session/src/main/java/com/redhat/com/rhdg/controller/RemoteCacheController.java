package com.redhat.com.rhdg.controller;

import javax.servlet.http.HttpServletRequest;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.spring.remote.session.configuration.EnableInfinispanRemoteHttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteCacheController {


}