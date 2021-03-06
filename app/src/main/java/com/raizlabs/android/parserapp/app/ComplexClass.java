package com.raizlabs.android.parserapp.app;

import com.raizlabs.android.parser.ParseListener;
import com.raizlabs.android.parser.Parser;
import com.raizlabs.android.parser.core.Key;
import com.raizlabs.android.parser.core.Parseable;

import java.util.List;
import java.util.Map;

/**
 * Author: andrewgrosner
 * Contributors: { }
 * Description:
 */
@Parseable
public class ComplexClass implements ParseListener {

    @Key
    String name;

    @Key
    long date;

    @Key(defValue = "5.0d")
    double math;

    @Key
    int number;

    @Key
    boolean truth;

    @Key
    @com.raizlabs.android.parser.core.FieldParseable
    SimpleClass otherClass;

    @Key
    SimpleClass[] simpleClasses;

    @Key
    List<SimpleClass> simpleClassList;

    @Key
    Map<String, SimpleClass> simpleClassMap;

    @Override
    public void parse(Object dataInstance, Parser parser) {

    }
}
