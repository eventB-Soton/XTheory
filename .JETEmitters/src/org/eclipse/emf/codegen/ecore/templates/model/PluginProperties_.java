package org.eclipse.emf.codegen.ecore.templates.model;

import org.eclipse.emf.codegen.ecore.genmodel.*;

public class PluginProperties_
{
  protected static String nl;
  public static synchronized PluginProperties_ create(String lineSeparator)
  {
    nl = lineSeparator;
    PluginProperties_ result = new PluginProperties_();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "# ";
  protected final String TEXT_2 = NL + "# <copyright>" + NL + "# </copyright>";
  protected final String TEXT_3 = NL + "#" + NL + "# ";
  protected final String TEXT_4 = "Id";
  protected final String TEXT_5 = NL + NL + "pluginName = ";
  protected final String TEXT_6 = " Model" + NL + "providerName = www.example.org";
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL + "_UI_";
  protected final String TEXT_9 = "_content_type = ";
  protected final String TEXT_10 = " File";
  protected final String TEXT_11 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenModel genModel = (GenModel)argument;
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_1);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_2);
    }}
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_6);
    boolean first = true; for (GenPackage genPackage : genModel.getAllGenPackagesWithClassifiers()) {
    if (genPackage.isContentType()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_7);
    }
    stringBuffer.append(TEXT_8);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getPrefix());
    stringBuffer.append(TEXT_10);
    }
    }
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
