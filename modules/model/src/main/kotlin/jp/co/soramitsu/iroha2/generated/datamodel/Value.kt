//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.collections.MutableList

/**
 * Value
 *
 * Generated from 'iroha_data_model::Value' enum
 */
public sealed class Value {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'U32' variant
     */
    public data class U32(
        public val u32: UInt
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<U32>, ScaleWriter<U32> {
            public const val DISCRIMINANT: Int = 0

            public override fun read(reader: ScaleCodecReader): U32 = U32(
                reader.readUint32().toUInt(),
            )

            public override fun write(writer: ScaleCodecWriter, instance: U32) {
                writer.writeUint32(instance.u32.toInt())
            }
        }
    }

    /**
     * 'Bool' variant
     */
    public data class Bool(
        public val bool: Boolean
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Bool>, ScaleWriter<Bool> {
            public const val DISCRIMINANT: Int = 1

            public override fun read(reader: ScaleCodecReader): Bool = Bool(
                reader.readBoolean(),
            )

            public override fun write(writer: ScaleCodecWriter, instance: Bool) {
                if (instance.bool) { writer.directWrite(1) } else { writer.directWrite(0) }
            }
        }
    }

    /**
     * 'String' variant
     */
    public data class String(
        public val string: kotlin.String
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<String>, ScaleWriter<String> {
            public const val DISCRIMINANT: Int = 2

            public override fun read(reader: ScaleCodecReader): String = String(
                reader.readString(),
            )

            public override fun write(writer: ScaleCodecWriter, instance: String) {
                writer.writeAsList(instance.string.toByteArray(Charsets.UTF_8))
            }
        }
    }

    /**
     * 'Fixed' variant
     */
    public data class Fixed(
        public val fixed: jp.co.soramitsu.iroha2.generated.datamodel.fixed.Fixed
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Fixed>, ScaleWriter<Fixed> {
            public const val DISCRIMINANT: Int = 3

            public override fun read(reader: ScaleCodecReader): Fixed = Fixed(
                jp.co.soramitsu.iroha2.generated.datamodel.fixed.Fixed.read(reader),
            )

            public override fun write(writer: ScaleCodecWriter, instance: Fixed) {
                jp.co.soramitsu.iroha2.generated.datamodel.fixed.Fixed.write(writer, instance.fixed)
            }
        }
    }

    /**
     * 'Vec' variant
     */
    public data class Vec(
        public val vec: MutableList<Value>
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Vec>, ScaleWriter<Vec> {
            public const val DISCRIMINANT: Int = 4

            public override fun read(reader: ScaleCodecReader): Vec = Vec(
                MutableList(reader.readCompactInt()) { Value.read(reader) },
            )

            public override fun write(writer: ScaleCodecWriter, instance: Vec) {
                writer.writeCompact(instance.vec.size)
                instance.vec.forEach { value -> Value.write(writer, value) }
            }
        }
    }

    /**
     * 'Id' variant
     */
    public data class Id(
        public val idBox: IdBox
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Id>, ScaleWriter<Id> {
            public const val DISCRIMINANT: Int = 5

            public override fun read(reader: ScaleCodecReader): Id = Id(
                IdBox.read(reader),
            )

            public override fun write(writer: ScaleCodecWriter, instance: Id) {
                IdBox.write(writer, instance.idBox)
            }
        }
    }

    /**
     * 'Identifiable' variant
     */
    public data class Identifiable(
        public val identifiableBox: IdentifiableBox
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Identifiable>, ScaleWriter<Identifiable> {
            public const val DISCRIMINANT: Int = 6

            public override fun read(reader: ScaleCodecReader): Identifiable = Identifiable(
                IdentifiableBox.read(reader),
            )

            public override fun write(writer: ScaleCodecWriter, instance: Identifiable) {
                IdentifiableBox.write(writer, instance.identifiableBox)
            }
        }
    }

    /**
     * 'PublicKey' variant
     */
    public data class PublicKey(
        public val publicKey: jp.co.soramitsu.iroha2.generated.crypto.PublicKey
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<PublicKey>, ScaleWriter<PublicKey> {
            public const val DISCRIMINANT: Int = 7

            public override fun read(reader: ScaleCodecReader): PublicKey = PublicKey(
                jp.co.soramitsu.iroha2.generated.crypto.PublicKey.read(reader),
            )

            public override fun write(writer: ScaleCodecWriter, instance: PublicKey) {
                jp.co.soramitsu.iroha2.generated.crypto.PublicKey.write(writer, instance.publicKey)
            }
        }
    }

