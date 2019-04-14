open module com.sebastian.sbhibernate {
    requires spring.boot.starter.data.jpa;
    requires spring.boot.starter.aop;
    requires spring.aop;
    requires org.aspectj.weaver;
    requires spring.boot.starter.jdbc;
    requires com.zaxxer.hikari;
    requires spring.jdbc;
    requires jakarta.activation;
    requires java.persistence;
    requires java.transaction;
    requires org.hibernate.orm.core;
    requires org.jboss.logging;
    requires javassist;
    requires net.bytebuddy;
    requires antlr;
    requires jandex;
    requires com.fasterxml.classmate;
    requires dom4j;
    requires org.hibernate.commons.annotations;
    requires com.sun.xml.bind;
    requires com.sun.xml.txw2;
    requires com.sun.istack.runtime;
    requires org.jvnet.staxex;
    requires com.sun.xml.fastinfoset;
    requires spring.data.jpa;
    requires spring.data.commons;
    requires spring.orm;
    requires spring.context;
    requires spring.tx;
    requires spring.beans;
    requires slf4j.api;
    requires spring.aspects;
    requires spring.boot.starter.web;
    requires spring.boot.starter;
    requires spring.boot.starter.logging;
    requires logback.classic;
    requires logback.core;
    requires org.apache.logging.slf4j;
    requires org.apache.logging.log4j;
    requires jul.to.slf4j;
    requires java.annotation;
    requires spring.boot.starter.json;
    requires com.fasterxml.jackson.databind;
    requires jackson.annotations;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.datatype.jdk8;
    requires com.fasterxml.jackson.datatype.jsr310;
    requires com.fasterxml.jackson.module.paramnames;
    requires spring.boot.starter.tomcat;
    requires tomcat.embed.core;
    requires tomcat.embed.el;
    requires tomcat.embed.websocket;
    requires java.validation;
    requires org.hibernate.validator;
    requires spring.web;
    requires spring.webmvc;
    requires spring.expression;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires java.xml.bind;
    requires spring.core;
    requires spring.jcl;
    requires java.sql;
}
