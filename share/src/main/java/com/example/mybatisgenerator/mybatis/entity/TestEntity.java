package com.example.mybatisgenerator.mybatis.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Data;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table test
 */
@Data
public class TestEntity implements Serializable {
    /**
     * Database Column Remarks:
     *   bigint column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.id_column
     *
     * @mbg.generated
     */
    private Long idColumn;

    /**
     * Database Column Remarks:
     *   bit column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.bit_column
     *
     * @mbg.generated
     */
    private Boolean bitColumn;

    /**
     * Database Column Remarks:
     *   tinyint column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.tinyint_column
     *
     * @mbg.generated
     */
    private Integer tinyintColumn;

    /**
     * Database Column Remarks:
     *   smallint column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.smallint_column
     *
     * @mbg.generated
     */
    private Integer smallintColumn;

    /**
     * Database Column Remarks:
     *   mediumint column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.mediumint_column
     *
     * @mbg.generated
     */
    private Integer mediumintColumn;

    /**
     * Database Column Remarks:
     *   int column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.int_column
     *
     * @mbg.generated
     */
    private Integer intColumn;

    /**
     * Database Column Remarks:
     *   decimal column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.decimal_column
     *
     * @mbg.generated
     */
    private Long decimalColumn;

    /**
     * Database Column Remarks:
     *   float column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.float_column
     *
     * @mbg.generated
     */
    private Float floatColumn;

    /**
     * Database Column Remarks:
     *   double column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.double_column
     *
     * @mbg.generated
     */
    private Double doubleColumn;

    /**
     * Database Column Remarks:
     *   char column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.char_column
     *
     * @mbg.generated
     */
    private String charColumn;

    /**
     * Database Column Remarks:
     *   varchar column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.varchar_column
     *
     * @mbg.generated
     */
    private String varcharColumn;

    /**
     * Database Column Remarks:
     *   year column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.year_column
     *
     * @mbg.generated
     */
    private LocalDate yearColumn;

    /**
     * Database Column Remarks:
     *   date column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.date_column
     *
     * @mbg.generated
     */
    private LocalDate dateColumn;

    /**
     * Database Column Remarks:
     *   time column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.time_column
     *
     * @mbg.generated
     */
    private LocalTime timeColumn;

    /**
     * Database Column Remarks:
     *   datetime column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.timestamp_column
     *
     * @mbg.generated
     */
    private LocalDateTime timestampColumn;

    /**
     * Database Column Remarks:
     *   tinytext column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.tinytext_column
     *
     * @mbg.generated
     */
    private String tinytextColumn;

    /**
     * Database Column Remarks:
     *   enum column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.enum_column
     *
     * @mbg.generated
     */
    private String enumColumn;

    /**
     * Database Column Remarks:
     *   set column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.set_column
     *
     * @mbg.generated
     */
    private String setColumn;

    /**
     * Database Column Remarks:
     *   bool column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.bool_column
     *
     * @mbg.generated
     */
    private Boolean boolColumn;

    /**
     * Database Column Remarks:
     *   auto generated create column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.created_at
     *
     * @mbg.generated
     */
    private LocalDateTime createdAt;

    /**
     * Database Column Remarks:
     *   auto generated update column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.updated_at
     *
     * @mbg.generated
     */
    private LocalDateTime updatedAt;

    /**
     * Database Column Remarks:
     *   binary column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.binary_column
     *
     * @mbg.generated
     */
    private byte[] binaryColumn;

    /**
     * Database Column Remarks:
     *   varbinary column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.varbinary_column
     *
     * @mbg.generated
     */
    private byte[] varbinaryColumn;

    /**
     * Database Column Remarks:
     *   tinyblob comment
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.tinyblob_column
     *
     * @mbg.generated
     */
    private byte[] tinyblobColumn;

    /**
     * Database Column Remarks:
     *   blob comment
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.blob_column
     *
     * @mbg.generated
     */
    private byte[] blobColumn;

    /**
     * Database Column Remarks:
     *   mediumblob comment
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.mediumblob_column
     *
     * @mbg.generated
     */
    private byte[] mediumblobColumn;

    /**
     * Database Column Remarks:
     *   longblob comment
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.longblob_column
     *
     * @mbg.generated
     */
    private byte[] longblobColumn;

    /**
     * Database Column Remarks:
     *   text column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.text_column
     *
     * @mbg.generated
     */
    private String textColumn;

    /**
     * Database Column Remarks:
     *   mediumtext column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.mediumtext_column
     *
     * @mbg.generated
     */
    private String mediumtextColumn;

    /**
     * Database Column Remarks:
     *   longtext column
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column test.longtext_column
     *
     * @mbg.generated
     */
    private String longtextColumn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}