    /**
     * 'Parameter' variant
     */
    public data class Parameter(
        public val parameter: jp.co.soramitsu.iroha2.generated.datamodel.Parameter
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<Parameter>, ScaleWriter<Parameter> {
            public const val DISCRIMINANT: Int = 8

            public override fun read(reader: ScaleCodecReader): Parameter = Parameter(
                jp.co.soramitsu.iroha2.generated.datamodel.Parameter.read(reader),
            )

            public override fun write(writer: ScaleCodecWriter, instance: Parameter) {
                jp.co.soramitsu.iroha2.generated.datamodel.Parameter.write(writer, instance.parameter)
            }
        }
    }

    /**
     * 'SignatureCheckCondition' variant
     */
    public data class SignatureCheckCondition(
        public val signatureCheckCondition:
            jp.co.soramitsu.iroha2.generated.datamodel.account.SignatureCheckCondition
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<SignatureCheckCondition>,
            ScaleWriter<SignatureCheckCondition> {
            public const val DISCRIMINANT: Int = 9

            public override fun read(reader: ScaleCodecReader): SignatureCheckCondition =
                SignatureCheckCondition(
                    jp.co.soramitsu.iroha2.generated.datamodel.account.SignatureCheckCondition.read(reader),
                )

            public override fun write(writer: ScaleCodecWriter, instance: SignatureCheckCondition) {
                jp.co.soramitsu.iroha2.generated.datamodel.account.SignatureCheckCondition.write(
                    writer,
                    instance.signatureCheckCondition
                )
            }
        }
    }

    /**
     * 'TransactionValue' variant
     */
    public data class TransactionValue(
        public val transactionValue:
            jp.co.soramitsu.iroha2.generated.datamodel.transaction.TransactionValue
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<TransactionValue>, ScaleWriter<TransactionValue> {
            public const val DISCRIMINANT: Int = 10

            public override fun read(reader: ScaleCodecReader): TransactionValue = TransactionValue(
                jp.co.soramitsu.iroha2.generated.datamodel.transaction.TransactionValue.read(reader),
            )

            public override fun write(writer: ScaleCodecWriter, instance: TransactionValue) {
                jp.co.soramitsu.iroha2.generated.datamodel.transaction.TransactionValue.write(
                    writer,
                    instance.transactionValue
                )
            }
        }
    }

    /**
     * 'PermissionToken' variant
     */
    public data class PermissionToken(
        public val permissionToken:
            jp.co.soramitsu.iroha2.generated.datamodel.permissions.PermissionToken
    ) : Value() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<PermissionToken>, ScaleWriter<PermissionToken> {
            public const val DISCRIMINANT: Int = 11

            public override fun read(reader: ScaleCodecReader): PermissionToken = PermissionToken(
                jp.co.soramitsu.iroha2.generated.datamodel.permissions.PermissionToken.read(reader),
            )

            public override fun write(writer: ScaleCodecWriter, instance: PermissionToken) {
                jp.co.soramitsu.iroha2.generated.datamodel.permissions.PermissionToken.write(
                    writer,
                    instance.permissionToken
                )
            }
        }
    }

    public companion object : ScaleReader<Value>, ScaleWriter<Value> {
        public override fun read(reader: ScaleCodecReader): Value = when (
            val discriminant =
                reader.readUByte()
        ) {
            0 -> U32.read(reader)
            1 -> Bool.read(reader)
            2 -> String.read(reader)
            3 -> Fixed.read(reader)
            4 -> Vec.read(reader)
            5 -> Id.read(reader)
            6 -> Identifiable.read(reader)
            7 -> PublicKey.read(reader)
            8 -> Parameter.read(reader)
            9 -> SignatureCheckCondition.read(reader)
            10 -> TransactionValue.read(reader)
            11 -> PermissionToken.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
        }

        public override fun write(writer: ScaleCodecWriter, instance: Value) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> U32.write(writer, instance as U32)
                1 -> Bool.write(writer, instance as Bool)
                2 -> String.write(writer, instance as String)
                3 -> Fixed.write(writer, instance as Fixed)
                4 -> Vec.write(writer, instance as Vec)
                5 -> Id.write(writer, instance as Id)
                6 -> Identifiable.write(writer, instance as Identifiable)
                7 -> PublicKey.write(writer, instance as PublicKey)
                8 -> Parameter.write(writer, instance as Parameter)
                9 -> SignatureCheckCondition.write(writer, instance as SignatureCheckCondition)
                10 -> TransactionValue.write(writer, instance as TransactionValue)
                11 -> PermissionToken.write(writer, instance as PermissionToken)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
            }
        }
    }
}