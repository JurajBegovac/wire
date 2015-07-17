// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/foreign.proto at 28:1
package com.squareup.wire.protos.foreign;

import com.squareup.wire.ExtendableMessage;
import com.squareup.wire.Extension;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;

public final class ForeignMessage extends ExtendableMessage<ForeignMessage> {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_I = 0;

  @ProtoField(
      tag = 1,
      type = Message.Datatype.INT32
  )
  public final Integer i;

  public ForeignMessage(Integer i) {
    this.i = i;
  }

  private ForeignMessage(Builder builder) {
    this(builder.i);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ForeignMessage)) return false;
    ForeignMessage o = (ForeignMessage) other;
    if (!extensionsEqual(o)) return false;
    return equals(i, o.i);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = extensionsHashCode();
      result = result * 37 + (i != null ? i.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends ExtendableMessage.ExtendableBuilder<ForeignMessage> {
    public Integer i;

    public Builder() {
    }

    public Builder(ForeignMessage message) {
      super(message);
      if (message == null) return;
      this.i = message.i;
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    @Override
    public <E> Builder setExtension(Extension<ForeignMessage, E> extension, E value) {
      super.setExtension(extension, value);
      return this;
    }

    @Override
    public ForeignMessage build() {
      return new ForeignMessage(this);
    }
  }
}
