<?hh
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
 * Original thrift enum:-
 * FooEnum
 */
enum FooEnum: int {
  BAR = 0;
  BAZ = 1;
}

class FooEnum_TEnumStaticMetadata implements \IThriftEnumStaticMetadata {
  public static function getEnumMetadata()[]: \tmeta_ThriftEnum {
    return tmeta_ThriftEnum::fromShape(
      shape(
        "name" => "module.FooEnum",
        "elements" => dict[
          0 => "BAR",
          1 => "BAZ",
        ],
      )
    );
  }

  public static function getAllStructuredAnnotations()[write_props]: \TEnumAnnotations {
    return shape(
      'enum' => dict[],
      'constants' => dict[
      ],
    );
  }
}

/**
 * Original thrift struct:-
 * BarStruct
 */
class BarStruct implements \IThriftSyncStruct, \IThriftStructMetadata, \IThriftShapishSyncStruct {
  use \ThriftSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'e',
      'type' => \TType::MAP,
      'ktype' => \TType::I32,
      'vtype' => \TType::I32,
      'key' => shape(
        'type' => \TType::I32,
        'enum' => FooEnum::class,
      ),
      'val' => shape(
        'type' => \TType::I32,
        'enum' => FooEnum::class,
      ),
      'format' => 'collection',
    ),
    2 => shape(
      'var' => 's',
      'type' => \TType::SET,
      'etype' => \TType::I32,
      'elem' => shape(
        'type' => \TType::I32,
        'enum' => FooEnum::class,
      ),
      'format' => 'collection',
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'e' => 1,
    's' => 2,
  ];

  const type TConstructorShape = shape(
    ?'e' => ?Map<FooEnum, FooEnum>,
    ?'s' => ?Set<FooEnum>,
  );

  const type TShape = shape(
    'e' => darray<FooEnum, FooEnum>,
    's' => darray<FooEnum, bool>,
    ...
  );
  const int STRUCTURAL_ID = 2986314503120154076;
  /**
   * Original thrift field:-
   * 1: map<enum module.FooEnum, enum module.FooEnum> e
   */
  public Map<FooEnum, FooEnum> $e;
  /**
   * Original thrift field:-
   * 2: set<enum module.FooEnum> s
   */
  public Set<FooEnum> $s;

  public function __construct(?Map<FooEnum, FooEnum> $e = null, ?Set<FooEnum> $s = null)[] {
    $this->e = $e ?? Map {};
    $this->s = $s ?? Set {};
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'e'),
      Shapes::idx($shape, 's'),
    );
  }

  public function getName()[]: string {
    return 'BarStruct';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module.BarStruct",
        "fields" => vec[
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_map" => tmeta_ThriftMapType::fromShape(
                    shape(
                      "keyType" => tmeta_ThriftType::fromShape(
                        shape(
                          "t_enum" => tmeta_ThriftEnumType::fromShape(
                            shape(
                              "name" => "module.FooEnum",
                            )
                          ),
                        )
                      ),
                      "valueType" => tmeta_ThriftType::fromShape(
                        shape(
                          "t_enum" => tmeta_ThriftEnumType::fromShape(
                            shape(
                              "name" => "module.FooEnum",
                            )
                          ),
                        )
                      ),
                    )
                  ),
                )
              ),
              "name" => "e",
            )
          ),
          tmeta_ThriftField::fromShape(
            shape(
              "id" => 2,
              "type" => tmeta_ThriftType::fromShape(
                shape(
                  "t_set" => tmeta_ThriftSetType::fromShape(
                    shape(
                      "valueType" => tmeta_ThriftType::fromShape(
                        shape(
                          "t_enum" => tmeta_ThriftEnumType::fromShape(
                            shape(
                              "name" => "module.FooEnum",
                            )
                          ),
                        )
                      ),
                    )
                  ),
                )
              ),
              "name" => "s",
            )
          ),
        ],
        "is_union" => false,
      )
    );
  }

  public static function getAllStructuredAnnotations()[write_props]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

  public static function __fromShape(self::TShape $shape)[]: this {
    return new static(
      (new Map($shape['e'])),
      new Set(Keyset\keys($shape['s'])),
    );
  }

  public function __toShape()[]: self::TShape {
    return shape(
      'e' => ThriftUtil::toDArray($this->e, static::class),
      's' => ThriftUtil::toDArray(Dict\fill_keys($this->s->toValuesArray(), true), static::class),
    );
  }
  public function getInstanceKey()[write_props]: string {
    return \TCompactSerializer::serialize($this);
  }

}

