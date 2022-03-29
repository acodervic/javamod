module  mod {
    requires  hutool.core;
    requires  hutool.json;
    requires  hutool.crypto;
    requires io.github.classgraph;
    requires okhttp3;
    requires okio;
    requires swingx;
    requires swing.worker;
    requires java.desktop;
    requires miglayout.core;
    requires miglayout.swing;
    requires nanohttpd;
    requires java.sql;
    requires org.apache.commons.compress;
    requires java.management;
    requires jdk.unsupported;
    requires org.jdbi.v3.core;
    requires javafx.graphics;


    //到处这些模块给使用者访问
    exports github.acodervic.mod;
    exports github.acodervic.mod.thread;
    exports github.acodervic.mod.code;
    exports github.acodervic.mod.crypt;
    exports github.acodervic.mod.data;
    exports github.acodervic.mod.data.list;
    exports github.acodervic.mod.data.map;
    exports github.acodervic.mod.data.mode;
    exports github.acodervic.mod.io;
    exports github.acodervic.mod.io.compress;
    exports github.acodervic.mod.net;
    exports github.acodervic.mod.net.apikey;
    exports github.acodervic.mod.net.proxy;
    exports github.acodervic.mod.net.server.httpd;
    exports github.acodervic.mod.net.http;
    exports github.acodervic.mod.reflect;
    exports github.acodervic.mod.shell;
    exports github.acodervic.mod.swing;
    exports github.acodervic.mod.swing.annotation;
    exports github.acodervic.mod.swing.combox;
    exports github.acodervic.mod.swing.messagebox;
    exports github.acodervic.mod.swing.notify.model;
    exports github.acodervic.mod.swing.option;
    exports github.acodervic.mod.swing.table;
    exports github.acodervic.mod.swing.tree;
    exports github.acodervic.mod.swing.tree.filter;
    exports github.acodervic.mod.swing.panel;
    exports github.acodervic.mod.db;
    exports github.acodervic.mod.db.anima;
    exports github.acodervic.mod.db.anima.annotation;
    exports github.acodervic.mod.db.anima.core;
    exports github.acodervic.mod.db.anima.core.dml;
    exports github.acodervic.mod.db.anima.core.functions;
    exports github.acodervic.mod.db.anima.core.imlps;
    exports github.acodervic.mod.db.anima.dialect;
    exports github.acodervic.mod.db.anima.enums;
    exports github.acodervic.mod.db.anima.event;
    exports github.acodervic.mod.db.anima.exception;
    exports github.acodervic.mod.db.anima.page;
    exports github.acodervic.mod.db.anima.utils;
    exports github.acodervic.mod.javafx;
    exports github.acodervic.mod.i118n;

    

}