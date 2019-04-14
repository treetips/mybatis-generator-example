drop table if exists test;

create table test(
  id_column bigint unsigned auto_increment comment 'bigint column',
  bit_column bit comment 'bit column',
  tinyint_column tinyint unsigned comment 'tinyint column',
  smallint_column smallint unsigned comment 'smallint column',
  mediumint_column mediumint unsigned comment 'mediumint column',
  int_column int unsigned comment 'int column',
  decimal_column decimal comment 'decimal column',

  float_column float comment 'float column',
  double_column double comment 'double column',

  char_column char(1) comment 'char column',
  varchar_column varchar(10) comment 'varchar column',

  binary_column binary comment 'binary column',
  varbinary_column varbinary(10) comment 'varbinary column',

  tinyblob_column tinyblob comment 'tinyblob comment',
  blob_column tinyblob comment 'blob comment',
  mediumblob_column mediumblob comment 'mediumblob comment',
  longblob_column longblob comment 'longblob comment',

  year_column year comment 'year column',
  date_column date comment 'date column',
  time_column time comment 'time column',
  timestamp_column datetime comment 'datetime column',

  tinytext_column tinytext comment 'tinytext column',
  text_column text comment 'text column',
  mediumtext_column mediumtext comment 'mediumtext column',
  longtext_column longtext comment 'longtext column',

  enum_column enum('one', 'two', 'three') comment 'enum column',
  set_column set('dog', 'cat', 'bird') comment 'set column',

  bool_column bool not null default false comment 'bool column',

  created_at datetime not null default current_timestamp comment 'auto generated create column',
  updated_at datetime not null default current_timestamp on update current_timestamp comment 'auto generated update column',
  primary key(id_column)
) engine=innodb charset=utf8mb4 comment='generate test';

show create table test \G

