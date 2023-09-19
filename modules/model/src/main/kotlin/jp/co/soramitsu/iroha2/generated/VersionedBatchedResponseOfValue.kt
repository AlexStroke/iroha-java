//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Int
import kotlin.Unit

/**
 * VersionedBatchedResponseOfValue
 *
 * Generated from 'VersionedBatchedResponseOfValue' enum
 */
public sealed class VersionedBatchedResponseOfValue : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    /**
     * 'V1' variant
     */
    public data class V1(
        public val batchedResponseOfValue: BatchedResponseOfValue,
    ) : VersionedBatchedResponseOfValue() {
        override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<jp.co.soramitsu.iroha2.generated.VersionedBatchedResponseOfValue.V1>,
            ScaleWriter<jp.co.soramitsu.iroha2.generated.VersionedBatchedResponseOfValue.V1> {
            public const val DISCRIMINANT: Int = 1

            override fun read(reader: ScaleCodecReader): jp.co.soramitsu.iroha2.generated.VersionedBatchedResponseOfValue.V1 = try {
                V1(
                    BatchedResponseOfValue.read(reader),
                )
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            override fun write(
                writer: ScaleCodecWriter,
                instance: jp.co.soramitsu.iroha2.generated.VersionedBatchedResponseOfValue.V1,
            ): Unit = try {
                BatchedResponseOfValue.write(writer, instance.batchedResponseOfValue)
            } catch (ex: Exception) {
                throw wrapException(ex)
            }
        }
    }

    public companion object :
        ScaleReader<VersionedBatchedResponseOfValue>,
        ScaleWriter<VersionedBatchedResponseOfValue> {
        override fun read(reader: ScaleCodecReader): VersionedBatchedResponseOfValue = when (
            val
            discriminant = reader.readUByte()
        ) {
            1 -> V1.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }

        override fun write(writer: ScaleCodecWriter, instance: VersionedBatchedResponseOfValue) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                1 -> V1.write(writer, instance as V1)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant") }
        }
    }
}