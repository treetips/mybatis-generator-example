package com.example.mybatisgenerator.plugin;


import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/**
 * Add lombok @Data annotation plugin
 *
 * @see mybatis-generator.xml
 * @author tree
 */
public class LombokPlugin extends PluginAdapter {

  /** {@inheritDoc} */
  @Override
  public boolean validate(List<String> warnings) {
    return true;
  }

  /** {@inheritDoc} */
  @Override
  public void setProperties(Properties properties) {
    super.setProperties(properties);
  }

  /** {@inheritDoc} */
  @Override
  public boolean modelBaseRecordClassGenerated(
    TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    generateLombokAnnotation(topLevelClass);
    return true;
  }

  /** {@inheritDoc} */
  @Override
  public boolean modelPrimaryKeyClassGenerated(
    TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    generateLombokAnnotation(topLevelClass);
    return true;
  }

  /** {@inheritDoc} */
  @Override
  public boolean modelRecordWithBLOBsClassGenerated(
    TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    generateLombokAnnotation(topLevelClass);
    return true;
  }

  private void generateLombokAnnotation(TopLevelClass topLevelClass) {
    // add import of lombok
    topLevelClass.addImportedType(new FullyQualifiedJavaType("lombok.Data"));
    // add lombok annotation to class
    topLevelClass.addAnnotation("@Data");
    // remove all getter and setter
    topLevelClass.getMethods().clear();
  }
}
