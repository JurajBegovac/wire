// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto
package com.google.protobuf

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireField
import com.squareup.wire.internal.checkElementsNotNull
import com.squareup.wire.internal.redactElements
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

class EnumValueOptions(
  /**
   * Is this enum value deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the enum value, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating enum values.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val deprecated: Boolean? = null,
  /**
   * The parser stores options it doesn't recognize here. See above.
   */
  @field:WireField(
    tag = 999,
    adapter = "com.google.protobuf.UninterpretedOption#ADAPTER",
    label = WireField.Label.REPEATED
  )
  @JvmField
  val uninterpreted_option: List<UninterpretedOption> = emptyList(),
  /**
   * Extension source: foreign.proto
   */
  @field:WireField(
    tag = 70002,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL"
  )
  @JvmField
  val foreign_enum_value_option: Boolean? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<EnumValueOptions, EnumValueOptions.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.deprecated = deprecated
    builder.uninterpreted_option = uninterpreted_option
    builder.foreign_enum_value_option = foreign_enum_value_option
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is EnumValueOptions) return false
    return unknownFields == other.unknownFields
        && deprecated == other.deprecated
        && uninterpreted_option == other.uninterpreted_option
        && foreign_enum_value_option == other.foreign_enum_value_option
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + deprecated.hashCode()
      result = result * 37 + uninterpreted_option.hashCode()
      result = result * 37 + foreign_enum_value_option.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (deprecated != null) result += """deprecated=$deprecated"""
    if (uninterpreted_option.isNotEmpty()) result +=
        """uninterpreted_option=$uninterpreted_option"""
    if (foreign_enum_value_option != null) result +=
        """foreign_enum_value_option=$foreign_enum_value_option"""
    return result.joinToString(prefix = "EnumValueOptions{", separator = ", ", postfix = "}")
  }

  fun copy(
    deprecated: Boolean? = this.deprecated,
    uninterpreted_option: List<UninterpretedOption> = this.uninterpreted_option,
    foreign_enum_value_option: Boolean? = this.foreign_enum_value_option,
    unknownFields: ByteString = this.unknownFields
  ): EnumValueOptions = EnumValueOptions(deprecated, uninterpreted_option,
      foreign_enum_value_option, unknownFields)

  class Builder : Message.Builder<EnumValueOptions, Builder>() {
    @JvmField
    var deprecated: Boolean? = null

    @JvmField
    var uninterpreted_option: List<UninterpretedOption> = emptyList()

    @JvmField
    var foreign_enum_value_option: Boolean? = null

    /**
     * Is this enum value deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the enum value, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating enum values.
     */
    fun deprecated(deprecated: Boolean?): Builder {
      this.deprecated = deprecated
      return this
    }

    /**
     * The parser stores options it doesn't recognize here. See above.
     */
    fun uninterpreted_option(uninterpreted_option: List<UninterpretedOption>): Builder {
      checkElementsNotNull(uninterpreted_option)
      this.uninterpreted_option = uninterpreted_option
      return this
    }

    fun foreign_enum_value_option(foreign_enum_value_option: Boolean?): Builder {
      this.foreign_enum_value_option = foreign_enum_value_option
      return this
    }

    override fun build(): EnumValueOptions = EnumValueOptions(
      deprecated = deprecated,
      uninterpreted_option = uninterpreted_option,
      foreign_enum_value_option = foreign_enum_value_option,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    const val DEFAULT_DEPRECATED: Boolean = false

    @JvmField
    val ADAPTER: ProtoAdapter<EnumValueOptions> = object : ProtoAdapter<EnumValueOptions>(
      FieldEncoding.LENGTH_DELIMITED, 
      EnumValueOptions::class
    ) {
      override fun encodedSize(value: EnumValueOptions): Int = 
        ProtoAdapter.BOOL.encodedSizeWithTag(1, value.deprecated) +
        UninterpretedOption.ADAPTER.asRepeated().encodedSizeWithTag(999,
            value.uninterpreted_option) +
        ProtoAdapter.BOOL.encodedSizeWithTag(70002, value.foreign_enum_value_option) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: EnumValueOptions) {
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.deprecated)
        UninterpretedOption.ADAPTER.asRepeated().encodeWithTag(writer, 999,
            value.uninterpreted_option)
        ProtoAdapter.BOOL.encodeWithTag(writer, 70002, value.foreign_enum_value_option)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): EnumValueOptions {
        var deprecated: Boolean? = null
        val uninterpreted_option = mutableListOf<UninterpretedOption>()
        var foreign_enum_value_option: Boolean? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> deprecated = ProtoAdapter.BOOL.decode(reader)
            999 -> uninterpreted_option.add(UninterpretedOption.ADAPTER.decode(reader))
            70002 -> foreign_enum_value_option = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return EnumValueOptions(
          deprecated = deprecated,
          uninterpreted_option = uninterpreted_option,
          foreign_enum_value_option = foreign_enum_value_option,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: EnumValueOptions): EnumValueOptions = value.copy(
        uninterpreted_option =
            value.uninterpreted_option.redactElements(UninterpretedOption.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }
  }
}
