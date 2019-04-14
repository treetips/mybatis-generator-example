package com.example.mybatisgenerator.plugin;


import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

/**
 * Rename generate class name plugin
 *
 * @see mybatis-generator.xml
 * @author tree
 */
public class RenameClassNamePlugin extends PluginAdapter {

  /** {@inheritDoc} */
  @Override
  public boolean validate(List<String> warnings) {
    return true;
  }

  /** {@inheritDoc} */
  @Override
  public void initialized(IntrospectedTable table) {
    super.initialized(table);
    String name = table.getBaseRecordType();
    table.setBaseRecordType(name + "Entity");
  }
}
