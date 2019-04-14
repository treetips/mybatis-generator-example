package com.example.mybatisgenerator.types;


import java.sql.Types;

import org.mybatis.generator.api.JavaTypeResolver;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * Customize java mapping
 *
 * @author tree
 */
public class JavaTypeResolverCustomImpl extends JavaTypeResolverDefaultImpl
  implements JavaTypeResolver {
  public JavaTypeResolverCustomImpl() {
    super();
    typeMap.put(
      Types.TINYINT,
      new JdbcTypeInformation("TINYINT", new FullyQualifiedJavaType(Integer.class.getName())));
    typeMap.put(
      Types.SMALLINT,
      new JdbcTypeInformation("SMALLINT", new FullyQualifiedJavaType(Integer.class.getName())));
  }
}
